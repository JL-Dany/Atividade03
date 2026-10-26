package com.mycompany.petshop;

public class PetShop {

    public static void main(String[] args) {
   
        Animal c = new Cachorro ("Rex", 3, "Labrador");
        Animal g = new Gato ("Mia", 2, "curta");
        
        Animal [] animais = {
        new Cachorro ("Rex", 3, "Labrador"),
        new Gato ("Mia", 2, "curta"),
        };
        for (Animal item : animais){
        System.out.println (item.descrever());
        }
        System.out.println(c.idadeEmMeses());
        System.out.println(c.idadeEmMeses(6));
 }
}
