/* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
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
package org.cerberus.entity;

import java.util.List;

/**
 * @author bcivel
 */
public class TestCaseStepExecution {

    private long id;
    private String test;
    private String testCase;
    private int step;
    private String batNumExe;
    private long start;
    private long end;
    private long fullStart;
    private long fullEnd;
    private long timeElapsed;
    private String returnCode;
    /**
     * From here are data outside database model.
     */
    private TestCaseStep testCaseStep;
    private TCExecution tCExecution;
    private List<TestCaseExecutionData> testCaseExecutionDataList; // Host the list of data calculated during the step execution.
    private MessageEvent stepResultMessage;
    private MessageGeneral executionResultMessage;
    private boolean stopExecution;

    public List<TestCaseExecutionData> getTestCaseExecutionDataList() {
        return testCaseExecutionDataList;
    }

    public void setTestCaseExecutionDataList(List<TestCaseExecutionData> testCaseExecutionDataList) {
        this.testCaseExecutionDataList = testCaseExecutionDataList;
    }

    public MessageEvent getStepResultMessage() {
        return stepResultMessage;
    }

    public void setStepResultMessage(MessageEvent stepResultMessage) {
        this.stepResultMessage = stepResultMessage;
        if (stepResultMessage != null) {
            this.setReturnCode(stepResultMessage.getCodeString());
        }
    }

    public MessageGeneral getExecutionResultMessage() {
        return executionResultMessage;
    }

    public void setExecutionResultMessage(MessageGeneral executionResultMessage) {
        this.executionResultMessage = executionResultMessage;
    }

    public boolean isStopExecution() {
        return stopExecution;
    }

    public void setStopExecution(boolean stopExecution) {
        this.stopExecution = stopExecution;
    }

    public TCExecution gettCExecution() {
        return tCExecution;
    }

    public void settCExecution(TCExecution tCExecution) {
        this.tCExecution = tCExecution;
    }

    public TestCaseStep getTestCaseStep() {
        return testCaseStep;
    }

    public void setTestCaseStep(TestCaseStep testCaseStep) {
        this.testCaseStep = testCaseStep;
    }

    public String getBatNumExe() {
        return batNumExe;
    }

    public void setBatNumExe(String batNumExe) {
        this.batNumExe = batNumExe;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public long getFullEnd() {
        return fullEnd;
    }

    public void setFullEnd(long fullEnd) {
        this.fullEnd = fullEnd;
    }

    public long getFullStart() {
        return fullStart;
    }

    public void setFullStart(long fullStart) {
        this.fullStart = fullStart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTestCase() {
        return testCase;
    }

    public void setTestCase(String testCase) {
        this.testCase = testCase;
    }

    public long getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }
}