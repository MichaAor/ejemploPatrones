package com.company.Factory.transporte;

public class Moto implements Transporte{
    @Override
    public void arrancar() {
        System.out.println("Arrancando:" + this.getClass().getSimpleName());
    }

    @Override
    public void detener() {
        System.out.println("Detener:" + this.getClass().getSimpleName());
    }

    @Override
    public String tipo() {
        return this.getClass().getSimpleName();
    }
}
