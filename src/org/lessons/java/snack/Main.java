package org.lessons.java.snack;

public class Main {

    public static void main(String[] args) {
        Studente studente1 = new Studente("Marrio", "Rossi", 30);

        System.out.println(studente1.datiStudente());

        System.out.println(ContoBancario.getSaldo());

        ContoBancario.setDeposito(345.75f);


        System.out.println(ContoBancario.getSaldo());

        ContoBancario.setPrelievo(45);

        ContoBancario.setPrelievo(300.74f);

        System.out.println(ContoBancario.getSaldo());




    }
    
}
