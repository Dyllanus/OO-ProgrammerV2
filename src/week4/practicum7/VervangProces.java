package week4.practicum7;

public class VervangProces implements OpmaakProces{
    private String oud;
    private String nieuw;

    public VervangProces(String oud, String nieuw){
        this.oud = oud;
        this.nieuw = nieuw;
    }

    @Override
    public String maakOp(String input) {
        if (input.contains(oud)){
           input = input.replace(oud, nieuw);
        }
        return input;
    }
}
