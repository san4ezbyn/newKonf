package com.company.entity;

import java.util.Objects;

public abstract class Sweets {

    public  String name;
    private double weight;

    public Sweets ( ) {
    }


    Sweets ( String name , double weight ) {
        this.name = name;
        this.weight = weight;
    }


    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public double getWeight ( ) {
        return weight;
    }

    public void setWeight ( double weight ) {
        this.weight = weight;
    }


    public String getInfo ( ) {
        return "Name" + this.name + " weight:" + this.weight;
    }

    @Override
    public String toString ( ) {
        return "\n" + name + " " + weight + " gr\n";
    }


    /*@Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Sweets sweets = (Sweets) o;
        return Double.compare ( sweets.weight , weight ) == 0 &&
                Objects.equals ( name , sweets.name );
    }

    @Override
    public int hashCode ( ) {

        return Objects.hash ( name , weight );
    }*/
}

