package com.cursor.hw4.DesktopgameStore;

public class CardGames extends Game {

    String type = "Card game";

    public String getInfo() {
        return "CardGames{" +
                "type='" + type + '\'' +
                ", numberInStock=" + getNumberInStock() +
                ", sold=" + getSold() +
                '}';
    }
}
