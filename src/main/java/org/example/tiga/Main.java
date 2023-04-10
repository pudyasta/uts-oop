package org.example.tiga;

public class Main {
    public static void main(String[] args) {
        Burung burung = new Burung("Alexandro",100,50);
        Zombie zombie = new Zombie("Wiliam",100,50);
        Pocong pocong = new Pocong("TanpaNama",1000,50);

        burung.fly();
        burung.walk();
        burung.attack();
        System.out.println();
        zombie.walk();
        zombie.attack();
        System.out.println();
        pocong.jump();
        zombie.attack();
    }



}
