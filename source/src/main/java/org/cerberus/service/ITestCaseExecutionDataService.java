/*
 * Cerberus  Copyright (C) 2013  vertigo17
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file is part of Cerberus.
 *
 * Cerberus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cerberus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cerberus.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.cerberus.service;

import org.cerberus.entity.TestCaseExecutionData;
import org.cerberus.exception.CerberusException;
import java.util.List;

/**
 *
 * @author bcivel
 */
public interface ITestCaseExecutionDataService {

    TestCaseExecutionData findTestCaseExecutionDataByKey(long id, String property);

    void insertTestCaseExecutionData(TestCaseExecutionData testCaseExecutionData) throws CerberusException;

    void updateTestCaseExecutionData(TestCaseExecutionData testCaseExecutionData) throws CerberusException;

    /**
     *
     * @param id
     * @return List of testCaseExecutionData that correspond to the Id.
     */
    List<TestCaseExecutionData> findTestCaseExecutionDataById(long id);
    
    /**
     *
     * @param id
     * @return List of TestCaseExecutionData that match the Id.
     */
    List<TestCaseExecutionData> findTestCaseExecutionDataByCriteria1(String property, String value, String controlStatus, Integer nbMinutes);
}
