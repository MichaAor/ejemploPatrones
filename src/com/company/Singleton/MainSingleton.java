package com.company.Singleton;

import com.company.Singleton.Empleado;

public class MainSingleton {

    public static void main(String[] args) {
	Empleado empleado = Empleado.getInstance("Jose",28,"Gerente");
	Empleado empleado1 = Empleado.getInstance("Mario",50,"Jefe");

        System.out.println(empleado.toString());
        System.out.println(empleado1.toString());
    }
}
