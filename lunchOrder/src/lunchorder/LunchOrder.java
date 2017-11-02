/*
 * @Imran Kassam 
this program is created to help people who go to fast food resturants to help them get the total 
price for the items they bought. 
November, 02, 2017
 */
package lunchorder;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class LunchOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        Food hamburgers = new Food("hamburger", 1.85, 9, 33, 1);
        Food salad = new Food("Salad:", 2.00, 1, 11, 5);
        Food frenchFries = new Food ("Frech Fries: " , 1.30 , 11, 36, 0);
        Food soda = new Food ("Soda: " ,0.95, 0, 38, 0); 

        System.out.println("Please enter the number of Hamburgers purchased: ");
        System.out.println(hamburgers.toString());
        double hamburgerQuantity = Double.parseDouble(sc.nextLine());
        double totalHam = hamburgers.price * hamburgerQuantity; 
        System.out.println("The total price for the fries are: $" + totalHam);     
        
        System.out.println("Please enter the number of Salads purchased: ");
        System.out.println(salad.toString());
        double saladQuantity = Double.parseDouble(sc.nextLine());
        double totalSal = salad.price * saladQuantity; 
        System.out.println("The total price for the fries are: $" + totalSal);
               
        System.out.println("Please enter the number of frech fries purchased: ");
        System.out.println(frenchFries.toString()); 
        double frechFriesQuantity = Double.parseDouble(sc.nextLine()); 
        double totalFries = frenchFries.price * saladQuantity; 
        System.out.println("The total price for the fries are: $" +totalFries);
        
        
        System.out.println("Please enter the number of soda's purchased: "); 
        System.out.println(soda.toString());
        double sodaQuantity = Double.parseDouble(sc.nextLine());
        double totalSoda = soda.price * sodaQuantity; 
        System.out.println("The total price for the fries are: $" + totalSoda);
        
        double finalTotal = totalHam + totalSal + totalSal + totalFries + totalSoda;
        System.out.println("The total amount you should pay is: $" + finalTotal);
        
      
    }
    
}
