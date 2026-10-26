
package com.mycompany.escola;

public class Funcionario {
    protected String nome;
    protected double salario;
    
    public Funcionario (String nome, double salario){
    this.nome = nome;
    this.salario = salario;
    }
    public String descrever(){
    return "Funcionario: "+nome;
    }
    public double bonificacao (){
    return salario*0.10;
    }
    public double bonificacao (double percentual){
    return salario*(percentual/100);
    }
}
