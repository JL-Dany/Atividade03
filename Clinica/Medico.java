
package com.mycompany.testeclinica;

public class Medico extends Pessoa{
private String especialidade;

public Medico (String nome, String especialidade){
super (nome);
this.especialidade = especialidade;
}
public String ficha(){
return "Medico: "+nome+ ", especialidade: "+especialidade;
}
}