package emailapp;
public class EmailApp {

    public static void main(String[] Args) {
        Email eml1 = new Email("Aleena", "Memon");

//        eml1.setAlternativeEmail("aleena.azaam@dev.alen.com");
//        System.out.println("Alternative email is: " + eml1.getAlternativeEmail());

        System.out.println("Information \n"+ eml1.showInfo());
        
    }
    
}
