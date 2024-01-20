import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses ="";
    private int tuitionBalance;
    private int costOfCourse = 700;
    private static int id = 1000;


    // Constructor: prompt user to enter student's name and year
   public Student(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Student's First Name: ");
       this.firstName = sc.nextLine();

       System.out.println("Enter Student's Last Name: ");
       this.lastName = sc.nextLine();

       System.out.println(" 1 : Freshers \n 2: Sophmore \n 3: Junior \n 4: Senior \n Enter Student's Year: ");
       this.gradeYear = sc.nextInt();
        setStudentId();
       System.out.println(firstName +" "+lastName+" "+gradeYear+" "+ studentID);

   }
    // Generate ID
    private void setStudentId(){
       //gradeYear + static Id
        id++;
        this.studentID= gradeYear+""+id;
    }

    // Enroll in courses
    public void enroll(){
       do {
           System.out.println("Enter courses to enroll (Q to quit): ");
           Scanner sc = new Scanner(System.in);
           String course = sc.nextLine();
           if (!course.equals("Q")) {
               courses = courses +"\n"+ course;
               tuitionBalance = costOfCourse + tuitionBalance;
           } else {
               System.out.println("Break");
               break;
           }
       }while(true);
       System.out.println("Enrolled in courses: "+courses);

    }

    // View Balance
    public void viewBalance(){
       System.out.println("Total Balance: "+ tuitionBalance);
    }

    // Pay Tuition
    public void payTuition(){
       viewBalance();
       System.out.print("Enter your Payment: ");
       Scanner sc = new Scanner(System.in);
       int payment = sc.nextInt();
       tuitionBalance = tuitionBalance-payment;
       System.out.println("Thankyou for your payment: "+ payment);
       viewBalance();
    }

    // Show status
    public String showInfo(){
       return "Name: "+ firstName +" "+lastName+
               "\nCourses: " + courses +
               "\nBalance: " + tuitionBalance;
    }
}
