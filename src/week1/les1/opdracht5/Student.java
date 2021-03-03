package week1.les1.opdracht5;

public class Student {

    private String naam;

    private int studentNummer;

    public Student(String nm){
        naam= nm;
    }

    public Student(String nm, int stuNR){
        naam = nm;

        studentNummer = stuNR;

    }

    public String getNaam(){
        return naam;
    }

    public int getStudentNummer(){
        return studentNummer;
    }

    public void setStudentNummer(int stuNR){
        studentNummer = stuNR;
    }

    public String toString(){
        return "Deze student heet " + naam + " en heeft nummer " + studentNummer;
    }
}
