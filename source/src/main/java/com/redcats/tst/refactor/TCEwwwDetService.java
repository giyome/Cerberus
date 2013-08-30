/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redcats.tst.refactor;


import com.redcats.tst.entity.TestCase;
import java.awt.image.BufferedImage;
import java.util.List;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bcivel
 */
@Service
public class TCEwwwDetService implements ITCEwwwDetService{

    @Autowired
    ITCEwwwDetDAO tCEwwwDetDAO;
    
    
    @Override
    public List<TestcaseExecutionwwwDet> getListOfDetail(int id) {
        return tCEwwwDetDAO.getListOfDetail(id);
    }

    @Override
    public BufferedImage getHistoricOfParameter(TestCase testcase, String parameter) {
        List<TestCaseExecutionwwwSumHistoric> historic = tCEwwwDetDAO.getHistoricForParameter(testcase, parameter);
        BufferedImage result = null;
        DefaultCategoryDataset defaultcategorydataset = new DefaultCategoryDataset();
        TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
        
        String test = testcase.getTest();
        String tc = testcase.getTestCase();
        String country = testcase.getCountryList().get(1);
        
        
               /*Create timeseries with the data*/
                String timeseriesname = parameter;
                TimeSeries timeseries = new TimeSeries(timeseriesname, Minute.class);
                
                for (TestCaseExecutionwwwSumHistoric ep : historic){
                    defaultcategorydataset.addValue(Float.valueOf(ep.getParameter()),parameter,ep.getStart());
                        if (!ep.getStart().equals("2011-01-01 00:00")){
                        String tims = ep.getStart().toString();
                        int year = Integer.valueOf(tims.substring(0, 4));
                        int month = Integer.valueOf(tims.substring(5, 7));
                        int day = Integer.valueOf(tims.substring(8, 10));
                        int hour = Integer.valueOf(tims.substring(11, 13));
                        int min = Integer.valueOf(tims.substring(14, 16));
                        float value = Float.valueOf(ep.getParameter().toString());
                        timeseries.addOrUpdate(new Minute(min, hour, day, month, year), value);
                        }
                        }
                 timeseriescollection.addSeries(timeseries);
                  
        LineChart lc = new LineChart();
        result = lc.bi(timeseriescollection, "test", parameter, 1);
        
               return result;
    }
    
    
}