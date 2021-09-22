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
public class kerucut {
    int r, s, tinggi;
    
    public void hitungVol() {
        double hasil;
        if(r % 7 == 0) {
            hasil = 1 / 3 * 22 / 7 * r * r * tinggi;
        } else {
            hasil = 1 / 3 * 3.14 * r * r * tinggi;
        }
        
        System.out.println("Volume Kerucut: " + hasil + " cm");
    }
    
    public void hitungLuasSelimut() {
        double hasil;
        if(r % 7 == 0) {
            hasil = 22 / 7 * r * s;
        } else {
            hasil = 3.14 * r * s;
        }
        
        System.out.println("Luas Selimut Kerucut: " + hasil + " cm");
    }
}
