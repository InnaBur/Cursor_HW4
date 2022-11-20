package com.cursor.hw4.DesktopgameStore;

public class SalesManager extends People {

    int salary;

    public void sayHi() {
        System.out.println("Hello! My name is " + this.getName() + ". Can I help you?");
    }

    @Override
    public void wantToSpend() {
        System.out.println("My name is " + this.getName() + "! I can spend " + salary/55 + " dollars for desktopgames!");
    }

    @Override
    public String getInfo() {
        return null;
    }

}
