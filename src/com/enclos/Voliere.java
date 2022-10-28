package com.enclos;

import com.Darwin.Animal;

public class Voliere extends Enclos{
    public Voliere() {
        super();
        this.addTypeAutorise( Animal.TERRESTRE );
        this.addTypeAutorise( Animal.VOLATILE );
    }
}
