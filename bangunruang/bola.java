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
public class bola {
     int r;
    
    public void hitungVol() {
        double hasil;
        if(r % 7 == 0) {
            hasil =  4 * 22 / 7 / 3 * r * r * r;
        } else {
            hasil =  4 * 3.14 / 3 * r * r * r;
        }
        
        System.out.println("Volume Bola: " + hasil + " cm");
    }
    
    public void hitungLuasSelimut() {
        double hasil;
        if(r % 7 == 0) {
            hasil = 4  * 22 / 7 * r * r;
        } else {
            hasil = 4 * 3.14 * r * r;
        }
        
        System.out.println("Luas Selimut Bola: " + hasil + " cm");
    }
}
