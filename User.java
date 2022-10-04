/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class User {
    private final String Email;
    private final int password;
    String FirstName;
    String LastName;
    String phoneNumber;
    String city;
    
    
    public User(String fN, String lN, String e,String ph, String c, int pass){
    FirstName = fN;
    LastName = lN;
    Email = e;
    phoneNumber = ph;
    city = c;
    password = pass;
    
}
 
    
    
    public User(String Email, int password) {
        this.Email = Email;
        this.password = password;
    }

    public String getEmail() {
        return this.Email;
    }

    public boolean checkPassword(int password) {
        return (this.password == password);
    }
    public void print(){
        System.out.printf("%10s\n%10s\n%11s\n%8s\n", FirstName,LastName,phoneNumber,city);
    }
    
}


