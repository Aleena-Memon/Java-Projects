package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email{
         private String firstName;
         private String lastName;
         private String email;
         private String password;
         private int defaultPasswordLength=10;
         private String department;
         private int mailboxCapacity = 500;
         private String alternativeEmail;
         private String sufix = "alen.com";
   
   // constructor to receive FName and LName
   public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("email created "+ this.firstName+" "+this.lastName);

    // call the department function here
       this.department = setDepartment();
       System.out.println("Department : "+ this.department);

    // call the randomPassword function here
       this.password = randomPassword(defaultPasswordLength);
       System.out.println("your Password is : " + this.password);

    // combine all elements to form email address
        email = firstName.toLowerCase() +"."+lastName.toLowerCase()+"@"+department+"."+sufix;
       System.out.println("Your email is :" + email);
   }

    private String setDepartment(){
       System.out.println("Choose Departments: \n1 Sales \n2 Development \n3 Accounting \n0 None");
        Scanner sc = new Scanner(System.in);
        int deptNo = sc.nextInt();
        if(deptNo==1){
            return "sales";
        }
        else if(deptNo==2){
            return "dev";
        }
        else if (deptNo==3){
            return "acct";
        }
        else{
            return "";
        }

    }

    private String randomPassword(int length){
       String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
       char[]  password = new char[length];
       for(int i=0; i<length; i++){
          int rand = (int)(Math.random()*passwordSet.length());
          password[i] = passwordSet.charAt(rand);
       }
       return new String(password);
    }

    // set capacity of mails
    public void setCapacity(int capacity){
       this.mailboxCapacity = capacity;
    }

    public void setAlternativeEmail(String altEmail){
       this.alternativeEmail= altEmail;
    }


    public void changePassword(String password){
       this.password = password;
    }
    public String getAlternativeEmail(){
       return alternativeEmail;
    }
    public String getPassword(){
       return password;
    }
    public int getCapacity(){
       return mailboxCapacity;
    }

    // show Info method
    public String showInfo(){
       return "Display name: " + firstName + " " + lastName +"\n" + "Email: " + email + "\n MailCapacity : "+ mailboxCapacity + "mb";
    }
   
}


