package Implement;

import java.util.Vector;

public class UserServices {
    public void signUp(Vector<User> users, String userName, String password, String name, int age, String location, String gender, String email, String phoneNum)
    {
        User newUser = new User();

        newUser.setName(name);
        newUser.setAge(age);
        newUser.setLocation(location);
        newUser.setGender(gender);
        newUser.setEmail(email);
        newUser.setPhoneNum(phoneNum);
        newUser.setUserName(userName);
        newUser.setPassword(password);
        users.add(newUser);
        System.out.println("Successful SignUp");
    }

    public boolean logIn(Vector<User>users ,String userName, String Password)
    {
        for(int i = 0; i < users.size(); i++)
        {
            if(users.elementAt(i).getUserName().equals(userName) && users.elementAt(i).getPassword().equals(Password))
            {
                System.out.println("Successful Login");
                return true;
            }
        }
        System.out.println("User Not Found");
        return false;

    }

    public boolean logOut()
    {
        System.out.println("User is logged Out");
        return false;
    }

    public boolean checkEmail(Vector<User>users ,String email)
    {
        for(int i = 0; i < users.size(); i++)
        {
            if(users.elementAt(i).getEmail().equals(email)) {
                System.out.println("Email is Found Please Change it");
                return false;
            }
        }
        return true;

    }

    public boolean checkPhoneNumber(Vector<User>users ,String phoneNum)
    {
        for(int i = 0; i < users.size(); i++)
        {
            if(users.elementAt(i).getPhoneNum().equals(phoneNum)) {
                System.out.println("Phone Number is Found Please Change it");
                return false;
            }
        }
        return true;

    }

    public boolean checkUserName(Vector<User>users ,String userName)
    {
        for(int i = 0; i < users.size(); i++)
        {
            if(users.elementAt(i).getUserName().equals(userName)) {
                System.out.println("Username is Found Please Change it");
                return false;
            }
        }
        return true;

    }

    public boolean checkPassword(String Password)
    {
        if(Password.length() < 8)
        {
            System.out.println("Passwords must have at least 8 characters and contain at least two of the following: uppercase letters, lowercase letters, numbers, and symbols.");
            return false;
        }
        else
            return true;
    }

    public void sendVerification(String email)
    {
        System.out.println("Verification Sent to "+ email + " Please Check It");
    }
}
