package com.mycompany.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
    Publicacao l = new Livro ("Dom Casmurro", 1899, 256);
    Publicacao r = new Revista ("Ciencia Hoje", 2024, 301);
    
    Publicacao [] publicacoes ={
    new Livro ("Dom Casmurro", 1899, 256),
    new Revista ("Ciencia Hoje", 2024, 301),
    };
    for (Publicacao item: publicacoes){
    System.out.println (item.citar());
    }
    System.out.println (l.emprestar(7));
    System.out.println (l.emprestar(7, "Ana"));
    }
}
