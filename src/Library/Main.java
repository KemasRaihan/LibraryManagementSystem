package Library;

import java.util.Scanner;

public class Main {

    static Scanner s;
    static Database database;
    public static void main(String[] args) {

        database = new Database();
        int num;
        System.out.println("Welcome to Library Management System!");
        // Display Menu
        do {
            System.out.println("1. Login\n2. New User\n0. Quit");

            s = new Scanner(System.in);
            num = s.nextInt();
            switch (num) {
                case 1:
                    login();
                    break;
                case 2:
                    newuser();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error! Please Try Again!");
            }
        }while(num!=0);
    }

    private static void login(){
        System.out.println("Enter email address");
        String email = s.next();
        System.out.println("Enter password");
        String password = s.next();
        int n = database.login(email, password);
        if(n!=-1){
            User user = database.getUser(n);
            System.out.println("Welcome " + user.getName() + "!");
            user.menu();
        }else{
            System.out.println("User does not exist!");
        }
    }
    private static void newuser(){
        System.out.println("Enter your name");
        String name = s.next();
        System.out.println("Enter your phone number");
        String phonenumber = s.next();
        System.out.println("Enter email address");
        String email = s.next();
        System.out.println("Enter password");
        String password = s.next();
        System.out.println("1. Admin\n2. Normal User");
        int n2 = s.nextInt();
        User user;
        if(n2==1){
            user = new Admin(name, phonenumber, email, password);
        }else{
            user = new NormalUser(name, phonenumber, email, password);
        }
        database.AddUser(user);
        System.out.println("User Created Successfully!");
    }



}