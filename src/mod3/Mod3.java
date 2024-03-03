/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod3;
import mod3.song;
import mod3.album;

/**
 *
 * @author SWIFT
 */
public class Mod3 {

    public static void main(String[] args) {
        // TODO code application logic here
        album ab = new album();
        ab.setTitle("Kayaknya Hits");
        ab.setYear(2023);
        
        song s = new song();
        s.setTitle("LiSA - HELLO WORLD");
        s.setDuration(294);
        s.setArtist(new String[]{"LiSA", "Lilas Ikuta"});
        ab.addSong(s);
        ab.displayInfo();
        
        song s1 = new song();
        s1.setTitle("Film Favorit");
        s1.setDuration(226);
        s1.setArtist(new String[]{"Sheila On 7"});
        ab.addSong(s1);
        ab.displayInfo();
        
        song s2 = new song();
        s2.setTitle("Answer");
        s2.setDuration(246);
        s2.setArtist(new String[]{"Lilas Ikuta"});
        ab.addSong(s2);
        ab.displayInfo();
        
        song s3 = new song();
        s3.setTitle("Zenryoku Shounen");
        s3.setDuration(273);
        s3.setArtist(new String[]{"SUKiMASWITCH"});
        ab.addSong(s3);
        ab.displayInfo();
        
        song s4 = new song();
        s4.setTitle("ノスタルジア");
        s4.setDuration(310);
        s4.setArtist(new String[]{"幾田りら"});
        ab.addSong(s4);
        ab.displayInfo();
    } 
}
