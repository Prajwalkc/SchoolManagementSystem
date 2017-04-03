/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.dao.impl;

import edu.lfa.dbutil.DbConnection;
import edu.lfa.sms.dao.ParentsDao;
import edu.lfa.sms.enitity.Parents;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prajwal
 */
public class ParentsDaoImpl implements ParentsDao {

    DbConnection db = new DbConnection();

    @Override
    public int insert(Parents t) throws SQLException, ClassNotFoundException {
        db.open();
        String sql = "INSERT INTO tbl_parent(firstname,lastname,studentname,phone,address,status) VALUES(?,?,?,?,?,?)";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, t.getFirstname());
        stmt.setString(2, t.getLastname());
        stmt.setString(3, t.getStudentname());
        stmt.setString(4, t.getPhone());
        stmt.setString(5, t.getAddress());
        stmt.setBoolean(6, t.isStatus());
        int result = db.executeUpdate();
        db.close();
        System.out.println("Successfully inserted--------THANK YOU---------");
        System.out.println("-----------------------------------------");
        return result;

    }

    @Override
    public List<Parents> getall() throws SQLException, ClassNotFoundException {
        List<Parents> plist = new ArrayList<>();
        db.open();
        String sql = "SELECT *FROM tbl_parent";
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Parents p = new Parents();
            p.setFirstname(rs.getString("firstname"));
            p.setLastname(rs.getString("lastname"));
            p.setStudentname(rs.getString("studentname"));
            p.setPhone(rs.getString("phone"));
            p.setAddress(rs.getString("address"));
            p.setStatus(rs.getBoolean("status"));
            plist.add(p);
        }
        db.close();
        return plist;
    }

    @Override
    public int delete(String firstname) throws SQLException, ClassNotFoundException {

        db.open();
        Parents t = new Parents();
        String sql;
        sql = "DELETE FROM tbl_parent WHERE firstname = ? ";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, firstname);
        int result = db.executeUpdate();

        db.close();

        return result;
    }

    @Override
    
    public Parents getByName(String firstname) throws SQLException, ClassNotFoundException {
//    List<Parents> plist = new ArrayList<>();
        db.open();
        String sql = "SELECT * FROM tbl_parent WHERE studentname=?";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, firstname);
       ResultSet rs = db.executeQuery();
         Parents p = new Parents();
        while (rs.next()) {
          
                   
            p.setFirstname(rs.getString("firstname"));
            p.setLastname(rs.getString("lastname"));
            p.setStudentname(rs.getString("studentname"));
            p.setPhone(rs.getString("phone"));
            p.setAddress(rs.getString("address"));
            p.setStatus(rs.getBoolean("status"));
  
        }
        
       db.close();        
        
return p;
    }

}
