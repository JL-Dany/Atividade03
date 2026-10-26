package com.mycompany.testepapelaria;

public class TestePapelaria {

    public static void main(String[] args) {
    Produto cad = new Caderno("Universitário",20,96);
    Produto can = new Caneta("Bic",5,"azul");
    
    Produto [] produtos = {
    new Caderno("Universitário",20,96),
    new Caneta("Bic",5,"azul"),
    };
    for (Produto item: produtos){
    System.out.println(item.descrever());
    }
    System.out.println(cad.precoComDesconto(10));
    System.out.println(cad.precoComDesconto(90, 8));
    }
}
