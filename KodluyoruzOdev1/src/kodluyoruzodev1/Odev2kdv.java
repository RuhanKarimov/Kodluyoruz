/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kodluyoruzodev1;

import java.util.Scanner;

/**
 *
 * @author Casper
 */
public class Odev2kdv {
    public static void main(String[] args){
        double tutar;
        Scanner imp = new Scanner(System.in);
        
        System.out.print("Tutar giriniz : ");
        tutar = imp.nextDouble();
        
        double kdv = tutar <= 1000 ? 0.18 : 0.08;
        
        double kdvTutar = tutar + tutar*kdv;
        
        System.out.println("KDV orani : " + kdv);
        System.out.println("KDV\'li tutar : " + kdvTutar);
        System.out.println("KDV\'siz tutar : " + tutar);
    }
}
