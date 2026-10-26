package com.mycompany.testeacademia;

public class Corredor extends Atleta{
private double distanciaKm;

 public Corredor (String nome, double distanciaKm){
 super (nome);
 this.distanciaKm = distanciaKm;
 }
 @Override
 public String apresentar(){
 return "Nome: "+nome+ ", " +distanciaKm+ "Km";

 }
}
