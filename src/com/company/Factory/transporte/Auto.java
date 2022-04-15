package com.company.Factory.transporte;

public class Auto implements Transporte{
    @Override
    public void arrancar() {
        System.out.println("Arrancando:" + this.getClass().getSimpleName());
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo:" + this.getClass().getSimpleName());
    }

    @Override
    public String tipo() {
        return this.getClass().getSimpleName();
    }
}
