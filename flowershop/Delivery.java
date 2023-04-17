/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;
/**
 * In the Delivery class 
 * the user chooses the delivery ways and fill his information .
 * @author Shahad Almatrafi & Ghadee fahad
 */
public class Delivery {
    // This attributes hold the location of user 
    private String location ;
     // This attributes hold the name of user 
    private String name ;
     // This attributes hold the phone number of user 
    private long phoneNum ;
     // This attributes hold the delivery price  
     final static Double deliveryPrice = 30.0;
      // This attributes hold the name of delivery company
     private String deliveryCompany ;
     private Date date = new Date() ;
     
   
//-----------------------------------------------------------------------
    public Delivery(){}
    /**
     *  This constructs a Delivery
     * @param location This is a first paramter to Delivery constructs .
     * @param name This is a Second paramter to Delivery constructs .
     * @param phoneNum This is a third paramter to Delivery constructs .
     * @param deliveryCompany This is a fourth paramter to Delivery constructs .
     */
    public Delivery(String location, String name, long phoneNum, String deliveryCompany) {
        this.location = location;
        this.name = name;
        this.phoneNum = phoneNum;
        this.deliveryCompany=deliveryCompany;
         
    }
     /**
     *  This constructs a Delivery
     * @param location This is a first paramter to Delivery constructs .
     * @param name This is a Second paramter to Delivery constructs .
     * @param phoneNum This is a third paramter to Delivery constructs .
     * @param deliveryCompany This is a fourth paramter to Delivery constructs .
     * @param date This is a fifth paramter to Delivery constructs .
     */
    public Delivery(String location, String name, long phoneNum,String deliveryCompany, Date date) {
        this.location = location;
        this.name = name;
        this.phoneNum = phoneNum;
        this.deliveryCompany=deliveryCompany;
        this.date = date;
    }

   /**
    *  This method is used to return String.
    * @return the location of user 
    */
    public String getLocation() {
        return location;
    }
    /**
     * This method is used to assign values to paramter.
     * @param location the location of user  
     */
    public void setLocation(String location) {
        this.location=location;
    }
    /**
     * This method is used to return String.
     * @return the name of user 
     */
    public String getName() {
        return name;
    }
    /**
     * This method is used to assign values to paramter.
     * @param name the name of user 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *  This method is used to return long.
     * @return the phone number of user 
     */
    public long getPhoneNum() {
        return phoneNum;
    }
    /**
     * This method is used to assign values to paramter.
     * @param phoneNum phone number of user 
     */
    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
    /**
     *  This method is used to return String.
     * @return the name of delivery company 
     */
    public String getDeliveryCompany() {
        return deliveryCompany;
    }
    /**
     * This method is used to assign values to paramter.
     * @param deliveryCompany the name of delivery company
     */
    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }
    
    /**
     * This method to ask the user about the delivery company he wants
     */
    public void DeliveryWays(){
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println(" Next step: Choose your delivery Company:"+"\n"+
            "1. Mrsool \n"
           + "2. Aramex \n"
           + "3. noon \n"
        +"what do you want?(please choose a number)");
        int num=input.nextInt() ;
          switch( num ) {   
            case 1: 
                String str1 = "Mrsool";
                setDeliveryCompany(str1);
                System.out.println("Do you want home delivery");
                 String str=input.next().toLowerCase();
                if (str.equals("yes")){
                    System.out.println("ok your order now with Mrsool");
                }
                else if (str.equals("no")){
                    System.out.println("you can pickup from the nearest branch");}
                break;
            case 2:  
                 str1 = "Aramex";
                 setDeliveryCompany(str1);
                  System.out.println("Do you want home delivery");
                  str=input.next().toLowerCase();
                if (str.equals("yes")){
                    System.out.println("ok your order now with Aramex");}
                else if (str.equals("no")){
                    System.out.println("you can pickup from the nearest branch");}
                break;
            case 3:   
                str1="noon";
                setDeliveryCompany(str1);
                 System.out.println("Do you want home delivery");
                 str=input.next().toLowerCase();
                if (str.equals("yes")){
                    System.out.println("ok your order now with noon");}
                else if (str.equals("no")){
                    System.out.println("you can pickup from the nearest branch");}
                break;
 
            default: 
                
        }
        
    }
    /**
     * This method to fill the user information 
     */
    public void deliveryBillQ(){
         java.util.Scanner input=new java.util.Scanner(System.in);
          System.out.println("please enter your name");
         String n = input.next();
         setName(n);
        System.out.println("please enter your location");
        System.out.println("city:");
        String c = input.next();
        System.out.println("street:");
        String s = input.next();
        String L = c+" "+s ;
        setLocation(L);
        System.out.println("please enter your phone");
         long p = input.nextLong();
         setPhoneNum(p);
          System.out.println("please enter the date you want to deliver in Hijri");
          date.chooseDate();
    }
    
    /**
     *This method is used to print the Delivery bill   
     * @return the Delivery bill .
     */
    @Override
    public String toString() {
        String str=("====================================\n"
        +"            Delivery Bill          \n"
        +"====================================\n"
        +"name = "+name+"\n"
        +"location = "+location+"\n"
        +"phone number = "+phoneNum +"\n"
        +"Delivery Company = "+deliveryCompany+"\n"
        +"Delivery price = "+deliveryPrice+"\n"
        +date);
        return (str);
    }

   
    
}