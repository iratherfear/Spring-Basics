package dev.iratherfear.springintro.Gaming;

public class Supra implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Supra jumps");
    }

    @Override
    public void down() {
        System.out.println("Supra dunks");
    }

    @Override
    public void left() {
        System.out.println("Supra shoots");
    }

    @Override
    public void right() {
        System.out.println("Supra goes back");
    }
     
}
