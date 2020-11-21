/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan54.objectorientedkoordinat;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan satu warna dengan beserta koordinatnya
 *                     dengan berbasis objek
 */
public class WarnaKoordinat extends Koordinat{
     public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }
    
    public String getNamaWarna() {
        return this.namaWarna;
    }
    
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}