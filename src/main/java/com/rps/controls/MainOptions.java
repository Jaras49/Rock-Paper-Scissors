package com.rps.controls;

public enum MainOptions {
    EXIT(0, "Exit program"),
    ROCK(1, "Play rock"),
    PAPER(2, "Play paper"),
    SCISSORS(3, "Play scissors"),
    SPOCK(4, "Play spock"),
    LIZARD(5, "Play Lizard"),
    RESTART (6, "Restart game");

    private int value;
    private String description;

    MainOptions(int value, String description){
        this.value = value;
        this.description = description;
    }

    public static MainOptions createOption(int option){

        return MainOptions.values()[option];
    }

    @Override
    public String toString(){
        return value + " - " + description;
    }

    public String getName(){
        return name();
    }
}
