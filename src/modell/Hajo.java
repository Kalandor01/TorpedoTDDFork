package modell;

public class Hajo {
    
    public static final String TALALT = "talált";
    public static final String SULLYEDT = "süllyedt";
    public static final String MELLE = "mellé";
    
    private int[] poziciok;
    int talalatSzama;
    boolean elsullyedt;

    public Hajo(int[] pozicio) {
        elsullyedt = false;
        talalatSzama =0;
        this.poziciok = pozicio;
    }
    
    public String talalatEllenorzes(int poz){
        //eldöntés tétele
        int i = 0;
        while(i < poziciok.length && !(poziciok[i] == poz)){
            i++;
        }
        boolean talalt = i < poziciok.length;
        
        String lovesEredmenye;
        if(talalt){
            talalatSzama++;
            lovesEredmenye = TALALT;
            if(talalatSzama == poziciok.length){
                lovesEredmenye = SULLYEDT;
                elsullyedt = true;
            }
        }else{
            lovesEredmenye = MELLE;
        }
        
        return lovesEredmenye;
    }
    
    public int[] getPozicio(){
        return poziciok;
    }

    public boolean isElsullyedt() {
        return elsullyedt;
    }

    public int getTalalatSzama() {
        return talalatSzama;
    }
    
    
}
