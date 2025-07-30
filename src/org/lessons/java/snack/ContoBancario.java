package org.lessons.java.snack;

public class ContoBancario {

    private static int numeroConto;
    private static float saldo;


    public ContoBancario(int numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }


    public static void setDeposito(float denaro){
       ContoBancario.saldo += denaro;
    }

    public static void setPrelievo(float denaro){
        if(saldo > denaro){
            ContoBancario.saldo -= denaro;
        } else{
            System.out.println("Saldo insufficiente");
        }
    }

    public static float getSaldo(){

        return ContoBancario.saldo = saldo;
    }


}
