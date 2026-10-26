
package com.mycompany.testeacademia;

public class TesteAcademia {

    public static void main(String[] args) {
    Atleta c = new Corredor ("Lia", 10);
    Atleta n = new Nadador ("Paulo", "crawl");
    
    Atleta [] atletas ={
    new Corredor ("Lia", 10),
    new Nadador ("Paulo", "crawl"),
    };
    for (Atleta item: atletas){
    System.out.println(item.apresentar());
    }
     System.out.println(c.registrarTempo(55.2));
     System.out.println(c.registrarTempo(58, "100m"));
    }
}
