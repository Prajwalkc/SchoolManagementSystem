/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.dao.impl;

import edu.lfa.sms.dao.TeacherDao;
import edu.lfa.sms.enitity.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prajwal
 */
public class TeacherDaoImpl implements TeacherDao {

    List<Teacher> tlist = new ArrayList<>();
    
    

    @Override
    public boolean insert(Teacher t) {
        return tlist.add(t);
    }

    @Override
    public List<Teacher> getall() {
        return tlist;
    }

    @Override
    public Teacher getByName(String firstname) {
        for (Teacher t : tlist) {
            if (t.getFirstname().equalsIgnoreCase(firstname)) {
                return t;
            }
        }
        return null;
    }

    /**
     *
     * @param firstname
     * @return
     */
    @Override
    public boolean delete(String firstname) {
        for (Teacher t : tlist) {
            if (t.getFirstname().equalsIgnoreCase(firstname)) {
                return tlist.remove(t);
            }

        }
        return false;

    }
}
