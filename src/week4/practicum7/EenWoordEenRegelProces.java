package week4.practicum7;

public class EenWoordEenRegelProces implements OpmaakProces{
    public EenWoordEenRegelProces(){}
    @Override
    public String maakOp(String input) {
        if(input.contains(".")){
            input = input.replaceAll(" ", "\n");
        }
        return input;
    }
}
