/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author cinthya
 */
public class Film {
    String judul07D, genre07D, rate07D;
    int jumlahTiket07D, hargaTiket07D;
    int stok07D, jumlah07D;
    
    Film() {
    }
    
    Film(String jd, String gr, String rt, int jt, int ht) {
        judul07D = jd;
        genre07D = gr;
        rate07D = rt;
        jumlahTiket07D = jt;
        hargaTiket07D = ht;
    }
    
    void tampilFilm() {
        System.out.println("Judul: "+judul07D);
        System.out.println("Genre: "+genre07D);
        System.out.println("Rate: "+rate07D);
        System.out.println("Jumlah Tiket: "+jumlahTiket07D);
        System.out.println("Harga Tiket: "+hargaTiket07D);
    }
    
    void tambahTiket(int n) {
        jumlahTiket07D += n;
    }
    
    void kurangiTiket(int n) {
        jumlahTiket07D -= n;
//        if (stok07D > 0) {
//            stok07D--;
//            System.out.println("Tidak berhasil dikurangi. Stok sekarang: "+stok07D);
//        } else {
//            System.out.println("Maaf, tiket sudah habis!");
//        }
    }
    
    int totalRevenue() {
        return jumlahTiket07D+hargaTiket07D;
    }  
}
