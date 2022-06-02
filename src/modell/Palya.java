package modell;

public class Palya {

    public static final int PALYA_HOSSZ = 7;
    public static final char HAJO_JEL = 'O';
    public static final char TALALT_JEL = 'X';
    public static final char MELLE_JEL = '~';
   
    private static int lovesekSzama;
    
    private Hajo hajo;
    private char[] palya;
    private boolean vanMegHajo;
    
    public Palya() {
        palyaReset();
    }
    
    private void palyaReset(){
        vanMegHajo = true;
        lovesekSzama = 0;
        palya = new char[PALYA_HOSSZ];
        for (int i = 0; i < PALYA_HOSSZ; i++) {
            palya[i] = '_'; 
        }
    }
    
    //hajotElhelyez()
    public void ujPoz() {
        int hajoHossz = 3;
        int kezd = (int)(Math.random() * (PALYA_HOSSZ - hajoHossz + 1));
        ujPoz(kezd, hajoHossz);
    }

    public void ujPoz(int kezd, int hajoHossz){
        //bejövő paraméterek ellenőrzése!!!!
        int poz[] = new int[hajoHossz];
        for (int i = 0; i < hajoHossz; i++) {
            int h = kezd + i;
            poz[i] = h;
            palya[h] = HAJO_JEL;
        }
        
        hajo = new Hajo(poz);
    }

    //jatekosLovesBeker()
    public void setPalya(int tipp){
        lovesekSzama++;
        if(hajo.talalatEllenorzes(tipp).equals(Hajo.TALALT)){
            palya[tipp] = Palya.TALALT_JEL;
            if(hajo.isElsullyedt()){
                vanMegHajo = false;
            }
        }else{
            palya[tipp] = Palya.MELLE_JEL;
        }
    }
    
    public char[] getPalya() {
        return palya;
    }

    public static int getLovesekSzama() {
        return lovesekSzama;
    }

    public boolean isVanMegHajo() {
        return vanMegHajo;
    }

    public Hajo getHajo() {
        return hajo;
    }
    
}
