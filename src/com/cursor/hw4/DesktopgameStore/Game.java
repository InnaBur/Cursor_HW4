package com.cursor.hw4.DesktopgameStore;

/**
 * In this class super class Game is created
 * It has fields: game`s name, type and the price
 * Field "numberInStock" shows how much games of this name is left,
 * "isSold" shows if the game was sold
 * There are bought() and sold() methods, also getInfo() method
 */
public class Game implements Nameable {

    private String name;
    private String type;
    private int price;
    private int numberInStock;
    private boolean isSold;
    private int sold;
    private Gamer gamer;

    /**
     * In this method game can be bought if it is in stock
     *
     * @param count shows how much this games gamer wants to buy
     * @param name  the name of gamer
     */
    public void bought(int count, Gamer name) {
        if (numberInStock > 0) {
            isSold = true;
            sold = count;
            numberInStock -= count;
        } else {
            System.out.println("Sorry, this game is out of stock.");
        }
    }

    /**
     * If the game was in stock and was sold
     * we can see a message
     */
    public void sold() {
        if (isSold) {
            System.out.println("Here is your " + this.name);
        }
    }

    public Game() {
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return "Game{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", numberInStock=" + numberInStock +
                ", isSold=" + isSold +
                ", sold=" + sold +
                ", gamer=" + gamer +
                '}';
    }
}

