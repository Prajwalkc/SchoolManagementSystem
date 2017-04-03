/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms;


import edu.lfa.sms.controller.SMSController;
import java.sql.SQLException;


/**
 *
 * @author Prajwal
 */
public class Program {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
 
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SMSController sc = new SMSController();
        sc.main();
    }
    
}