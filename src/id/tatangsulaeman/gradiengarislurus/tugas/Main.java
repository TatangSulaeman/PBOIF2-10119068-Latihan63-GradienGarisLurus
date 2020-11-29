/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.gradiengarislurus.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Gradien Garis Lurus
 * 
 */
public class Main {
    public static void main(String[]args){
        Koordinat koordinat1 = new Koordinat(2,10,5,7);
        Koordinat koordinat2 = new Koordinat(5,1,3,12);
        
        String outputText = 
                "Garis yang melalui titik " + "(" + koordinat1.getX1() + "," + koordinat1.getY1() + ")" + "dan" + "(" + koordinat1.getX2() + ","+ koordinat1.getY2() + ")" + "\n" +
                "memiliki gradien sebesar " + koordinat1.hitungGradien() + "\n" + "\n" +
                "Garis yang melalui titik " + "(" + koordinat2.getX1() + "," + koordinat2.getY1() + ")" + "dan" + "(" + koordinat2.getX2() + ","+ koordinat2.getY2() + ")" + "\n" +
                "memiliki gradien sebesar " + koordinat2.hitungGradien() ;
        System.out.println(outputText);
        
    }
}
