/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

/**
 * super class flower
 *
 * @author teamWork :)
 */

public class Flower {

    private String[] color; // This attributes hold the color of flower
/**
 * default constructs a flower
 */
    public Flower() {
    }

    /**
     * This constructs a flower with a specified color.
     * @param color
     */
    public Flower(String[] color) {
        this.color = color;
    }

    /**
     * This method is used to return string.
     * @return color
     */
    public String[] getColor() {
        return color;
    }

    /**
     * This method is used to assign values to paramter.
     * @param color
     */
    public void setColor(String[] color) {
        this.color = color;
    }

    /**
     * this method used to search color in array.
     * @param i
     * @return color
     */
    public String serchColor(int i) {
        return color[i];
    }

    @Override
    public String toString() {
        return "Flower{" + "color=" + color + '}';
    }

}
