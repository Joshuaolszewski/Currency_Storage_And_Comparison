//Joshua Olszewski 
//This is a Currency Simulator 
import java.util.Scanner;
import java.math.BigDecimal;

public class CurrencyManager
{
    /* main method creates a menu to run the wallet
           Precondition: none 
           Postcondition: none
           return: void
           
           PseudoCode: 1) create wallet
                       2) while exit = false
                            print menu and scan for input 
                            1)if input is add
                                1)ask for usd or c2d 
                                    1) if usd 
                                        1)parse input and create usd object and add to wallet using method 
                                    2) if c2d
                                        1) parse input and create c2d and add to wallet using method
                            2)if input is subtract
                                1)ask for usd or c2d 
                                    1) if usd 
                                        1)parse input and create usd object and subtract from wallet using method 
                                    2) if c2d
                                        1) parse input and create c2d and subtract from wallet using method 
                            3)if input is compare
                                1) wallet compare method 
                            4)if input is exit 
                                1) exit = true 
           
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        Wallet wallet = new Wallet();
        
        boolean exit = false; 
        
        while(exit == false)
        {
            System.out.println(wallet.printValueZero());
            System.out.println(wallet.printValueOne());
            System.out.println("");
            System.out.println("Add Currency:                  Type add");
            System.out.println("Subtract Currency:             Type subtract");
            System.out.println("Compare USD and C2D in wallet: Type compare");
            //System.out.println("Print Wallet's Contents");
            System.out.println("Exit:                          Type exit");
            
            String text = scan.nextLine(); 
            text.toLowerCase(); 
            
            if(text.contains("add"))
            {
                System.out.println("");
                System.out.println("USD or C2D?");
                
                text = scan.nextLine(); 
                text.toLowerCase();
                
                if(text.contains("usd"))
                {
                    System.out.println("");
                    System.out.println("How many notes?");
                    
                    text = scan.nextLine();
                    int whole = Integer.parseInt(text);
                    
                    System.out.println("How many coins?");
                    text = scan.nextLine();
                    int fractional = Integer.parseInt(text);
                    
                    wallet.add(new USD(whole, fractional, "USD"));
                }
                
                if(text.contains("c2d"))
                {
                    System.out.println("");
                    System.out.println("How many notes?");
                    
                    text = scan.nextLine();
                    int whole = Integer.parseInt(text);
                    
                    System.out.println("How many coins?");
                    
                    text = scan.nextLine();
                    int fractional = Integer.parseInt(text);
                    
                    wallet.add(new C2D(whole, fractional, "C2D"));
                }
                
                
            }
            
            if(text.contains("subtract"))
            {
                System.out.println("");
                System.out.println("USD or C2D?");
                
                text = scan.nextLine(); 
                text.toLowerCase();
                if(text.contains("usd"))
                {
                    System.out.println("");
                    System.out.println("How many notes?");
                    
                    text = scan.nextLine();
                    int whole = Integer.parseInt(text);
                    
                    System.out.println("How many coins?");
                    
                    text = scan.nextLine();
                    int fractional = Integer.parseInt(text);
                    
                    wallet.subtract(new USD(whole, fractional, "USD"));                   
                }
                
                if(text.contains("c2d"))
                {
                    System.out.println("");
                    System.out.println("How many notes?");
                    
                    text = scan.nextLine();
                    int whole = Integer.parseInt(text);
                    
                    System.out.println("How many coins?");
                    
                    text = scan.nextLine();
                    int fractional = Integer.parseInt(text);
                    
                    wallet.subtract(new C2D(whole, fractional, "C2D")); 
                }
                
            }
            
            if(text.contains("compare"))
            {
                System.out.println("");
                System.out.println(wallet.compare());
                System.out.println("");
            }
            
            /*if(text.contains("print"))
            {
                System.out.println("");
                System.out.println(wallet.printValueZero());
                System.out.println(wallet.printValueOne());
            }*/
            
            if(text.contains("exit"))
            {
                System.out.println("");
                System.out.println("Goodbye");
                exit = true; 
            }
                
        }         
    }      
}