/*
 * File : MPoligon.java 08/03/2023
 * Penulis : Kamal Ariq
 * Deskripsi : driver class untuk poligon, persegi panjang, dan segitiga
 */
package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang : "+persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(4, 3, 3);
        segitiga.printInfo();
        System.out.println("Luas segitiga : "+segitiga.hitungLuas());

    }

}