/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kodluyoruzodev1;

import java.util.Scanner;

/**
 *
 * @author Casper
 */
public class KodluyoruzOdev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner imp = new Scanner(System.in);
        
        System.out.println("Notlarinizi giriniz : ");
        
        System.out.print("Matematik : ");
        matematik = imp.nextInt();
        
        System.out.print("Fizik : ");
        fizik = imp.nextInt();
        
        System.out.print("Kimya : ");
        kimya = imp.nextInt();
        
        System.out.print("Turkce : ");
        turkce = imp.nextInt();
        
        System.out.print("Tarih : ");
        tarih = imp.nextInt();
        
        System.out.print("Muzik : ");
        muzik =imp.nextInt();
        
        double ortalama = ((fizik + kimya + matematik + turkce + tarih + muzik + kimya)/6);
        
        String kontrol = ortalama > 60 ? "Sinifi Gectiniz" : "Sinifta Kaldiniz";
        
        System.out.println("Ortalamaniz : " + ortalama);
        System.out.print(kontrol);
        
    }
    
}
