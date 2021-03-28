package com.bhimraj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeOfTheWeek {

    public List<ModelEmployee> getEmployeeData() {
        List<ModelEmployee> modelEmployeeList = new ArrayList<>();
        List<ModelEmployee.EmpWeekData> modeWeekDataList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ModelEmployee modelEmployee = new ModelEmployee();
            modeWeekDataList.clear();
            for (int j = 0; j < 2; j++) {
                ModelEmployee.EmpWeekData modelWeekData = new ModelEmployee.EmpWeekData();
                modelWeekData.setWeekNo(j + 1);
                modelWeekData.setDayTaskCompleted(Utils.getRandomNumber(1, 10));
                modelWeekData.setDayWorkedHours(Utils.getRandomNumber(1, 10));
                modelWeekData.setIssueSolved(Utils.getRandomNumber(1, 10));
                modelWeekData.setOvertimeHours(Utils.getRandomNumber(1, 3));
                modelWeekData.setPerformance(modelWeekData.getDayTaskCompleted() + modelWeekData.getOvertimeHours() + modelWeekData.getIssueSolved() + modelWeekData.getDayWorkedHours());
                modeWeekDataList.add(modelWeekData);
            }
            modelEmployee.setEmpId(i + 1);
            modelEmployee.setEmpName("EmpName" + i + 1);
            modelEmployee.setEmpWeekDataList(modeWeekDataList);
            modelEmployeeList.add(modelEmployee);
        }
        return modelEmployeeList;
    }

    public void printEmpDetails(List<ModelEmployee> modelEmployeeList) {
        for (ModelEmployee modelEmployee : modelEmployeeList) {
            System.out.println("Emp Id = " + modelEmployee.getEmpId());
            System.out.println("Emp Name = " + modelEmployee.getEmpName());
            System.out.println();
            System.out.println();
            for (ModelEmployee.EmpWeekData empWeekData : modelEmployee.getEmpWeekDataList()) {
                System.out.println("Emp week no = " + empWeekData.getWeekNo());
                System.out.println("Emp hours worked = " + empWeekData.getDayWorkedHours());
                System.out.println("Emp Task Completed = " + empWeekData.getDayTaskCompleted());
                System.out.println("Emp issue resolved = " + empWeekData.getIssueSolved());
                System.out.println("Emp overtime Hours = " + empWeekData.getOvertimeHours());
                System.out.println("Emp Performance = " + empWeekData.getPerformance());
                System.out.println();
            }
            System.out.println();
        }
    }

    public int getEmployeeOfWeek(List<ModelEmployee> modelEmployeeList) {
        List<Integer> performanceList = new ArrayList<>();
        for (ModelEmployee modelEmployee : modelEmployeeList) {
            int data = 0;
            for (ModelEmployee.EmpWeekData empWeekData : modelEmployee.getEmpWeekDataList()) {
                data += empWeekData.getPerformance();
            }
            performanceList.add(data);
        }
        Collections.sort(performanceList);

        return performanceList.get(performanceList.size() - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Details");
        List<ModelEmployee> modelEmployeeList = new ArrayList<>();
        EmployeeOfTheWeek employee = new EmployeeOfTheWeek();
        modelEmployeeList = employee.getEmployeeData(); //to set and get employee details
        employee.printEmpDetails(modelEmployeeList); // to print employee data
        System.out.println("Employee Of Week is= " + employee.getEmployeeOfWeek(modelEmployeeList));
    }
}
