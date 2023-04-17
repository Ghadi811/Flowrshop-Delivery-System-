
package flowershop;

/**
 *In the abstract payment class
 * the payments process is made in this class
 * @author Demaa ALqthmi & Jumana ALsehli
 * @version 1.0
 */
public abstract class Payment {
    
    static final double tax = 0.15;// This attributes hold the tax  
    private final static String Currency="SR";// This attributes hold the Currency 
    static int orderID=54990;//This attributes hold the initial value for order ID
    final static String CODE ="Ab5";// This attributes hold the give CODE initial value  
    private double discount =0;// This attributes hold the initial value for discount
    /**
    * This method is used to return values.
    *@return discount.
    */
    public double getDiscount() {
        return discount;}
    /**
    * This method is used to return String.
    *@return Currency.
    */
    public static String getCurrency() {
        return Currency;
    }
    
    /**
    * This method is used to assign values to paramter.
    * @param discount This is a first paramter to setDiscount method.
    */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
    * This method work to To equal the value of obj with CODE
    * If the code entered by the user is verified, 0.05 will be deducted from the total price
    * @param obj 
    * @return true,false
    */   
    public boolean equals(Object obj){
        if (obj.equals(CODE)){
            discount=0.05;
            return true;}
        else 
            return false;}
    /**
     * this method is abstract will be used to give the user 
     * the available way of pay in the store
     */
    public abstract void waysOfPay();
    
    
      
}