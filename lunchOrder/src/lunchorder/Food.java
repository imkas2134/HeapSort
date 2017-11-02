/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunchorder;
import java.util.Scanner; 

/**
 * @author Imran kassam 
 * 
 */ 
public class Food {
    public String item;
    public double price;
    public int fat;
    public int carbs;
    public int fiber;

    public Food(String item, double price, int fat, int carbs, int fiber) {
        this.item = item;
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    @Override
    public String toString() {
        return "Each " + item + " has " + fat + "g of fat," + carbs + "g of carbs, and " + fiber + "g of fiber." ;
    }
    
    
}
