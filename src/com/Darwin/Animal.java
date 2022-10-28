package com.Darwin;

public class Animal {

    public static final int AQUATIQUE = 1;
    public static final int AMPHIBIEN = 2;
    public static final int TERRESTRE = 3;
    public static final int VOLATILE = 4;

    private String name;
    private int type;
    private boolean isCarnivore;

    public Animal(String name , int type, boolean isCarnivore) {
        this.type = type;
        this.isCarnivore = isCarnivore;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean carnivore) {
        isCarnivore = carnivore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
