/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

import java.util.*;

/**
 * In the Offers class 
 * show the offers of store and method more gift 
 * @author Ghadee fahad & shahad Almatrafi
 */
public class Offers {

    private ArrayList<String> giftList; // This attributes hold the giftList of Offers
/**
 * default constructs aOffers
 */
    public Offers() {
    }

    /**
     * This constructs a Offers
     * @param giftList This is a first paramter to Offers constructs .
     */
    public Offers(ArrayList<String> giftList) {
        this.giftList = giftList;
    }

    /**
     *  This method is used to return Giftlist.
     * @return GiftList
     */
    public ArrayList<String> getGiftList() {
        return giftList;
    }

    /**
     *This method is used to assign values to paramter.
     * @param giftList
     */
    public void setGiftList(ArrayList<String> giftList) {
        this.giftList = giftList;
    }

    /**
     * This method is used to return String.
     * @return random gift
     */
    public String moreGift() {
        giftList = new ArrayList<>();
        giftList.add("choclate");
        giftList.add("flower seeds");
        giftList.add("tedybear");
        int random = (int) (Math.random() * 3);
        return giftList.get(random);
    }
/**
 * This method is used to print the offers of the store
 * @return offers  
 */
    @Override
    public String toString() {
        String offer = ( "======================================================================\n"
        +"            The offers of our Stroe is           \n"
        +"======================================================================\n"
        +" With every order, you will get a chance to win a random gift from us         \n"
        +"              we have discount code               \n"
        +"======================================================================\n");
        return offer;
    }

}
