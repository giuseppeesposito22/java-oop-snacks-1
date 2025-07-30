package org.lessons.java.snack;

public class ContoBancario {

    private int numeroConto;
    private float saldo;


    public ContoBancario(int numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public int getNumeroConto(){
        return this.numeroConto = numeroConto;
    }


    public void setDeposito(float denaro){
       this.saldo += denaro;
    }

    public void setPrelievo(float denaro){
        if(saldo > denaro){
            this.saldo -= denaro;
        } else{
            System.out.println("Saldo insufficiente");
        }
    }

    public float getSaldo(){

        return this.saldo = saldo;
    }


}
