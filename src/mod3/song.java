/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod3;

/**
 *
 * @author SWIFT
 */
public class song {
    public String title;
    public String[] artist;
    public int duration;
    
    public void setTitle(String judul) {
        this.title = judul;
    }
    
    public void setArtist(String[] artist) {
        this.artist = artist;
    }
    
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    public void getTitle() {
        System.out.println("Title : " + this.title);
    }
    
    public void getDuration() {
        int menit = this.duration / 60;
        int detik = this.duration % 60;
        System.out.println("Duration : " + menit + ":" + detik);
    }
    
    public void getArtist() {
        System.out.print("Artist : ");
        for (int i = 0; i < this.artist.length; i++) {
            System.out.print(this.artist[i] + ", ");
        }
        System.out.println("");
    }
}
