/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.dao;

import edu.lfa.sms.enitity.Teacher;
import java.util.List;

/**
 *
 * @author Prajwal
 */
public interface TeacherDao {
    boolean insert(Teacher t);
    List<Teacher> getall();
   boolean delete(String firstname);
    Teacher getByName(String firstname);
    
}
