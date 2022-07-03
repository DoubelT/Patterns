package Compositum;

public class Soldat extends Einheit {

    private String dg;

    public Soldat(String dg){
        this.dg = dg;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }
}
