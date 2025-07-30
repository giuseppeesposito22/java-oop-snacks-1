package org.lessons.java.snack;

public class RegistroStudenti {
    

    private Studente[] arrayStudenti;

    public RegistroStudenti(){
        this.arrayStudenti = new Studente[0];
    }


    public void addStudente(Studente studente) {

        Studente[] newArrayStudenti = new Studente[arrayStudenti.length + 1];

        for(int i = 0; i < arrayStudenti.length; i++){
            newArrayStudenti[i] = arrayStudenti[i];
        }

        newArrayStudenti[newArrayStudenti.length - 1] = studente;



        this.arrayStudenti = newArrayStudenti;
    }


    public void listaStudenti(){
        for(int i = 0; i < arrayStudenti.length; i++){
            System.out.println(arrayStudenti[i]);
        }
    }
    
    



}
