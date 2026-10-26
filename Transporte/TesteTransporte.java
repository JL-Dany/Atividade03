package com.mycompany.testetransporte;

public class TesteTransporte {

    public static void main(String[] args) {
    Transporte v = new Van ("Centro", 15);
    Transporte o = new OnibusEscolar ("Bairro", 2);
    
    Transporte [] transportes ={
    new Van ("Centro", 15),
    new OnibusEscolar ("Bairro", 2),
    };
    for (Transporte item: transportes){
    System.out.println (item.anunciar());
    }
    System.out.println (v.lotacao(12));
    System.out.println (v.lotacao(12, 15));
    }
}
