 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *In class the Order is offered
 *  what the customer requests from the store.
* @author shahad AL-owayid . Ghadi AL-kehily .
* @version 1.0
 */
public class Order implements TheShop{
  
 
    private boolean flag=false;// This attributes hold the flag to start loop 
    private static Flower[]flower;// This attributes hold the array of object of flower
    private String [] color={"red","pink","white","yellow"};// This attributes hold the array of color
    private ArrayList<Integer>total=new ArrayList<>(Arrays.asList(0,0,0,0)); //This attributes hold arrayList for total
    private ArrayList<Double>priceTotal=new ArrayList<>(Arrays.asList(0.0,0.0,0.0,0.0)); //This attributes hold arrayList for priveTotal
    private String str="";// This attributes hold the initial value for String 
    private Payment pay=new PaymentWay();//new object from Payment class
    private Delivery deli = new Delivery();//new object from Delivery class
    private Offers off = new Offers();//new object from Offers class
    private double amount=0.0 ;// This attributes hold the initial value for amount 
    private int x;// This attributes hold the index of color to use in serach
    
    /**
 * default constructs a Order
 */
    public Order() {}
    /**
     * This constructs a Order with a specified flower.
     * @param flower 
     */
    public Order(Flower[]flower) {
        
            this.flower=flower;
    }
     /**
     * This constructs a Order with a specified flag , color.
     * @param flag This is a first paramter to order constructs .
     * @param color This is a second paramter to order constructs .
     */
    public Order(boolean flag,String[] color) {
       
        this.flag= flag;
        this.color=color;}

    /**
     * 
     * @return flag
     */
    public boolean getFlag() {
        return flag; }
/**
 * This method is used to assign values to paramter.
 * @param flag This is a first paramter to setFlag method.
 */
    public void setFlag(boolean flag) {
        this.flag = flag; }
/**
 * This method is used to return values.
 *@return flower.
 */
    public static Flower[] getFlower() {
        return flower;}
/**
 * This method is used to assign values to paramter.
 * @param flower This is a first paramter to setFlower method.
 */
    public static void setFlower(Flower[] flower) {
        Order.flower = flower; }
/**
 * This method is used to return values.
 *@return color .
 */
    public String[] getColor() {
        return color; }
/**
 * This method is used to assign values to paramter.
 * @param color This is a first paramter to setColor method.
 */
    public void setColor(String[] color) {
        this.color = color;}
/**
 * This method is used to return values .
 *@return total .
 */
    public ArrayList<Integer> getTotal() {
        return total;}
/**
 * This method is used to assign values to paramter.
 * @param  total type int This is a first paramter to setTotal method.
 */
    public void setTotal(ArrayList<Integer> total) {
        this.total = total; }
/**
 * This method is used to return values .
 *@return priceTotal.
 */
    public ArrayList<Double> getpriceTotal() {
        return priceTotal;}
/**
 * This method is used to assign values to paramter.
 * @param  priceTotal type Double This is a first paramter to setToTal method.
 */
    public void setPriceTotal(ArrayList<Double> priceTotal) {
        this.priceTotal= priceTotal;}

/**
 * This method is used to return values .
 *@return deli.
 */
    public Delivery getDeli() {
        return deli;
    }
/**
 * This method is used to assign values to paramter.
 * @param deli of object Delivery This is a first paramter to setDeli method.
 */
    public void setDeli(Delivery deli) {
        this.deli = deli;}
/**
 * This method is used to return values .
 *@return pay.
 */    
    public Payment getPay() {
        return pay; }
/**
 * This method is used to assign values to paramter.
 * @param pay  of object Payment This is a first paramter to setPay method.
 */
    public void setPay(Payment pay) {
        this.pay = pay; }
/**
 * This method is used to return values .
 *@return amount.
 */
    public double getAmount() {
        return amount;}
/**
 * This method is used to assign values to paramter.
 * @param  amount type double This is a first paramter to setAmount method.
 */
    public void setAmount(double amount) {
        this.amount = amount; }
/**
 * This method is used to return values.
 *@return off.
 */
    public Offers getOff() {
        return off;
    }
/**
 * This method is used to assign values to paramter.
 * @param off of object Offers This is a first paramter to setOff method.
 */
    public void setOff(Offers off) {
        this.off = off;
    }
/**
 * This method is used to return values.
 *@return str.
 */
    public String getStr() {
        return str;
    }
/**
 * This method is used to assign values to paramter.
 * @param str type String This is a first paramter to setStr method.
 */
    public void setStr(String str) {
        this.str = str;}
/**
 * This method is used to return values .
 *@return x.
 */
    public int getX() {
        return x;
    }
/**
 * This method is used to assign values to paramter.
 * @param x type int This is a first paramter to setX method.
 */
    public void setX(int x) {
        this.x = x;
    }
    
    
/**
 * This method work to search the index of color  if it is available on 
 * the Array list .
 * @param CoLor  type String This is a first paramter to indexSerch method.
 * @return index 
 */
    public int indexSerch(String CoLor){
        int index =0 ;
        for (int i=0; i<color.length ; i++){
            if (color[i].equals(CoLor)){
            index=i;
        break; }
     }
     return index;    
}

      
/**
 * This method helps  to find the chosen color is available in 
 * the store or not with adjustability and color selection from the menu. .
 * @param i  type int This is a first paramter to floowerCloro method.

 */
    public void floowerCloro(int i){
        java.util.Scanner read=new java.util.Scanner(System.in);
        System.out.println("choose your flower color");
        String CoLor =read.next();
        loop :
        while (flag==false){
       
            for (int y=0; y<color.length ; y++){
                if (color[y].equals(CoLor)){
                break loop;  }    }
            
            if (flag ==false){
                System.out.println("Sorry! The color you selected does not exist. \n  Choose another color...");
                CoLor = read.next();}
        }
   
        x=indexSerch(CoLor);}
     
/**
 * This method is used to reduce the number of flowers selected from the same type as required.     .
* @param i  type int This is a first paramter to decrease method.
* @param x type int This is a second paramter to decrease method.
 */
    public void decrease(int i,int x){
        if(flower[i] instanceof Joory)
            ((Joory)flower[i]).decreaseQuantity(x);
        
        else if(flower[i] instanceof Sunflower)
            ((Sunflower)flower[i]).decreaseQuantity(x);
        
        else if(flower[i] instanceof Jasmine)
            ((Jasmine)flower[i]).decreaseQuantity(x);
        
        else if(flower[i] instanceof Daffodil)
            ((Daffodil)flower[i]).decreaseQuantity(x);}
   /**
    * This method is used to reach to the price in each object
    * @param i
    * @return 
    */
    
    public double price(int i){
    if(flower[i] instanceof Joory){
            return((Joory)flower[i]).getPrice();}
        
        else if(flower[i] instanceof Sunflower){
            return((Sunflower)flower[i]).getPrice();}
        
        else if(flower[i] instanceof Jasmine){
            return((Jasmine)flower[i]).getPrice();}
        
        else{
            return ((Daffodil)flower[i]).getPrice();}
    }
    
    /**
    * This method is used to reach to the type in each object
    * @param i
    * @return 
    */
    
    public String type(int i){
        
        if(flower[i] instanceof Joory){
            return((Joory)flower[i]).getType();}
        
        else if(flower[i] instanceof Sunflower){
            return((Sunflower)flower[i]).getType();}
        
        else if(flower[i] instanceof Jasmine){
            return((Jasmine)flower[i]).getType();}
        
        else{
            return ((Daffodil)flower[i]).getType();}}
    
    /**
    * This method is used to Quantity to the type in each object
    * @param i
    * @return 
    */
      public int[] Quantity(int i){
        
        if(flower[i] instanceof Joory)
            return((Joory)flower[i]).getQuantity();
        
        else if(flower[i] instanceof Sunflower)
            return((Sunflower)flower[i]).getQuantity();
        
        else if(flower[i] instanceof Jasmine)
            return((Jasmine)flower[i]).getQuantity();
        
        else
            return ((Daffodil)flower[i]).getQuantity();}
/**
 * This method is used to assign values.
 */    
    public void setColor(){
        for (int i = 0; i < color.length; i++) {
            flower[i].setColor(color);
        }
    }
/**
 * This method combines the characteristics of the methods before creating the customer's order by knowing 
 * the amount of flowers and reducing them in the warehouse and executing the order  .
* @param i  type int This is a first paramter to addOrder method.
* @param num type int This is a second paramter to addOrder method.
 */    
     public void addOrder(int i,int num){
        java.util.Scanner read=new java.util.Scanner(System.in);
        if(Quantity(i)[x]>num && num>0){
                total.set(i, num);
                total(i);
                for (int j = 0; j <num ; j++) {
                    System.out.println("from "+type(i)+Arrays.toString(color));
                    setColor();
                    floowerCloro(i);
                    decrease(i,x);}
                System.out.println();}
        
        else if(Quantity(i)[x]<num) {
            System.out.println("Sorry the rest of "+flower[i].getColor()[x]+" "
                +type(i)+" is "+Quantity(i)[x]+"\n"
                        + "Do you want to ordert all?");
            
            String anSwer=read.next();
            
            if(anSwer.equalsIgnoreCase("yes")){
                total.set(i,Quantity(i)[x]);
                total(i);
                setColor();
                decrease(i,x);
                System.out.println();}//END OF INNER IF
            
            else {
                System.out.print(" ");}//END OF INNER ELSE IF
        }//END OF OUTTER ELSE IF
        else {
            System.out.print(" ");}
     }
    
 /**
 * The function of this method is to collect the full order value and offer it to the customer  .
* @param i  type int This is a first paramter to total method.

 */       
    public void total (int i){
        
        if(total.get(i)==0)
            System.out.print("");
        else {
            double totalPrice=total.get(i)*price(i);
            priceTotal.set(i,totalPrice);
            amount = amount +totalPrice;
            
            str = str+total.get(i)+" "+type(i)+"\t"
                 +price(i)+"\t"+priceTotal.get(i)+"\n";
            
            
        }
        
    }  
/**
 * This method is used to view the 
 * invoice plus the full amount with tax and offers.
 */     
    public void showBill(){
        System.out.println(deli.toString()+
                  "\n\n************************************\n"
                + "\tFlower Shop\n"
                + "************************************\n"
                + "ORDER NUMBER"+Payment.orderID+++"\n"
                + "************************************\n"
                + "====================================\n"
                +getStr()
                + "====================================\n"
                + "************************************\n"
                + "TOTAL:\t\t\t"+amount+Payment.getCurrency()+"\n"
                + "DELIVERY PRICE:+\t\t"+Delivery.deliveryPrice+Payment.getCurrency());
                amount+=Delivery.deliveryPrice;
                
                System.out.println(
                 "DISCOUNT:\t\t"+(pay.getDiscount()*amount)+Payment.getCurrency()+"\n"
                + "TOTAL AFTER DISCOUNT"+"\t"+(amount = amount-(pay.getDiscount()*amount))+Payment.getCurrency()+"\n"
                +"************************************\n"
                + "THE FREE GIFT IS:"+off.moreGift()+"\n"
                +"************************************" );   }
                
/**
 * This method is used in case the customer would like to choose 
 * from the list of automatic orders made by the store
 * @param num
 */
 public void cosOrder(int num){
            switch( num ) {   
            case 1:  
            addOrder( 0, 3);
            addOrder( 1, 2);
            addOrder( 2, 1);
            addOrder( 3, 1);
                System.out.println("you have chosen this order");
                break;
 
            case 2:   
            addOrder( 0, 3);
            addOrder( 1, 2);
            addOrder( 2, 1);
            
                System.out.println("you have chosen this order");
                break;
 
            case 3:   
            addOrder( 1, 2);
            addOrder( 2, 1);
            addOrder( 3, 1);
          
                System.out.println("you have chosen this order");
                break;
 
            default:  
        }
        
    }
 
 /**
 * This method requires the customer to enter the discount
 * code if any and add it to the order invoice with the choice of payment ways.
 */
         public void deliWayAndPayWay(){
        deli.DeliveryWays();
        deli.deliveryBillQ();
         
        java.util.Scanner read=new java.util.Scanner(System.in);
        System.out.println("Do you have a discount code?\n please enter it"
                + "\n(if that is your first time ordering use that code\tAb5)");
        String code=read.next();
        pay.equals(code);
        showBill();
        
        ((PaymentWay)pay).setTotalAmount(amount);
        pay.waysOfPay();
        
        System.out.println(((PaymentWay)pay).getPayWayInfoPrint());
    }
     public void printOffers(){
         System.out.println(off.toString());
     }    
    
    
 /**
 * This method is used to print the quantities available from each type of flower
 * @return  all the quantities
 */   
   @Override
    public String toString(){
       System.out.println("the quantity for each flower in the store =");
        return ((Joory)flower[0]).toString()+
        ((Sunflower)flower[1]).toString()+((Jasmine)flower[2]).toString()+((Daffodil)flower[3]).toString()
        + '}';
  
    }
}