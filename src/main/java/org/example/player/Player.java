package org.example.player;

public class Player {
    private String name;
    private char operator;

    public Player() {
    }

    public Player(String name, char operator) {
        this.name = name;
        this.operator = operator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getName() {
        return name;
    }

    public char getOperator() {
        return operator;
    }
}
