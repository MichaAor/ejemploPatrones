package com.company.Factory.transporte;

public class Factory {
    public static Transporte fabricar(int tipo){
        switch (tipo){
            case 1:
                return  new Moto();
            case 2:
                return new Auto();
            default:
                return null;
        }
    }
}
