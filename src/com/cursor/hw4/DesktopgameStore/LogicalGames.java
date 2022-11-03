package com.cursor.hw4.DesktopgameStore;

public class LogicalGames extends Game {
    String type = "Logical game";

    public String getInfo() {
        return "LogicalGames{" +
                "type='" + type + '\'' +
                ", numberInStock=" + numberInStock +
                ", sold=" + sold +
                '}';
    }
}
