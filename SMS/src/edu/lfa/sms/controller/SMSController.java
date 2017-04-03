/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.controller;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Prajwal
 */
public class SMSController {

    public void main() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("=====================================================");
            System.out.println("Welcome to the School Management System");
            System.out.println("=====================================================");
            System.out.println("1.Teacher Department");
            System.out.println("2.Student Department");
            System.out.println("3.Parents Department");
            System.out.println("4.Exit");
            System.out.println("***************************************************");
            System.out.println("Choose your required choice[1-4]");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    TeacherController tc = new TeacherController();
                    tc.main();
                    break;
                case 2:
                    StudentController sc = new StudentController();
                    sc.main();
                    break;
                case 3:
                   ParentsController pc = new ParentsController();
                    pc.main();
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }
}
