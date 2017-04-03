/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.controller;

import edu.lfa.sms.dao.TeacherDao;
import edu.lfa.sms.dao.impl.TeacherDaoImpl;
import edu.lfa.sms.enitity.Teacher;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Prajwal
 */
public class TeacherController {
List<Teacher> tlist = new ArrayList<>();
    TeacherDao td = new TeacherDaoImpl();
    Scanner input = new Scanner(System.in);

    public void main() throws SQLException, ClassNotFoundException {
        while (true) {

            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Welcome to the Teacher Department!!");
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1.Add Teacher");
            System.out.println("2.Delete teacher by name");
            System.out.println("3.Show all Teacher");
            System.out.println("4.Search Teacher by name");
            System.out.println("5.Go back to Main menu");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Enter your choice(1-5");
            switch (input.nextInt()) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    delTeacher();
                    break;
                case 3:
                    showTeacher();
                    break;
                case 4:
                    searchTeacher();
                    break;
                case 5:
                    SMSController sc = new SMSController();
                    sc.main() ;
            }

        }

    }

    public void addTeacher() {

        while (true) {
            Teacher t = new Teacher();
            System.out.println("Enter the id");
            t.setId(input.nextInt());
            System.out.println("Enter the firstname");
            t.setFirstname(input.next());
            System.out.println("Enter the lastname");
            t.setLastname(input.next());
            System.out.println("Enter the subject");
            t.setSubject(input.next());

            System.out.println("Enter the address");
            t.setAddress(input.next());
            System.out.println("Enter your phone number");

            t.setPhone(input.next());
            System.out.println("Enter the status");
            t.setStatus(input.nextBoolean());
            td.insert(t);
            System.out.println("Do you want to add more?(y/n)");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {

                break;
            }

        }
    }

    public void showTeacher() {
        while (true) {
            System.out.println("Data of teacher");
            for (Teacher t : td.getall()) {

                System.out.println("+========================================================+");
                System.out.println(t);
                System.out.println("===========================================================");

            }
            System.out.println("Do you want to exit(y/n) ");
            if (input.next().equalsIgnoreCase("y")) {
                break;

            }
        }
    }

    public void delTeacher() {
        while (true) {
            System.out.println("Enter the name to be deleted");
            if (!td.delete(input.next())) {
                System.out.println("Cannot find the name");
            }
            System.out.println("Successfylly deleted");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Do you want to delete more?(y/n)");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void searchTeacher() {
        while (true) {

            System.out.println("Enter the name of the teacher to be searched");
            System.out.println(td.getByName(input.next()));
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("Do you want to search more(y/n)");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
