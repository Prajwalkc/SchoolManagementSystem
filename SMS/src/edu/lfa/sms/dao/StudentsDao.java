/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.dao;


import edu.lfa.sms.enitity.Student;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Prajwal
 */
public interface StudentsDao {
     int insert(Student t)throws SQLException,ClassNotFoundException;
    List<Student> getall()throws SQLException,ClassNotFoundException;
    int delete(String firstname)throws SQLException,ClassNotFoundException;
    Student getByName(String firstname)throws SQLException,ClassNotFoundException;
}
