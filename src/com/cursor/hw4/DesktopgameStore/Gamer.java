package com.cursor.hw4.DesktopgameStore;

public class Gamer extends People {


    private LogicalGames games;

    public void wantGame (Game game) {
        System.out.println("I want to buy the game " + game.getName());
    }

    @Override
    public void wantToSpend() {
        System.out.println("My name is " + this.getName() + "! I can spend " + getHasMoney() + " dollars for desktopgames!");
    }

    @Override
    public String getInfo() {
        return "Gamer {" +
                "name = '" + getName() + '\'' +
                ", hasMoney = " + getHasMoney() +
                '}';
    }
}
