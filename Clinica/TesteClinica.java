package com.mycompany.testeclinica;

public class TesteClinica {

    public static void main(String[] args) {
    Pessoa p = new Paciente ("Karla", "Unimed");
    Pessoa m = new Medico ("Diego", "Clinica");
    
    Pessoa [] pessoas ={
    new Paciente ("Karla", "Unimed"),
    new Medico ("Diego", "Clinica"),
   
    };
    for (Pessoa item: pessoas){
        System.out.println (item.ficha());
    }
     System.out.println (p.agendar("12/10/2026"));
     System.out.println (p.agendar("12/10/2026", "14:00"));
    }
}
