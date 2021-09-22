/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author User
 */
public class tabung {
    int r, tinggi;
    
    public void hitungVol() {
        double hasil;
        if(r % 7 == 0) {
            hasil = 22 / 7 * r * r * tinggi;
        } else {
            hasil = 3.14 * r * r * tinggi;
        }
        
        System.out.println("Volume Tabung: " + hasil + " cm");
    }
    
    public void hitungLuasSelimut() {
        double hasil;
        if(r % 7 == 0) {
            hasil = 2 * 22 / 7 * r * tinggi;
        } else {
            hasil = 2 * 3.14 * r * tinggi;
        }
        
        System.out.println("Luas Selimut Tabung: " + hasil + " cm");
    }
}
