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
        Vector<User> users = new Vector<>();
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

                while (!userServices.logIn(users, userName, password)) {
                    System.out.print("UserName: ");
                    userName = input.nextLine();
                    System.out.print("Password: ");
                    password = input.nextLine();
                }


            } else if (choice == 2) {
                String userName, password, name, location, gender, email, phoneNum;
                int age;
                input.nextLine();
                System.out.print("Name: ");
                name = input.nextLine();
                System.out.print("Age: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Location: ");
                location = input.nextLine();
                System.out.print("Gender: ");
                gender = input.nextLine();
                System.out.print("Email: ");
                email = input.nextLine();
                while (!userServices.checkEmail(users, email)) {
                    System.out.print("email: ");
                    email = input.nextLine();
                }
                System.out.print("Phone Number: ");
                phoneNum = input.nextLine();
                while (!userServices.checkPhoneNumber(users, phoneNum)) {
                    System.out.print("Phone Number: ");
                    phoneNum = input.nextLine();
                }
                System.out.print("UserName: ");
                userName = input.nextLine();
                while (!userServices.checkUserName(users, userName)) {
                    System.out.print("UserName: ");
                    userName = input.nextLine();
                }
                System.out.print("Password: ");
                password = input.nextLine();
                while (!userServices.checkPassword(password)) {
                    System.out.print("Password: ");
                    password = input.nextLine();
                }


                String info = ("Name:" + name + "|Age:" + age + "|Locaion:" + location + "|Gender:" + gender + "|Email:" +
                        email + "|Phone Number: " + phoneNum + "|UserName:" + userName + "|Password:" + password + "|\n");
                System.out.println(info);
//                for (int i = 0; i < password.length(); i++)
//                    System.out.print("*");
                try (FileWriter usersToFile = new FileWriter("User.txt", true)) {
                    usersToFile.write(info);

                    usersToFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println();
                userServices.signUp(users, userName, password, name, age, location, gender, email, phoneNum);

            } else if (choice == 0) {
                System.out.println("Thanks for Using Found IT Program :)");
                break;
            }
        }
    }
}
