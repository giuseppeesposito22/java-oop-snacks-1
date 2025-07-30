package org.lessons.java.snack;

public class Studente {

     private String nome;
    private String cognome;
    private int eta; 

    public Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    

    @Override
    public String toString() {
        return  nome + " " + cognome + ", " + eta + " anni";
    }



    public String datiStudente(){
        return(nome + " " + cognome + ", " + eta + " anni");
    }

}
