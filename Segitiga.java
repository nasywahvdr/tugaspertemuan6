/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nasywah2405589.tugaspertemuan6;

/**
 *
 * @author Neyrin
 */

public class Segitiga {
    // Atribut
    private double alas;
    private double tinggi;
    private double sisi;

    // Konstruktor default
    public Segitiga() {
        alas = 0;
        tinggi = 0;
        sisi = 0;
    }

    // Konstruktor berparameter
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    // Getter
    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public double getKeliling() {
        return 3 * sisi;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Setter
    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}
