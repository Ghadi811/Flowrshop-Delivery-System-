
package flowershop;

/**
 *In the paymentway class 
 * the user chooses the method of payment, cash or credit card
 * @author Demaa ALqthmi & Jumana ALsehli
 * @version 1.0
 */
public class PaymentWay extends Payment {


    private int CreditCardID;// This attributes hold the Credit Card ID of user 
    private String CreditCardFirstName ;// This attributes hold the first name on the credit card of user
    private String CreditCardLasttName;// This attributes hold the last name on the credit card of user
    private byte month ;// This attributes hold the Credit Card Expiry Month
    private byte year ;// This attributes hold the Credit Card Expiry Year
    private String CVC;// This attributes hold the Credit Card Verification Number
    private double extra;
    // This attributes hold to store in it the amount of increase or decrease in the bill when choosing a payment method
    
    final byte monthNow=5; // This attributes hold the month now
    final byte yearNow=22;// This attributes hold the year now
    private String payWayInfoPrint="";// This attributes hold the initial value for String 
    private double totalAmount; // This attributes hold the total amount 

    public PaymentWay(){}
    /**
    * This constructs a PamentWay.
    * @param CreditCardID This is a first paramter to PamentWay constructs .
    * @param firstName This is a Second paramter to PamentWay constructs .
    * @param lasttName This is a third paramter to PamentWay constructs .
    * @param month This is a fourth paramter to PamentWay constructs .
    * @param year This is a fifth paramter to PamentWay constructs .
    * @param CVC This is a sixth paramter to PamentWay constructs .
    * All of these parameters are used to top up the credit card
    */
    public PaymentWay(int CreditCardID,String firstName,
            String lasttName , byte month,
            byte year, String CVC){
            this.CreditCardID = CreditCardID;
            this.CreditCardFirstName = firstName;
            this.CreditCardLasttName = lasttName;
            this.month = month;
            this.year = year;
            this.CVC = CVC;}
    /**
    * This method is used to return values.
    *@return  monthNow.
    */
    public byte getMonthNow() {
        return monthNow;}
    /**
    * This method is used to return values.
    *@return  yearNow.
    */
    public byte getYearNow() {
        return yearNow;}
    /**
    * This method is used to return values.
    *@return CreditCardID.
    */
    public int getCreditCardID() {
        return CreditCardID;}
    /**
     * This method is used to assign values to paramter.
    * @param ID type int This is a first paramter to setCreditCardID method.
    */
    public void setCreditCardID(int ID) {
        this.CreditCardID = ID;}
    /**
    * This method is used to return Sring.
    *@return CreditCardFirstName.
    */
    public String getCreditCardFirstName() {
        return CreditCardFirstName;}
    
    /**
    * This method is used to assign values to paramter.
    * @param firstName type String This is a first paramter to setCreditCardFirstName method.
    */
    public void setCreditCardFirstName(String firstName) {
        CreditCardFirstName = firstName;}
    /**
    * This method is used to return String.
    *@return CreditCardFirstName.
    */
    public String getCreditCardLasttName() {
        return CreditCardLasttName;}
    /**
    * This method is used to assign values to paramter.
    * @param  lasttName type String This is a first paramter to setCreditCardLasttName method.
    */
    public void setCreditCardLasttName(String lasttName) {
        CreditCardLasttName = lasttName;}
    /**
    * This method is used to return Sring.
    *@return CVC.
    */
    public String getCVC() {
            return CVC;}
   /**
    * This method is used to assign values to paramter.
    * @param  CVC type String This is a first paramter to setCVC method.
    */

    public void setCVC(String CVC) {
        java.util.Scanner read=new java.util.Scanner(System.in);
        int CVCint;
        try{
            if(CVC.length()==3){
                CVCint=Integer.parseInt(CVC);
                this.CVC = CVC;}
            else{
                System.out.println("CVC is only 3 digits\nTry again!");
                this.CVC=read.next();}}

        catch(NumberFormatException e){
            System.out.println("hi, CVC is a 3 digits number"
                + "\nNot a String\nTry again!");
            this.CVC=read.next();}}
    /**
    * This method is used to return values.
     *@return month.
    */
    public byte getMonth() {
        return month;}
   /**
    * This method is used to assign values to paramter.
    * @param  month type String This is a first paramter to setMonth method.
    */
    public void setMonth(byte month) {
        this.month=month;}
    /**
    * This method is used to return values.
    *@return Year.
    */
    public byte getYear() {
        return year;}
   /**
    * This method is used to assign values to paramter.
    * @param  year type String This is a first paramter to setYear method.
    */
    public void setYear(byte year) {
        this.year = year;}
       
    /**
     * this method is used to check if the month and year available
     * then assign it to the value.
     * Else will ask to enter another month
     * @param month
     * @param year 
     */
    public void setMonthAndYear(byte month,byte year) {
    java.util.Scanner read=new java.util.Scanner(System.in);
    if (year>=getYearNow())
        this.year = year;
    else{
        System.out.println("the year is expired \nMake sure you write it correctly");
        this.year=read.nextByte();}
 
    if (month<=12&&month>0){
        if(month>getMonthNow()^year!=getYearNow())
            this.month = month;
        else{
        System.out.println("expired month\nMake sure you write it correctly");
        this.month=read.nextByte();}}
    else{
        System.out.println("Make sure you write it correctly");
        this.month=read.nextByte();}}
    
    /**
     * This method is used to return CreditCardFullName .
    *@return fullName.
    */
    public String CreditCardFullName (){
        String fullName =CreditCardFirstName+" "+CreditCardLasttName+"\n";
        return fullName;}
    /**
    * This method is used to print expirationDate in the same line.
    *@return month & year.
    */
    public String expirationDate(){
        return month+"/"+year+"\n";}
    /**
     * this method is used to return the extra value
     * of the chosen way of pay
     * @return extra
     */
    public double getExtra() {
        return extra;
    }
    /**
    * This method is used to assign values to paramter.
    * @param extra type double This is a first paramter to setExtra method.
    */
    public void setExtra(double extra) {
        this.extra = extra;
    }
    /**
     * This method is used to return values.
    *@return orderID.
    */
    public static int getOrderID() {
        return orderID;
    }
    /**
    * This method is used to assign values to paramter.
    * @param orderID type int This is a first paramter to setOrderID method.
    */
    public static void setOrderID(int orderID) {
        Payment.orderID = orderID;
    }

    /**
    * This method is used to return String.
    *@return payWayInfoPrint.
    */   
    public String getPayWayInfoPrint() {
        return payWayInfoPrint;
    }
    /**
    * This method is used to assign values to paramter.
    * @param payWayInfoPrint type String This is a first paramter to setPayWayInfoPrint method.
    */
    public void setPayWayInfoPrint(String payWayInfoPrint) {
        this.payWayInfoPrint = payWayInfoPrint;
    }
    /**
    * This method is used to return values.
    *@return totalAmount.
    */    
    public double getTotalAmount() {
        return totalAmount;
    }
    /**
    * This method is used to assign values to paramter.
    * @param totalAmount double type int This is a first paramter to setTotalAmount method.
    */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    /**
    * This method is used to You receive from the user a number 
    * If the number is 1, he wants to use payment by credit card and any other number that leads to payment by cash.
     * If by card, the user is asked to enter the credit card information.
     * When paying in cash, there is an increase in the total by 10 riyals.
     */ 
    @Override
    public void waysOfPay() {
        java.util.Scanner read=new java.util.Scanner(System.in);
        System.out.println("Please enter the number of the way you will pay with\n"
                + "1.Cridet Card(discount - 10 )"+getCurrency()+"\n"
                + "2.Cash(+10 "+getCurrency()+" to your bill\n");
        int num = read.nextInt();
        switch (num){
            case 1:
                extra=-10.0;
                System.out.println("the total price you will pay is\t"+(totalAmount=totalAmount+extra)+"\n"
                        + "Enter Cridet Card number\n8 digit");
                int ID = read.nextInt();
                setCreditCardID(ID);

                System.out.println("Enter Cridet Card first name");
                String fName = read.next();
                setCreditCardFirstName(fName);

                System.out.println("Enter Cridet Card last name");
                String lName = read.next();
                setCreditCardLasttName(lName);


                System.out.println("Enter Cridet Card expiration month\nMM");
                byte m = read.nextByte();

                System.out.println("Enter Cridet Card expiration year\nYY");
                byte y = read.nextByte();

                setMonthAndYear(m,y);
                        
                System.out.println("Enter Cridet Card CVC ");
                String cvc = read.next();
                setCVC(cvc);
                payWayInfoPrint=printCardInfo();
                break;
                
                
            case 2:
                extra=10;
                System.out.println("the total price you will pay is\t"+(totalAmount=totalAmount+extra));
                payWayInfoPrint=printCashInfo();
                break;


            default:
                extra=10;
                payWayInfoPrint=printCashInfo();
                System.out.println("you didnt chose a way to pay \n"
                       + "we will consider this as Cash pay\n"
                       + "the total price you will pay is\t"+(totalAmount=totalAmount+extra));}}
    /**
    * This method is used to print card information.
    */
    public String printCardInfo() {
        return "====================================\n"
                + "\t\tyour pay bill\n"
                + "====================================\n"
                + "CreditCard\n" + "number:" + CreditCardID+"\nTotal:\t"+totalAmount+getCurrency()+"\n" ;}
    /**
    * This method is used to print Cash information.
    */
    public String printCashInfo(){
        return "====================================\n"
                + "\t\tyour pay bill\n"
                + "====================================\n"
                +"Cash\nTotal:\t"+totalAmount+getCurrency()+"\n";}
    /**
    * This method is used to print 
    * @return  String Extra
    */
    public String toString() {
        return "PaymentWay{" + "extra=" + extra + '}';
    }




}
