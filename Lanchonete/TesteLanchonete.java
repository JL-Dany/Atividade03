package com.mycompany.testelanchonete;

public class TesteLanchonete {

    public static void main(String[] args) {
    Item l = new Lanche ("X-burguer", 18, 2);
    Item b = new Bebida ("Suco", 8, 300);
    
    Item [] comidas ={
    new Lanche ("X-burguer", 18, 2),
    new Bebida ("Suco", 8, 300),
    };
    for (Item item: comidas){
    System.out.println (item.descrever());
    }
    System.out.println (l.total());
    System.out.println (l.total(2));
            
    }
}
