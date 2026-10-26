package com.mycompany.testetransporte;

public class OnibusEscolar extends Transporte{
private int monitores;

public OnibusEscolar (String linha, int monitores){
super (linha);
this.monitores = monitores;
}
public String anunciar (){
return "Onibus da linha " + linha + ", " + monitores + " monitores";
}

}