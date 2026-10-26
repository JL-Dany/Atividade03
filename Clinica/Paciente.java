package com.mycompany.testeclinica;

public class Paciente extends Pessoa{
private String convenio;

public Paciente (String nome, String convenio){
super (nome);
this.convenio = convenio;
}
public String ficha(){
return "Paciente: "+nome+", convênio: "+convenio;
}
}
    
