package week1.praticum2A;

public class Zwembad {
    private Double breedte;
    private Double lengte;
    private Double diepte;

    public Zwembad(Double br, Double len, Double diep){
        breedte = br;
        lengte = len;
        diepte = diep;
    }
    public Zwembad(){
    }

    public Double getBreedte() {
        return breedte;
    }

    public Double getLengte() {
        return lengte;
    }

    public Double getDiepte() {
        return diepte;
    }

    public void setBreedte(Double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(Double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(Double diepte) {
        this.diepte = diepte;
    }
    public Double inhoud(){
        return  lengte * breedte * diepte;
    }
    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte+" meter diep";
    }
}
