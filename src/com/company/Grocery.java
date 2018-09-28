package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Grocery {
    private ArrayList<Person> grocery;

    public Grocery() {
    }

    public Grocery(ArrayList<Person> grocery) {
        this.grocery = grocery;
    }

    public ArrayList<Person> getGrocery() {
        return grocery;
    }

    public void setGrocery(ArrayList<Person> grocery) {
        this.grocery = grocery;
    }

}