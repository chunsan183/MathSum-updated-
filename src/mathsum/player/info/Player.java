/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsum.player.info;

/**
 *
 * @author studentadmin
 */
public class Player {
    
    //declare the fields for each instance of player object
    private String playerName;
    private int highScore;
    private int lowScore;
    private int hightoLow[];
    private int lowtoHigh[];
    
    //these are constuctor methods
    //if we call the player with no parameters this method will be called
    public Player(){
        
        playerName = "-";
        highScore = -1;
        lowScore = -1;
        
    }
    
    //if we call the player with parameters this method will be called
    public Player (String playerName, int highScore, int lowScore, int [] hightoLow, int [] lowtoHigh){
    
        this.playerName = playerName;
        this.highScore = highScore;
        this.lowScore = lowScore;
        this.hightoLow = hightoLow;
        this.lowtoHigh = lowtoHigh;
        
    }
    
    //getter methods for player name, high score, low score, high to low, low to high
    
    String getPlayerName(){
        return this.playerName;
    }
    
    int getHighScore(){
        return this.highScore;
    }
    
    int getLowScore(){
        return this.lowScore;
        
    }
    
    int [] getHighToLow(){
        return this.hightoLow;
    }
    
    int [] getLowToHigh(){
        return this.lowtoHigh;
    }
    
    //setter or mutator methods
    
    void setPlayerName(String name){
        this.playerName = name;
    }
    
    String sethighScore(int highScore){
        
        if (highScore > 0){
            this.highScore = highScore;
            return ("New high score set");
        }
        else{
            return ("You cannot have a negative high score");
        }
    }
    
    String setlowScore(int lowScore){
        
        if (lowScore > 0){
            this.lowScore = lowScore;
            return ("New low score set");
        }
        else{
            return ("You cannot have a negative low score");
        }
    }
    
    void setHighToLow (int [] hightoLow){
        this.hightoLow = hightoLow;
    }
    
    void setLowToHigh (int [] lowtoHigh){
        this.lowtoHigh = lowtoHigh;
    }
    
    
}
