package com.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Cricket");
        game1.setMembership(new Membership());

        Game game2 = game1.clone();
        System.out.println("Value of the game1 object:::" + game1);
        System.out.println("Value of the game2 object:::" + game2);

        Game game3 = new Game(game2);
        System.out.println("Value of the game3 object:::" + game3);

    }
}
