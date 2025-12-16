/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package oop;

/**
 *
 * @author rpgarcia
 */
public abstract class Fruit {

private String name;
public final boolean SEED = true;
public String color;
public int juice;
// public int amount;

public Fruit (String name, boolean SEED, String color, int juice){
    this.name = name;
    this.color = color;
    int juice = juice;
}

public void setName(String name){
    this.name = name;
}

public String getName(String name){
    return this.name = name;
}

public String makeJuice(){
    return this.name + "is juiced!";
    juice ++;
}

}
