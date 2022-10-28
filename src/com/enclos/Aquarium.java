package com.enclos;

import com.Darwin.Animal;

public class Aquarium extends Enclos {
    public Aquarium() {
        super();
        this.addTypeAutorise( Animal.AQUATIQUE );
        this.addTypeAutorise( Animal.AMPHIBIEN );
    }
}
