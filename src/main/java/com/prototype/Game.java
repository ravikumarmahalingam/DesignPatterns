package com.prototype;

//If you want a class object to be cloned using the clone method then the class
//has to implement the Cloneable interface
public class Game implements Cloneable{
    private int id;
    private String name;
    private Membership membership;

    Game(){}

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membership=" + membership +
                '}';
    }

    //With clone method there is a shallow copy of the non-primitive objects.
    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        //This line is for deep copy for the non-primitive objects.
        game.membership = new Membership();
        return game;
    }

    //Copy constructor to clone the existing object and do a deep copy for the
    //non-primitive objects.
    Game(Game game){
        this.id = game.id;
        this.name = game.name;
        this.membership = new Membership();
    }
}
