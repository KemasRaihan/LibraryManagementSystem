package Library;

public class Admin extends User {

    public Admin(String name){
        super(name);
    }

    public Admin(String name, String phonenumber, String email, String password){
        super(name, phonenumber, email, password);
    }

    @Override
    public void menu(){
        System.out.println("Admin Menu");
        System.out.println("1. View Books");
        System.out.println("2. Add Books");
        System.out.println("3. Delete Book");
        System.out.println("4. Search");
        System.out.println("5. Delete all data");
        System.out.println("6. View Orders");
        System.out.println("7. Exit");




    }
}
