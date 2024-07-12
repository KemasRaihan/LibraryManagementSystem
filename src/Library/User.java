package Library;

public abstract class User {
    private String name;
    private String phonenumber;
    private String email;

    private String password;

    public User(){}

    public User(String name){
        this.name=name;
    }

    public User(String name, String phonenumber, String email, String password){
        this.name=name;
        this.phonenumber=phonenumber;
        this.email=email;
        this.password=password;

    }

    public String getName(){
        return name;
    }


    public String getPhoneNumber(){
        return phonenumber;
    }

    public String getEmail(){
        return email;
    }


    public String getPassword(){
        return password;
    }

    abstract public void menu();
}
