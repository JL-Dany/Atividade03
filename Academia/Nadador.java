package com.mycompany.testeacademia;

public class Nadador extends Atleta{
private String estilo;

 public Nadador (String nome, String estilo){
 super (nome);
 this.estilo = estilo;
 }
 @Override
 public String apresentar(){
 return "Nome: "+nome+ ", estilo " +estilo;

 }
    
}
