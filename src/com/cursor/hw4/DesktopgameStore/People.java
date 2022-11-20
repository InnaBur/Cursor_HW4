package com.cursor.hw4.DesktopgameStore;

/** In this abstract class fields and methods
 * for every human is created.
 * People have names, last names and money, and they want
 * to spend money for games
 */
public abstract class People implements Nameable {
    protected String name;
    protected String lastName;
    protected int hasMoney;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHasMoney() {
        return hasMoney;
    }

    public void setHasMoney(int hasMoney) {
        this.hasMoney = hasMoney;
    }

    public  abstract void wantToSpend();

}
