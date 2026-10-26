
package com.mycompany.testelanchonete;

public class Bebida extends Item {
 private int volume;
 
 public Bebida (String nome, double preco, int volume){
 super (nome, preco);
 this.volume = volume;
 }
 @Override
 public String descrever (){
 return "Nome: "+nome+ ", "+volume+"ml";
 }
   
}
