/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;
import Models.Animal;
/**
 *
 * @author IT19782614
 */
public class TestAnimal {
    public static void main(String[] args)
    {
        Animal sampleAnimal= new Animal();
        sampleAnimal.Name ="Dog";
        sampleAnimal.Species="Canis";
        sampleAnimal.Genus="familiaris";
        sampleAnimal.generateScietificName();
        System.out.println("Scientific Name is: "+sampleAnimal.generateScietificName());
                
    }
    
}
