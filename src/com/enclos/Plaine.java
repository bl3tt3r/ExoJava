package com.enclos;

import com.Darwin.Animal;

public class Plaine extends Enclos{
    public Plaine() {
        super();
        this.addTypeAutorise( Animal.TERRESTRE );
        this.addTypeAutorise( Animal.AMPHIBIEN );
    }
}


