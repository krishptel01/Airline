
import java.util.Scanner; 
 
public class methods extends flight{ 
    Scanner sc = new Scanner(System.in); 
     
    public void display(){ 
        System.out.println("Welcome to Airline Reservation System"); 
    } 
    public void choseoption(){ 
        while(true){ 
            System.out.println("1.Check Flight list :"); 
            System.out.println("2.Chose Fligh for info :"); 
            System.out.println("3.Ragistration here"); 
            System.out.println("4.View Ticket :"); 
            System.out.println("5.Exit !! "); 
             
            System.out.println("Enter your choise  --"); 
            int option=sc.nextInt(); 
             
            if (option == 1){ 
                displayflight();  
            } 
            else if(option == 2 ){ 
                flightinfo(); 
            } 
            else if(option == 3){ 
                ragistrationform(); 
            } 
            else if(option == 4){ 
                ticket();  
            } 
            else{ 
                System.out.println("INVILID CHOISE-----"); 
            }                               
        } 
    }    
}
