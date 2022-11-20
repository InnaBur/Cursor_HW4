package com.cursor.hw4.DesktopgameStore;

/** In this class game names, prices and availability (number in the stock) are created
 * also gamer and worker are created
 * Gamer purchases the game and worker sells it
 * also we can get how much money each person want to spend for the game
 * and get info about games and people
 */
public class DesktopGamesShop {
    public static void main(String[] args) {

        LogicalGames chess = new LogicalGames();
        chess.setName("Chess");
        chess.setPrice(500);
        chess.setNumberInStock(2);

        LogicalGames loto = new LogicalGames();
        loto.setName("Loto");
        loto.setPrice(50);
        loto.setNumberInStock(10);

        ActiveGames twister = new ActiveGames();
        twister.setName("Twister");
        twister.setPrice(175);
        twister.setNumberInStock(0);

        CardGames dixit = new CardGames();
        dixit.setName("Dixit");
        dixit.setPrice(200);
        dixit.setNumberInStock(5);

        CardGames uno = new CardGames();
        uno.setName("Uno");
        uno.setPrice(100);
        uno.setNumberInStock(7);

        SalesManager worker = new SalesManager();
        worker.setName("Andriy");
        worker.salary = 50000;

        Gamer first = new Gamer();
        first.setName("Mariana");
        first.setHasMoney(1000);

        Gamer second = new Gamer();
        second.setName("Inna");
        second.setHasMoney(500);

        first.wantToSpend();
        worker.sayHi();
        first.wantGame(loto);
        loto.bought(2, first);
        loto.sold();
        System.out.println();

        second.wantToSpend();
        worker.sayHi();
        second.wantGame(twister);
        twister.bought(1, second);
        twister.sold();
        System.out.println();

        worker.wantToSpend();
        System.out.println();

        System.out.println("Info about 'Loto': " + loto.getInfo());
        System.out.println("Info about 'Chess': " + chess.getInfo());

        System.out.println(first.getInfo());
    }
}
