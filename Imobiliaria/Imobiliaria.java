package com.mycompany.imobiliaria;

public class Imobiliaria {

    public static void main(String[] args) {
    Imovel c = new Casa ("Rua A, 10",80,3);
    Imovel a = new Apartamento ("Rua B, 200",60,5);
    
    Imovel [] moradias={
    new Casa ("Rua A, 10",80,3),
    new Apartamento ("Rua B, 200",60,5),
    };
    for (Imovel item: moradias){
    System.out.println (item.descrever());
    }
    System.out.println(c.valorEstimado(3000));
    System.out.println(c.valorEstimado(3000, 2000));
    }
}
