package org.lessons.java.snack;

public class Main {

    public static void main(String[] args) {
        Studente studente1 = new Studente("Marrio", "Rossi", 30);
        Studente studente2 = new Studente("Luigi", "Verdi", 20);


        System.out.println(studente1.datiStudente());

        ContoBancario conto1 = new ContoBancario(22333344);

        System.out.println(conto1.getSaldo());

        conto1.setDeposito(100.50f);
        
        System.out.println(conto1.getSaldo());

        conto1.setPrelievo(50);

        System.out.println(conto1.getSaldo());

        System.out.println(conto1.getNumeroConto());


        RegistroStudenti registro1 = new RegistroStudenti();

    

       registro1.addStudente(studente1);
       registro1.addStudente(studente2);

       registro1.listaStudenti();
        

    }
    
}
