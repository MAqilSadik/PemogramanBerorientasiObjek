/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author User
 */
public class Lingkaran {
     int r;
    
    public void hitungLuas() {
        double hasil;
        if(r % 7 == 0) {
            hasil = r * r * 22 / 7;
        } else {
            hasil = r * r * 3.14;
        }
        
        System.out.println("Luas Lingkaran: " + hasil + " cm");
    }
    
    public void hitungKeliling() {
        double hasil;
        if(r % 7 == 0) {
            hasil = 2 * r * 22 / 7;
        } else {
            hasil = 2 * r * 3.14;
        }
        
        System.out.println("Keliling Lingkaran: " + hasil + " cm");
    }
}
