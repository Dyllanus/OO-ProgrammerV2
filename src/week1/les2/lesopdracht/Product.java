package week1.les2.lesopdracht;

//public class Product {
//    private String naam;
//    private String productcode;
//    private Double prijs;
//    private Double btw;
//
//    public Product(String nm, String prcode, Double pr) {
//        naam = nm;
//        productcode = prcode;
//        prijs = pr;
//    }
//    public Product(String nm, String prcode){
//        naam = nm;
//        productcode = prcode;
//    }
//
//    public void setBTW(Double btw) {
//        btw = btw;
//    }
//    public void verhoogPrijsMet(Double extra){
//        prijs = prijs + prijs * (extra/100);
//    }
//    public void setPrijs(Double prijs) {
//        this.prijs = prijs;
//    }
//    public Double getBTW(){
//        return btw;
//    }
//    public Double btwBedrag(){
//        return prijs * (btw / 100);
//    }
//    public Double getPrijs(){
//        return prijs;
//    }
//    public String toString(){
//        return naam + " heeft code " + productcode + " en kost " + prijs + "; de btw is " + btw;
//    }
//}

    public class Product {
        private String naam;
        private String code;
        private double prijs;
        private double btw;

        public Product(String nm, String cd, double pr) {
            naam = nm;
            code = cd;
            prijs = pr;
        }
        public Product (String nm, String cd){
            naam = nm;
            code = cd;
        }

        public void setBTW(double bt) {
            btw = bt;
        }
        public void setPrijs(double pr) {
            prijs = pr;
        }
        public double getBTW(){
            return btw;
        }
        public  double getPrijs(){
            return prijs;
        }

        public void verhoogPrijsMet(double extra) {
            prijs = prijs + prijs * (extra/100);
        }
        public double btwBedrag(){
            return prijs * (btw/100);
        }
        public String toString(){
            String s = naam + " heeft code " + code + " en kost ";
            s = s + prijs + "; de btw is " + btw + "%";
            return s;
        }
    }