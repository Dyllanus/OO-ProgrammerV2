package week4.practicum7;

import java.util.Arrays;
import java.util.List;

public class CensorProces implements  OpmaakProces{
    public CensorProces(){}

    @Override
    public String maakOp(String input) {
        List<String> ongewensteWoorden = Arrays.asList("moet" , "jaar");
        for(String s : ongewensteWoorden){
            if(input.contains(s)){
                input = input.replace(s, "****");
            }
        }
        return input;
    }

}