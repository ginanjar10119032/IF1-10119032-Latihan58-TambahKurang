/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan58.tambahkurang;


/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi subclass SelisihBilangan
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = " + (getX() - getY()));
    }
}