package com.cursor.hw4.DesktopgameStore;

public class ActiveGames extends Game {
    String type = "Active game";

    public String getInfo() {
        return "ActiveGames{" +
                "type='" + type + '\'' +
                ", numberInStock=" + getNumberInStock() +
                ", sold=" + getSold() +
                '}';
    }
}
