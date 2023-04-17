/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

public class FlowerShop {

    /**In the main class of our FlowerShop , 
     * the offer is presented to the client,
     * then we receive his special request of roses for client,
     * And the process of ordering, payment and delivery is done as he wants
     * @author teamWork
     */
    public static void main(String[] args) {
        
       
        Flower [] flower={new Joory(),new Sunflower(),new Jasmine(),new Daffodil()};
        java.util.Scanner read=new java.util.Scanner(System.in);
        Order order=new Order(flower);//new object from order class
        order.setColor();//call method from order class
        System.out.println(" welcome to our flowershop ");
        order.printOffers();//call method from order class
        String answer="yes"; //initial value for answer
        /**
         * here the program will call all method in Order class and start the program
         */
        
            while(answer.equals("yes")){
                System.out.println("Would you like to choose from our popular orders?");
                String choose=read.next().toLowerCase();
                if(choose.equals("yes")){
                   
                    System.out.println("this is our offers ");
                    System.out.println("1. three Joory ,two sunflower,one Jasmine and one daffodil \n"
                    + "2. three Joory ,two sunflower and one Jasmine \n"
                    + "3. two sunflower,one Jasmine and one daffodil \n"
                    + "entar the number of the offer");
                    int num = read.nextInt();
                    order.cosOrder(num);}
               
                else if (choose.equals("no")){
                    System.out.println("Make your request\n");
                    System.out.println("entar the number of joory\n"
                            + "if you dont want enter zero ");
                    int numJoory=read.nextInt();
                    order.addOrder(0,numJoory);
            
                    System.out.println("entar the number of sunflower\n"
                            + "if you dont want enter zero ");
                    int numSunflower=read.nextInt();
                    order.addOrder(1,numSunflower);
            
                    System.out.println("entar the number of jasmine\n"
                            + "if you dont want enter zero");
                    int numJasmine=read.nextInt();
                    order.addOrder(2,numJasmine);
            
                    System.out.println("entar the number of daffodil\n"
                            + "if you dont want enter zero");
                    int numDaffodil=read.nextInt();
                    order.addOrder(3,numDaffodil);}
       
             System.out.println("do you want another order ?");
            answer=read.next().toLowerCase(); }//breack inner loop
            
        order.deliWayAndPayWay(); //call method from order class
        
        
        //extra :)
        System.out.println("are you D.Azhar?");
        String Answer =read.next();
        if(Answer.equalsIgnoreCase("yes"))    
            {System.out.println("we hope you like our program\n"
                + "what you wanna see doctor?\n"
                + "1.the quantity in the store\n\tso you will know that the flower is decreased\n all the flower have the intieal value of 50\n\n "
                + "2.rebort about what evry student did");
            int num = read.nextInt();
            switch(num){
                case 1 :
                    System.out.println(order.toString());
                    break;
                case 2 : System.out.println(
                        "Ghadi Alkehily and Shahad ALowayid --> order class\n"
                        + "Shahad Almatrafi and Ghadee fahad --> Offers ,Delivery and Date classes\n"
                        + "Demaa ALqthmi & Jumana ALsehli --> Payment and paymentWay classes\n"
                        + "Ghadi Alkehily & Jumana ALsehli --> Joory,Sunflower,Jasmine and Daffodil classes\n "+
                         "The rest of the classes --> teamwork");
                break;}
            }
        
        System.out.println("***************************************************** \n "
                + "thank you for visiting us and coming back to us <3 \n "
                + "***************************************************************");
}}