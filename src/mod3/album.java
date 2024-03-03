/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod3;
import mod3.song;

/**
 *
 * @author SWIFT
 */
public class album {
    public String title;
    public int year;
    public song[] songs;
    public int ptr;
    
    public album() {
        this.songs = new song[20];
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setYear (int year) {
        this.year = year;
    }
    
    public void getTitle() {
        System.out.println("Title : " + this.title);
    }
    
    public void getYear() {
        System.out.println("Year : " + this.year);
    }
    
    public void addSong(song s) {
        if (ptr == songs.length) {
            System.out.println("Array sudah terisi");
        }
        songs[ptr] = s;
        ptr++;
        System.out.println("Lagu telah ditambahkan ke Album " + this.title);
    }
    
    public void displayInfo() {
        if (ptr == 0) {
            System.out.println("Tidak ada lagu disini");
        }
        System.out.println("Album info");
        System.out.println("Title : " + this.title);
        System.out.println("Year : " + this.year + "\n");
        System.out.println("Song List");
        for (int i = 0; i < ptr; i++) {
            System.out.print((i + 1) + ". ");
            songs[i].getTitle();
            songs[i].getArtist();
            songs[i].getDuration();
            System.out.println("");
        }
    }
}
