package ohtu;

import ohtu.TennisGame;

public class Main {

    public static void main(String[] args) {
        TennisGame game = new TennisGame("player1", "player2");
    
        System.out.println(game.getScore());
    
        game.wonPoint("player1");
        System.out.println(game.getScore());
    
        game.wonPoint("player1");
        System.out.println(game.getScore());
    
        game.wonPoint("player2");
        System.out.println(game.getScore());
    
        game.wonPoint("player1");
        System.out.println(game.getScore());
    
        game.wonPoint("player1");
        System.out.println(game.getScore());
    }
    

}