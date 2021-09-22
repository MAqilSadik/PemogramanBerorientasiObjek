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
public class BangunRuangMain {
    public static void main(String[] args) {
        bola bola = new bola();
        bola.r = 7;
        bola.hitungVol();
        bola.hitungLuasSelimut();
        
        kerucut kerucut = new kerucut();
        kerucut.r = 15;
        kerucut.s = 10;
        kerucut.tinggi =35;
        kerucut.hitungVol();
        kerucut.hitungLuasSelimut();
        
        tabung tabung = new tabung();
        tabung.r = 10;
        tabung.tinggi = 15;
        tabung.hitungVol();
        tabung.hitungLuasSelimut();
    }
}
