package edu.lfa.sms.controller;

import edu.lfa.sms.dao.ParentsDao;
import edu.lfa.sms.dao.impl.ParentsDaoImpl;
import edu.lfa.sms.enitity.Parents;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Prajwal
 */
public class ParentsController {

    ParentsDao pd = new ParentsDaoImpl();
    Scanner input = new Scanner(System.in);

    public void main() throws SQLException, ClassNotFoundException {
        while (true) {

            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Welcome to the Parents Department!!");
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1.Add Parent");
            System.out.println("2.Delete Parent by name");
            System.out.println("3.Show all Parent Details");
            System.out.println("4.Search Parent by Child/Student name");
            System.out.println("5.Go back to Main menu");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Enter your choice(1-5");
            switch (input.nextInt()) {
                case 1:
                    addParent();
                    break;
                case 2:
                    delParent();
                    break;
                case 3:
                    showParents();
                    break;
                case 4:
                    searchParent();
                    break;
                case 5:
                    SMSController sc = new SMSController();
                    sc.main();
            }

        }

    }

    public void addParent() throws SQLException, ClassNotFoundException {

        while (true) {
            Parents t = new Parents();
            System.out.println("Enter the firstname");
            t.setFirstname(input.next());
            System.out.println("Enter the lastname");
            t.setLastname(input.next());
            System.out.println("Enter the name of the student/child");
            t.setStudentname(input.next());
            System.out.println("Enter your phone number");

            t.setPhone(input.next());
            System.out.println("Enter the address");
            t.setAddress(input.next());

            System.out.println("Enter the status");
            t.setStatus(input.nextBoolean());
            pd.insert(t);
            
                      System.out.println("Do you want to add more?(y/n)");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {

                break;
            }

        }
    }

    public void showParents() throws SQLException, ClassNotFoundException {
        while (true) {
            System.out.println("Data of Parents");
            for (Parents t : pd.getall()) {

                System.out.println("+======================================================================================================+");
                System.out.println(t);
                System.out.println("========================================================================================================");

            }
            System.out.println("Do you want to exit(y/n) ");
            if (input.next().equalsIgnoreCase("y")) {
                break;

            }
        }
    }

    public void delParent() throws SQLException, ClassNotFoundException {
        while (true) {
            System.out.println("Enter the name to be deleted");
          int check=  pd.delete(input.next());
                        
            System.out.println("Successfylly Processed");
            System.out.println("++++++++++++++++++++++++");
                        
            System.out.println("Do you want to delete more?(y/n)");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void searchParent() throws SQLException, ClassNotFoundException {
        while (true) {

            System.out.println("Enter the name of the child of parent to be searched");
            System.out.println(pd.getByName(input.next())+"\r\n");
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("Do you want to search more(y/n)");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

}
