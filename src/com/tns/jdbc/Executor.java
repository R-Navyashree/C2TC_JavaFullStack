package com.tns.jdbc;

public class Executor {

    public static void main(String[] args) {
        UsingStatementInterface.showEmp();
        System.out.println("----------------------------------------------");

        UsingStatementInterface.addEmployee(101, "anshu", 12345);
        UsingStatementInterface.addEmployee(102, "kiran", 12345);

        System.out.println(UsingStatementInterface.updateEmpName(102, "Neha"));
        UsingStatementInterface.updateEmpSalary(5, 65000);

        System.out.println("-------------After Updating Name and Salary------------");
        UsingStatementInterface.showEmp();

        UsingStatementInterface.deleteEmp(5);
        UsingStatementInterface.deleteEmp(101);
        // UsingStatementInterface.deleteEmp(102);

        System.out.println("-----------After Deleting --------------------");
        UsingStatementInterface.showEmp();

        // ✅ Close connection at the end
        new UsingStatementInterface().closeConnection();
    }
}