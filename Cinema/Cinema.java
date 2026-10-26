
package com.mycompany.cinema;

public class Cinema {

    public static void main(String[] args) {
    Ingresso m = new MeiaEntrada("Divertida Mente",40,"123");
    Ingresso v = new Vip("Duna",40,"Setor A");
    
    Ingresso [] cinema ={
    new MeiaEntrada("Divertida Mente",40,"123"),
    new Vip("Duna",40,"Setor A"),
    };
    for (Ingresso item: cinema){
    System.out.println(item.valorFinal());
    }
    System.out.println(m.resumo());
    System.out.println(m.resumo(true));
    }
}
