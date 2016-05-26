package com.nazoweb;

public class Main {

    public static void main(String[] args) {

        int total;
        basicHamburger bHam = new basicHamburger("white bread", "beaf");
        healthyHamburger hHam = new healthyHamburger("white bread", "chicken");
        deluxHamburger dHam = new deluxHamburger("sesame roll", "beef");

//        bHam.add(2);
//        bHam.add(4);
//        hHam.add(5);
//        hHam.add(2);
//
//
//        System.out.println("Basic burger adds number: " +bHam.getId());
//        System.out.println("Healthy burger adds number: "+hHam.getId());
//        System.out.println(dHam.getPrice());

//        dHam.add();
//
//
//        dHam.deluxHambills();
        hHam.add(1);
        hHam.add(2);
        hHam.add(6);

        hHam.basicHambills();



        total= bHam.sum+hHam.sum+dHam.sum;
        System.out.println("Total bills: "+ total);
    }



}
