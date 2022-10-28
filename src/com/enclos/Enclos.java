package com.enclos;

import com.Darwin.Animal;

import java.util.ArrayList;

public class Enclos {

    private ArrayList<Animal> animaux = new ArrayList<>();
    private ArrayList<Integer> typesAutorise = new ArrayList<>();

    public Enclos() {
    }

    public ArrayList<Animal> getListeAnimaux() {
        return animaux;
    }

    public void setListeAnimaux(ArrayList<Animal> listeAnimaux) {
        this.animaux = listeAnimaux;
    }

    public ArrayList<Integer> getTypesAutorise() {
        return typesAutorise;
    }

    public void setTypesAutorise(ArrayList<Integer> typesAutorise) {
        this.typesAutorise = typesAutorise;
    }

    public void addAnimal(Animal newAnimal) {

        boolean isDead = false;

        if( !newAnimal.isCarnivore() ){
            for ( Animal animal : this.animaux){
                if(animal.isCarnivore()){
                    System.out.println("Oups " + newAnimal.getName()+ " a été dévoré par " + animal.getName() );
                    isDead = true;
                    break;
                }
            }
        }

        if( !isDead){
            this.animaux.add( newAnimal );
        }

    }

    public void addTypeAutorise(int type) {
        this.typesAutorise.add(type);
    }

    public boolean peutAccueillir(Animal animal) {
        return typesAutorise.contains(animal.getType());
    }

    public void afficherAnimaux() {
        for (Animal animal : this.animaux) {
            System.out.println( " - " + animal.getName() );
        }
    }
}
