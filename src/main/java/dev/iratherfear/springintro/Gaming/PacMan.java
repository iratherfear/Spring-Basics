package dev.iratherfear.springintro.Gaming;

public class PacMan implements GamingConsole {
    public PacMan() {

    }

    @Override
    public void up() {
        System.out.println("Pacman goes up");
    }

    @Override
    public void down() {
        System.out.println("Pacman goes down");
    }

    @Override
    public void left() {
        System.out.println("Pacman goes left");
    }

    @Override
    public void right() {
        System.out.println("Pacman goes right");
    }
}
