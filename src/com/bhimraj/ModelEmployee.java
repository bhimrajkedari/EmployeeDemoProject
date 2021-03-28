package com.bhimraj;

import java.util.List;

public class ModelEmployee {

    String empName;
    int empId;
    public List<EmpWeekData> empWeekDataList;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public List<EmpWeekData> getEmpWeekDataList() {
        return empWeekDataList;
    }

    public void setEmpWeekDataList(List<EmpWeekData> empWeekDataList) {
        this.empWeekDataList = empWeekDataList;
    }

    public static class EmpWeekData {
        int weekNo;
        int dayWorkedHours;
        int dayTaskCompleted;
        int issueSolved;
        int overtimeHours;
        int performance;

        public int getWeekNo() {
            return weekNo;
        }

        public int getPerformance() {
            return performance;
        }

        public void setPerformance(int performance) {
            this.performance = performance;
        }

        public void setWeekNo(int weekNo) {
            this.weekNo = weekNo;
        }

        public int getDayWorkedHours() {
            return dayWorkedHours;
        }

        public void setDayWorkedHours(int dayWorkedHours) {
            this.dayWorkedHours = dayWorkedHours;
        }

        public int getDayTaskCompleted() {
            return dayTaskCompleted;
        }

        public void setDayTaskCompleted(int dayTaskCompleted) {
            this.dayTaskCompleted = dayTaskCompleted;
        }

        public int getIssueSolved() {
            return issueSolved;
        }

        public void setIssueSolved(int issueSolved) {
            this.issueSolved = issueSolved;
        }

        public int getOvertimeHours() {
            return overtimeHours;
        }

        public void setOvertimeHours(int overtimeHours) {
            this.overtimeHours = overtimeHours;
        }
    }
}
