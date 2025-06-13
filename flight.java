
import java.util.Scanner; 
import java.io.FileNotFoundException; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.time.LocalDate; 
import java.time.LocalTime; 
 
class inputmethod{ 
     
    protected String name; 
    protected String email; 
    protected String address; 
    protected Long mobileno; 
    protected int age; 
     
    
 
    Scanner scc = new Scanner(System.in); 
     
        final long length = 1000000000; 
 
        public void input(){ 
 
            while(true){ 
                try{ 
                     
                    System.out.println("Enter your fullname"); 
                     
                    name=scc.nextLine();  
                    System.out.println(""); 
 
                    System.out.println("Enter your mobile no"); 
                    mobileno=scc.nextLong(); 
                    if(mobileno < length){ 
                        System.out.println("mobile no is wrong "); 
                        break; 
                    } 
                    System.out.println(""); 
                     
                    scc.nextLine(); 
                    System.out.println("Enter your email"); 
                    email=scc.nextLine(); 
                    System.out.println(""); 
                     
                     
                    System.out.println("Enter your age"); 
                    age=scc.nextInt(); 
                    System.out.println(""); 
 
                     
                    scc.nextLine(); 
                    System.out.println("Enter your address"); 
                    address=scc.nextLine(); 
                    System.out.println(""); 
                break; 
                } 
 
                catch(Exception e) { 
                    System.err.println("enter valid input "); 
 
                } 
 
            } 
             
        } 
 
     
 
 
    public void selectflight1(){ 
 
        System.out.println("WELCOME TO FLIGHT MUMBAI TO DELHI "); 
        System.out.println("Destination is :- 1447 KM "); 
        System.out.println("Price is :-7000 "); 
        System.out.println("Reaching time is 2 Hours 10 Minutes"); 
    } 
 
    public void selectflight2(){ 
        System.out.println("WELCOME TO FLIGHT SURAT TO RAJKOT "); 
        System.out.println("Destination is :- 434 KM "); 
        System.out.println("Price is :- 3000"); 
        System.out.println("Reaching time is 1 Hours "); 
    } 
 
    public void selectflight3(){ 
        System.out.println("WELCOME TO FLIGHT AHEMDABAD TO AYODHIYA"); 
        System.out.println("Destination is :- 2000 KM "); 
        System.out.println("Price is :-10000 "); 
        System.out.println("Reaching time is 4 Hours 5 Minutes"); 
 
    } 
    public void selectflight4(){ 
 
        System.out.println("WELCOME TO FLIGHT BANGLORE TO DUBAI"); 
        System.out.println("Destination is :- 3000 KM "); 
        System.out.println("Price is :- 70000 "); 
        System.out.println("Reaching time is 9 Hours 50 Minutes"); 
    } 
    public void selectflight5(){ 
        System.out.println("WELCOME TO FLIGHT DELHI TO AMERICA"); 
        System.out.println("Destination is :- 2500 KM "); 
        System.out.println("Price is :-50000"); 
        System.out.println("Reaching time is 7 Hours 40 Minutes"); 
    } 
 
    public void selectflight6(){ 
        System.out.println("WELCOME TO FLIGHT RAJKOT TO CANNNEDA "); 
        System.out.println("Destination is :- 8000 KM "); 
        System.out.println("Price is :-100000 "); 
        System.out.println("Reaching time is 12 Hours 10 Minutes"); 
    } 
} 
 
 
public class flight extends inputmethod { 
    
     Scanner sc = new Scanner(System.in); 
     int choose; 
      
     
    public void displayflight(){ 
        System.out.println("1.MUMBAI TO DELHI "); 
        System.out.println("2.SURAT TO RAJKOT"); 
        System.out.println("3.AHEMDABAD TO AYODHIYA"); 
        System.out.println("4.BANGLORE TO DUBAI"); 
        System.out.println("5.DELHI TO AMERICA"); 
        System.out.println("6.RAJKOT TO CANNEDA"); 
        
        System.out.println("_______________________________________________________________"); 
    } 
     
    public void flightinfo(){ 
        System.out.println("Enter your choise you can get info of flight"); 
        int option=sc.nextInt(); 
         
        if(option == 1){ 
            selectflight1(); 
            
        System.out.println("_______________________________________________________________"); 
        } 
        else if(option == 2){ 
            selectflight2(); 
            
        System.out.println("_______________________________________________________________"); 
        } 
        else if(option == 3){ 
            selectflight3(); 
            
        System.out.println("_______________________________________________________________"); 
        } 
        else if(option == 4){ 
            selectflight4(); 
            
        System.out.println("_______________________________________________________________"); 
        } 
        else if(option == 5){ 
            selectflight5(); 
            
        System.out.println("______________________________________________________________ "); 
        } 
        else if(option == 6){ 
            selectflight6(); 
            
        System.out.println("_______________________________________________________________"); 
        } 
        else{ 
            System.out.println("Invalid choise "); 
        } 
         
    } 
 
     
     
    public void ragistrationform(){ 
        Scanner scc = new Scanner(System.in); 
 
        super.name=name; 
        super.email=email; 
        super.address=address; 
        super.mobileno=mobileno; 
        super.age=age; 
         
        System.out.println("Enter Flight Number"); 
        choose = scc.nextInt(); 
        while(true){ 
             
            if (choose ==1){ 
                System.out.println("SELECTED FLIGHT :- MUMBAI TO DELHI "); 
            } 
            else if(choose == 2){ 
               System.out.println("SELECTED FLIGHT :- SURAT TO RAJKOT "); 
            } 
            else if(choose == 3){ 
                System.out.println("SELECTED FLIGHT :- AHEMDABAD TO AYODHIYA "); 
            } 
            else if(choose == 4){ 
                System.out.println("SELECTED FLIGHT :- BANGLORE TO DUBAI"); 
            } 
            else if(choose == 5){ 
                System.out.println("SELECTED FLIGHT :- DELHI TO AMERICA "); 
            } 
            else if(choose == 6){ 
                System.out.println("SELECTED FLIGHT :- RAJKOT TO CANNEDA "); 
            } 
            else{ 
                System.out.println("SELECTED FLIGHT NO IS NOT FOUND"); 
                break; 
            } 
             
              
        input(); 
        System.out.println(" "); 
        System.out.println("Ragistration Successfully Complated.."); 
        break; 
        } 
    } 
     
     
   public void ticket(){ 
        FileWriter fw=null ; 
         LocalDate o1 = LocalDate.now(); 
         LocalTime t1 = LocalTime.now(); 
 
       
        System.out.println("_______________________________________________________________"); 
       System.out.println("DATE---" + o1 +  " TIME ---" + t1 ); 
       switch (this.choose) 
       { 
        case 1 : 
            selectflight1(); 
            break; 
        case 2: 
            selectflight2(); 
            break; 
        case 3: 
            selectflight3(); 
            break; 
        case 4: 
            selectflight4(); 
            break; 
        case 5: 
            selectflight5(); 
            break; 
        case 6: 
            selectflight6(); 
        default :
            System.out.println(""); 
 
       } 
 
       System.out.println("NAME :-" + name); 
       System.out.println("EMAIL :-" + email); 
       System.out.println("ADDRESS :-" + address); 
       System.out.println("MOBILE NO:-" + mobileno); 
       System.out.println("AGE :-" + age); 
       System.out.println("                    .....VERIFYD BY AIRLINE CORPORATION ....."); 
       
       System.out.println("_______________________________________________________________"); 
 
       try{ 
            String str1 = Long.toString(mobileno); 
            String str2 = Integer.toString(age); 
            fw = new FileWriter ("f:\\m1\\ticket.txt",true); 
            fw.write("\nname : " + name); 
            fw.write("\nemail : " + email); 
            fw.write("\naddress : " +address); 
            fw.write("\nmobile no :" + str1); 
            fw.write("\nage :" + str2); 
 
       }catch(FileNotFoundException e){ 
            System.out.println(e); 
       } 
        catch(IOException e){ 
                System.out.println(e); 
         
 
       }finally{ 
            try{ 
                fw.close(); 
            }catch(IOException e){ 
                System.out.println(e); 
            } 
             
       } 
       
   } 
}