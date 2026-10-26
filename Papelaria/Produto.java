package com.mycompany.testepapelaria;

public class Produto {
 protected String nome;
 protected double preco;
 
 public Produto (String nome, double preco){
 this.nome = nome;
 this.preco = preco;
}
 public String descrever(){
 return "Produto: "+nome;
 }
 public double precoComDesconto (double percentual){
 return preco - (preco*(percentual/100));
 }
 public double precoComDesconto (double percentual, double minimo){
 double precoFinal = preco - (preco*(percentual/100));
 
 if (precoFinal < minimo){
 return minimo;
 }else{
 return precoFinal;
 }
}
}
