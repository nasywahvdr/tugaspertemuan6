/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nasywah2405589.tugaspertemuan6;

/**
 *
 * @author Neyrin
 */

public class MainSegitiga {
    public static void main(String[] args) {
        // Objek segitiga1
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        System.out.println("Segitiga1:");
        System.out.println("Alas = " + segitiga1.getAlas());
        System.out.println("Tinggi = " + segitiga1.getTinggi());
        System.out.println("Sisi = " + segitiga1.getSisi());
        System.out.println("Luas = " + segitiga1.getLuas());
        System.out.println("Keliling = " + segitiga1.getKeliling());
        System.out.println();

        // Objek segitiga2
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        System.out.println("Segitiga2:");
        System.out.println("Alas = " + segitiga2.getAlas());
        System.out.println("Tinggi = " + segitiga2.getTinggi());
        System.out.println("Sisi = " + segitiga2.getSisi());
        System.out.println("Luas = " + segitiga2.getLuas());
        System.out.println("Keliling = " + segitiga2.getKeliling());
        System.out.println();

        // Objek segitiga3
        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        System.out.println("Segitiga3:");
        System.out.println("Alas = " + segitiga3.getAlas());
        System.out.println("Tinggi = " + segitiga3.getTinggi());
        System.out.println("Sisi = " + segitiga3.getSisi());
        System.out.println("Luas = " + segitiga3.getLuas());
        System.out.println("Keliling = " + segitiga3.getKeliling());
    }
}
