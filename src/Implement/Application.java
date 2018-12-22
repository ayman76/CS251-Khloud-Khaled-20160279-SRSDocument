package Implement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Application {
    public static void main(String[] args) {


        UserServices userServices = new UserServices();
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("\t\t\t\t\t\t\t\t\tWelcome to Found IT Program\n\n");

        while (true) {
            System.out.println("1- Login");
            System.out.println("2- SignUp");
            System.out.println("0- Exit");
            choice = input.nextInt();

            if (choice == 1) {
                String userName, password;
                input.nextLine();
                System.out.print("UserName: ");
                userName = input.nextLine();
                System.out.print("Password: ");
                password = input.nextLine();

                while(!userServices.logIn(users, userName, password))
                {
                    System.out.print("UserName: ");
                    userName = input.nextLine();
                    System.out.print("Password: ");
                    password = input.nextLine();
                }



            } else if (choice == 2) {


            } else if (choice == 0) {

            }
        }
    }
}
