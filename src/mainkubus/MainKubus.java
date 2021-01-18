/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainkubus;

/**
 *
 * @author MOKLET-2
 */
public class MainKubus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menghitung Luas Permukaan Kubus dengan rumus r*r*r");
        Kubus so = new Kubus();
        System.out.println("Rusuk : "+so.rusuk);
        System.out.println("Hasil : "+so.hasil);
    }
    
}
