/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;


import java.util.Arrays;

/**
 * Class Daffodil inherits from class flower to 
 * determine the quantity and price
 * @author Ghadi Alkehily
 */
public class Daffodil extends Flower{
    
    private static final String type="Daffodil";// This attributes hold the type of flower 
    private static final double price=4+(4*Payment.tax); // This attributes hold the price of flower
    private static int [] quantity={9,8,11,10};// This attributes hold the quantity of flower 
    
    /**
     * This method is used to return string
     * @return type 
     */
    public String getType() {
        return type; }
    /**
     * This method is used to return value
     * @return price
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * This method is used to return value
     * @return array Quantity  
     */
    public int[] getQuantity() {
        return quantity;
    }
    /**
     * This method is used to assign values to paramter.
     * @param quantity   
     */
    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }
    /**
     * This method is used for decrease every Quantity for each color 
     * @param i 
     */
     public  void decreaseQuantity(int i){
         if (quantity[i]>0)
            quantity[i]--;
        else
            System.out.println("out of color");}
    
    @Override
    public String toString() {
        for(int i=0;i<quantity.length;i++){System.out.println("quantity of Daffodil   "+serchColor(i)+"=" + quantity[i] );}
        return "doffodil{" +"price ="+price+ '}';
    }
}