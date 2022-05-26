package modell;

public class Hajo {
    private int[] pozicio;

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }
    
    public String talalat(int poz){
        //eldöntés tétele
        int i = 0;
        while(i < 3 && !(pozicio[i] == poz)){
            i++;
        }
        
        return i < 3 ? "talált" : "mellé";
    }
    
    public int[] getPozicio(){
        return pozicio;
    }
}
