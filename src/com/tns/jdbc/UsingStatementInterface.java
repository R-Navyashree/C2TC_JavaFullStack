package com.tns.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingStatementInterface {
    static Connection cn;

    static {
        cn = DBUtil.getConnection();
    }

    // ✅ Add Employee
    public static int addEmployee(int empId, String empName, double empSalary) {
        String query = "INSERT INTO emp (id, name, salary) VALUES (?, ?, ?)";
        try (PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setInt(1, empId);
            ps.setString(2, empName);
            ps.setDouble(3, empSalary);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error...." + e.getMessage());
            return 0;
            
        }
    }

    // ✅ Validate Employee
    public static boolean validateEmp(int empId) {
        String query = "SELECT COUNT(*) FROM emp WHERE id=?";
        try (PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setInt(1, empId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error...." + e.getMessage());
        }
        return false;
    }

    // ✅ Delete Employee
    public static boolean deleteEmp(int empId) {
        if (!validateEmp(empId)) {
            System.out.println("No such Employee Record.....");
            return false;
        }
        String query = "DELETE FROM emp WHERE id=?";
        try (PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setInt(1, empId);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error...." + e.getMessage());
            return false;
        }
    }

    // ✅ Update Employee Name
    public static boolean updateEmpName(int empId, String empName) {
        if (!validateEmp(empId)) {
            System.out.println("No such Employee Record.....");
            return false;
        }
        String query = "UPDATE emp SET name=? WHERE id=?";
        try (PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, empName);
            ps.setInt(2, empId);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error...." + e.getMessage());
            return false;
        }
    }

    // ✅ Update Employee Salary
    public static boolean updateEmpSalary(int empId, double salary) {
        if (!validateEmp(empId)) {
            System.out.println("No such Employee Record.....");
            return false;
        }
        String query = "UPDATE emp SET salary=? WHERE id=?";
        try (PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setDouble(1, salary);
            ps.setInt(2, empId);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error...." + e.getMessage());
            return false;
        }
    }

    // ✅ Show Employees
    public static void showEmp() {
        String query = "SELECT * FROM emp";
        try (Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.println(rs.getInt("id") + "\t" +
                                   rs.getString("name") + "\t" +
                                   rs.getDouble("salary"));
            }
            if (!found) {
                System.out.println("No Employee Records.....");
            }
        } catch (SQLException e) {
            System.out.println("Error...." + e.getMessage());
        }
    }

    // ✅ Close Connection
    public static void closeConnection() {
        try {
            if (cn != null) cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}