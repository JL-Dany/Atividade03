package com.mycompany.biblioteca;

public class Publicacao {

    protected String titulo;
    protected int ano;
    
    public Publicacao (String titulo, int ano){
    this.ano = ano;
    this.titulo = titulo;
    
    }
   public String citar(){
   return "Título: "+titulo+ ", ano: "+ano;
   }
   public String emprestar (int dias){
   return "Empréstimo de "+dias+" dias";
   }
   public String emprestar (int dias, String leitor){
   return "Empréstimo de "+dias+" dias para o leitor "+leitor;
   }
}
