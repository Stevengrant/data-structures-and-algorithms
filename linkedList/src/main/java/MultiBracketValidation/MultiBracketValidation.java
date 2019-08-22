package MultiBracketValidation;

public class MultiBracketValidation {
    public  boolean multiBracketValidation(String input){

        int round=0;
        int square =0;
        int curly =0;
        String[] splitString = input.split("");
        for ( int i = 0; i< splitString.length; i++){
            //check round
            if(splitString[i].equals("(")){
                round++;
            } else if (splitString[i].equals(")")){
                round--;
            }
            //check square
            else if(splitString[i].equals("[")){
                square++;
            } else if (splitString[i].equals("]")){
                square--;
            }
            //check curly
            else if(splitString[i].equals("{")){
                curly++;
            } else if (splitString[i].equals("}")){
                curly--;
            }
        }
        return round + square + curly == 0;
    }
    public MultiBracketValidation(){}
}
