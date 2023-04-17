/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;
/**
 * In the Date class 
 * the user chooses the date he wants to deliver
 * @author Shahad Almatrafi & Ghadee fahad
 */
 public class Date{
     // This attributes hold the day 
    private int day ;
    // This attributes hold the mounth
    private int month ; 
    // This attributes hold the year in Hijri
    final static short year = 1443 ; 
    
    public Date(){}
    /**
     * This constructs a Date
     * @param day This is a first paramter to Date constructs .
     * @param month This is a Second paramter to Date constructs .
     */
    public Date(int day, int month) {
        this.day = day;
        this.month = month;
       
    }
    /**
     * This method is used to return int.
     * @return the day chosen by the user 
     */
    public int getDay() {
        return day;
    }
    /**
     * This method is used to assign values to paramter.
     * @param day The day chosen by the user
     */
    public void setDay(int day) {
       this.day=day;  
    }
    /**
     * This method is used to return int.
     * @return the mounth chosen by the user 
     */
    public int getMonth() {
        return month;
    }
    /**
     * This method is used to assign values to paramter.
     * @param month The month chosen by the user
     */
    public void setMonth(int month) {
      this.month=month;
    }
   /**
    * This method to check if the user enter a valid day
    * @param d the day 
    * @return true if the enter a valid day and false if the user enter unvalid day 
    */
public static boolean check(int d){
 if((d >=1 && d<=30)==true){
     return true;
 }
 else
     return false;

}
 /**
    * This method to check if the user enter a valid month
    * @param m the month
    * @return true if the enter a valid month and false if the user enter unvalid month
    */
public static boolean check2(int m){
 if((m>=1 && m<=12)==true){
         return true;
 }
 else
        return false;
}
/**
 * This method for the user to choose the date he wants
 */
public void chooseDate(){
    java.util.Scanner in=new java.util.Scanner(System.in);
    System.out.println("enter your day");
   
                  System.out.print("day :");
                   int day =in.nextInt();
                  if(Date.check(day)==true){
                    setDay(day);}
                    else if(Date.check(day)==false ){
                         System.out.println("invalid day Please enter the day just (1 to 30)");
                    int day2 =in.nextInt();
                    setDay(day2);
                   }
                  
                     System.out.println("enter month");
                       System.out.print("month :");
                   int month=in.nextInt();
                    if(Date.check2(month)==true){
                       setMonth(month);
                    }
                    else if(Date.check2(month)==false){
            System.out.println("invalid month Please enter the month just (1 to 12)");
         int monthupdate=in.nextInt();
                    setMonth(monthupdate);}
                        
}
    /**
     * This method is used to print the Date delivery
     * @return The date delivery
     */
    public String toString() {
       
        return  "The date delivery =" + day + "/" + month + "/" + year ;
    }
    
    
    
    
}