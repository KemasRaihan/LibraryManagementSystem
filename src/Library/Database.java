package Library;

import java.util.ArrayList;

public class Database{
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<String> emails = new ArrayList<String>();

    public void AddUser(User s){
        users.add(s);
        emails.add(s.getEmail());
    }

    public int login(String email, String password){
        int n = -1;
        for(User s : users){
            if(s.getEmail().matches(email) && s.getPassword().matches(password)){
                n = users.indexOf(s);
                break;
            }
        }
        return n;
    }

    public User getUser(int n){
        return users.get(n);
    }

    public void showAllEmails(){
        for(String email : emails){
            System.out.println(email);
        }
    }

}
