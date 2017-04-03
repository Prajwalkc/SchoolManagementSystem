/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.sms.controller;

import edu.lfa.sms.dao.StudentsDao;
import edu.lfa.sms.dao.impl.StudentDaoImpl;
import edu.lfa.sms.enitity.Student;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Prajwal
 */
public class StudentController {
    StudentsDao sd = new StudentDaoImpl();
    Scanner input = new Scanner(System.in);

    public void main() throws SQLException, ClassNotFoundException {
        while (true) {

            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Welcome to the Student Department!!");
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1.Add Student");
            System.out.println("2.Delete Student by name");
            System.out.println("3.Show all Student");
            System.out.println("4.Search Student by name");
            System.out.println("5.Go back to Main menu");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Enter your choice(1-5");
            switch (input.nextInt()) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    delStudent();
                    break;
                case 3:
                    showStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    SMSController sc = new SMSController();
                    sc.main();
            }

        }

    }

    public void addStudent() throws SQLException, ClassNotFoundException {

        while (true) {
            Student s = new Student();
            System.out.println("Enter the id");
            s.setId(input.nextInt());
            System.out.println("Enter the firstname");
            s.setSfirstname(input.next());
            System.out.println("Enter the lastname");
            s.setSlastname(input.next());
            System.out.println("Enter the grade");
            s.setGrade(input.next());

            System.out.println("Enter the faculty");
            s.setFaculty(input.next());
            
            System.out.println("Enter the status");
            s.setStatus(input.nextBoolean());
            sd.insert(s);
            System.out.println("Do you want to add more?(y/n)");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {

                break;
            }

        }
    }

    public void showStudent() throws SQLException, ClassNotFoundException {
        while (true) {
            System.out.println("Data of Student");
            for (Student s : sd.getall()) {

                System.out.println("+========================================================+");
                System.out.println(s);
                System.out.println("===========================================================");

            }
            System.out.println("Do you want to exit(y/n) ");
            if (input.next().equalsIgnoreCase("y")) {
                break;

            }
        }
    }

    public void delStudent() throws SQLException, ClassNotFoundException {
        while (true) {
            System.out.println("Enter the name to be deleted");
            if (sd.delete(input.next())==-1) {
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

    public void searchStudent() throws SQLException, ClassNotFoundException {
        while (true) {

            System.out.println("Enter the name of the teacher to be searched");
            System.out.println(sd.getByName(input.next()));
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("Do you want to search more(y/n)");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
