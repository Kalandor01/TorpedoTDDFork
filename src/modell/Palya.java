package modell;

import modell.Hajo;
import java.util.Scanner;

public class Palya {

    private static Scanner sc = new Scanner(System.in);
    
    private Hajo hajo;
    
    public Palya() {
        jatekIndito();
    }

    public void jatekIndito() {
        System.out.println("Torpedó játék");
        
        hajo = ujPoz();
        
        int talaltSzam = 0, lovesSzam = 0;
        boolean sullyedt;
        do {
            System.out.print("hova lősz: "); 
            int poz = sc.nextInt();
            if(talalt(poz)){
                talaltSzam++;
                System.out.println("talált!");
            }else{
                System.out.println("mellé");
            }
            lovesSzam++;
            sullyedt = talaltSzam == 3;
        } while (!sullyedt);
        System.out.println("Süllyedt!");
        System.out.printf("Eredmény: %d lövésből!", lovesSzam);
    }

    private Hajo ujPoz() {
        int kezd = (int)(Math.random() * 5);
        int poz[] = new int[3];
        for (int i = 0; i < 3; i++) {
            poz[i] = kezd + i;
        }
        
        return new Hajo(poz);
    }
    
    private boolean talalt(int poz){
        int i = 0;
        while(i < 3 && !(hajo.getPozicio()[i] == poz)){
            i++;
        }
        return i < 3;
    }
    
}
