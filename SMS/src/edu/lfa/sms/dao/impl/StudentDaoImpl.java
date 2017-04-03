 
package edu.lfa.sms.dao.impl;

import edu.lfa.dbutil.DbConnection;
import edu.lfa.sms.dao.StudentsDao;
import edu.lfa.sms.enitity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prajwal
 */
public class StudentDaoImpl implements StudentsDao {
 
    DbConnection db = new DbConnection();
    @Override
    
    public int insert(Student t)throws SQLException,ClassNotFoundException{
      db.open();
      Student s = new Student();
        String sql = "INSERT INTO tble_student(firstname,lastname,grade,faculty,status) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, s.getSfirstname());
        stmt.setString(2, s.getSlastname());
        stmt.setString(3, s.getGrade());
        stmt.setString(4, s.getFaculty());
        stmt.setBoolean(5, s.isStatus());
       
        int result = db.executeUpdate();
        db.close();
        System.out.println("Successfully inserted--------THANK YOU---------");
        System.out.println("-----------------------------------------");
        return result;

    }

    @Override
    public List<Student> getall()throws SQLException,ClassNotFoundException {
       List<Student> slist = new ArrayList<>();
        db.open();
        String sql = "SELECT *FROM tbl_parent";
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Student s = new Student();
            s.setSfirstname(rs.getString("firstname"));
            s.setSlastname(rs.getString("lastname"));
            s.setGrade(rs.getString("grade"));
            s.setFaculty(rs.getString("faculty"));
            s.setStatus(rs.getBoolean("status"));
            slist.add(s);
        }
        db.close();
        return slist;    
    }

    @Override
    public int delete(String firstname) throws SQLException,ClassNotFoundException{
db.open();
       Student s = new Student();
        String sql;
        sql = "DELETE FROM tble_student WHERE firstname = ? ";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, firstname);
        int result = db.executeUpdate();

        db.close();

        return result;
   
    }

    @Override
    public Student getByName(String firstname) throws SQLException,ClassNotFoundException{
        
       db.open();
        String sql = "SELECT * FROM tble_student WHERE studentname=?";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, firstname);
       ResultSet rs = db.executeQuery();
         Student s = new Student();
        while (rs.next()) {
          
                   
            s.setSfirstname(rs.getString("firstname"));
            s.setSlastname(rs.getString("lastname"));
            s.setGrade(rs.getString("grade"));
            s.setFaculty(rs.getString("faculty"));
           
            s.setStatus(rs.getBoolean("status"));
  
        }
        
       db.close();        
        
return s;
    }
    
}
