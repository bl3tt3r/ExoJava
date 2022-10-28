package com.enclos;

import com.Darwin.Animal;

public class Terrarium extends Enclos{
    public Terrarium() {
        super();
        this.addTypeAutorise( Animal.TERRESTRE );
        this.addTypeAutorise( Animal.AMPHIBIEN );
    }
}
