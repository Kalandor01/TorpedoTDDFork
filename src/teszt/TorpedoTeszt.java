package teszt;

import java.util.Arrays;
import modell.Hajo;
import modell.Palya;

public class TorpedoTeszt {

    private Hajo hajo;
    
    public TorpedoTeszt() {
        System.out.println("*** Tesztesetek ***");
        
        //hajo = new Hajo(new int[]{2,3,4});
        tesztLovesTalalt(4);
        tesztLovesNemTalalt(5);
        tesztLovesSullyedt();
        tesztLovesNemSullyedt();
        
        tesztUresPalya();
        tesztNemUresPalya();
        tesztHajoElhelyezese();
        
        System.out.println("*** Tesztesetek VÉGE ***");
    }

    public static void main(String[] args) {
        //new TorpedoTeszt().tesztLovesTalalt(4);
        //new TorpedoTeszt().tesztLovesNemTalalt(5);
        new TorpedoTeszt();
    }
    
    public void tesztLovesTalalt(int poz){
        System.out.println("--- Találat");
        hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalatEllenorzes(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        System.out.println("Találat teszt sikeres");
    }
    
    public void tesztLovesNemTalalt(int poz){
        System.out.println("--- Mellé");
        hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalatEllenorzes(poz);
        assert t.equals("mellé") : "nem jó a találat ellenőrzése";
        System.out.println("Mellé teszt sikeres");
    }
    
    public void tesztLovesSullyedt(){
        System.out.println("--- Süllyedt");
        hajo = new Hajo(new int[]{2,3,4});
        hajo.talalatEllenorzes(2);
        hajo.talalatEllenorzes(3);
        hajo.talalatEllenorzes(4);
        boolean s = hajo.isElsullyedt();
        assert s == true : "nem jó a találat ellenőrzése";
        System.out.println("Süllyedt teszt sikeres");
    }
    
    public void tesztLovesNemSullyedt(){
        System.out.println("--- NEM Süllyedt");
        hajo = new Hajo(new int[]{2,3,4});
        hajo.talalatEllenorzes(1);
        hajo.talalatEllenorzes(2);
        hajo.talalatEllenorzes(3);
        boolean s = hajo.isElsullyedt();
        assert s == false : "nem jó a találat ellenőrzése";
        System.out.println("NEM Süllyedt teszt sikeres");
    }
    
    /* további tesztek, nem lefejlesztve */
    public void tesztTalalatokSzama(){ }
    public void tesztHolTalaltakEl(){ }

    private void tesztUresPalya() {
        System.out.println("--- Üres pálya");
        Palya palya = new Palya();
        char[] gp = palya.getPalya();
        char[] up = new char[]{'_','_','_','_','_','_','_'};
        assert Arrays.equals(gp, up);
        System.out.println("Üres pálya teszt sikeres");
    }
    
    private void tesztNemUresPalya() {
        System.out.println("--- Nem Üres pálya");
        Palya palya = new Palya();
        palya.ujPoz();
        char[] gp = palya.getPalya();
        char[] up = new char[]{'_','_','_','_','_','_','_'};
        assert !Arrays.equals(gp, up);
        System.out.println("Nem Üres pálya teszt sikeres");
        System.out.print("pálya: ");
        System.out.println(gp);
    }

    private void tesztHajoElhelyezese() {
        System.out.println("--- Hajó elhelyezése");
        Palya palya = new Palya();
        palya.ujPoz(2, 3);
        char[] gp = palya.getPalya();
        char[] up = new char[]{'_','_','O','O','O','_','_'};
        assert Arrays.equals(gp, up);
        System.out.println("Hajó elhelyezése teszt sikeres");
        System.out.print(gp);
        System.out.print(" == ");
        System.out.println(up);
    }
    
}
