package teszt;

import modell.Hajo;

public class TorpedoTeszt {

    private Hajo hajo;
    
    public TorpedoTeszt()
    {
        System.out.println("Tesztesetek");
        tesztLovesTalalt(4);
        tesztLovesNemTalalt(5);
        tesztLovesSujedt();
        System.out.println("Tesztesetek vége");
    }
    
    public static void main(String[] args) {
        new TorpedoTeszt();
    }
    
    public void tesztLovesTalalt(int poz){
        System.out.print("Találat teszt...");
        hajo = new Hajo(new int[]{2,3,4});
        String t = this.hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        System.out.println("Sikeres!");
    }
    
    public void tesztLovesNemTalalt(int poz){
        System.out.print("Nem találat teszt...");
        hajo = new Hajo(new int[]{2,3,4});
        String t = this.hajo.talalat(poz);
        assert t.equals("mellé") : "nem jó a nem találat ellenőrzése";
        System.out.println("Sikeres!");
    }
    
    public void tesztLovesSujedt(){
        System.out.print("Sülyedt teszt...");
        hajo = new Hajo(new int[]{2,3,4});
        this.hajo.talalat(2);
        this.hajo.talalat(3);
        this.hajo.talalat(4);
        assert this.hajo.isElsulyedt() : "nem jó a sülyedt ellenőrzése";
        System.out.println("Sikeres!");
    }
}
