package com.company.Singleton;

public class Empleado {
    private String nombre;
    private int edad;
    private String cargo;
                private static Empleado empleado;

    private Empleado(String nombre, int edad, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
    }

    public static Empleado getInstance(String nombre,int edad,String cargo){
        if(empleado == null){
            empleado = new Empleado(nombre,edad,cargo);
        }
        return empleado;
    }


    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "\n"+this.getClass().getSimpleName() +
                "\nNombre: " + this.getNombre() +
                "\nEdad: " + this.getEdad() +
                "\nCargo: " + this.getCargo();
    }
}
