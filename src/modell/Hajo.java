package modell;

public class Hajo {
    private boolean elsulyedt;
    private int talalat;
    private int[] pozicio;

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
        this.talalat = 0;
        this.elsulyedt = false;
    }
    
    public String talalat(int poz){
        //eldöntés tétele
        String resp;
        if(!elsulyedt)
        {
            int i = 0;
            while(i < pozicio.length && !(pozicio[i] == poz)){
                i++;
            }
            if(i<pozicio.length)
            {
                talalat++;
                resp = "talált";
                if(talalat>=pozicio.length)
                {
                    elsulyedt = true;
                    resp = "sülyedt";
                }
            }
            else
                resp = "mellé";
        }
        else
            resp = "sülyedt";
        return resp;
    }
    
    public int[] getPozicio(){
        return pozicio;
    }
    
    public boolean isElsulyedt(){
        return elsulyedt;
    }
}
