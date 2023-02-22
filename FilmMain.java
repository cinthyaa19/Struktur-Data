/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author cinthya
 */
public class FilmMain {
    public static void main(String[] args) {
        Film film1 = new Film();
        
        film1.judul07D = "Quantumania Mancing";
        film1.genre07D = "Action Comedy";
        film1.rate07D = "Remaja";
        film1.jumlahTiket07D = 3000;
        film1.hargaTiket07D = 40000;
        
        film1.tambahTiket(1);
        film1.kurangiTiket(3);
        film1.tampilFilm();
        
        int income = film1.totalRevenue();
        
        System.out.println("Total keuntungan tiket = "+income);
        
        System.out.println("================================================\n");
        Film film2 = new Film("Maniaquantum", "Horor", "Dewasa", 2000, 40000);
        film2.tampilFilm();
    }
}
