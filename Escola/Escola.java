
package com.mycompany.escola;

public class Escola {

    public static void main(String[] args) {
    Funcionario p = new Professor ("Ana", 3000, "POO");
    Funcionario c = new Coordenador ("Bruno", 4500, "Pedagógico");
    
    Funcionario[] equipe = {
    new Professor ("Ana", 3000, "POO"),
    new Coordenador ("Bruno", 4500, "Pedagógico")
    };
    for (Funcionario item: equipe){
    System.out.println (item.descrever());
}
System.out.println (p.bonificacao());
System.out.println (p.bonificacao(20));
}
}
