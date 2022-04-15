package com.company.Factory.main;

import com.company.Factory.transporte.Factory;
import com.company.Factory.transporte.Transporte;

import java.util.Scanner;

public class MainFactory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese que objeto desea crear: 1.Moto 2.Auto ");
        Transporte t1 = Factory.fabricar(sc.nextInt());
        t1.arrancar();
    }
}
