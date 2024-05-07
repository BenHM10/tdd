
public class StringCalculator {
    public int add(String text){
        if(text.equals("")){
            return 0;
        }else{
            String delimiter = ",";
            if(text.matches("//(.*)\n(.*)")){
                Character.toString(text.charAt(2));
                text = text.substring(4);
            }
            String num[] = splitNumbers(text, delimiter + "|\n");
            return sum(num);
        }
    }
    private int sum(String[]num){
        int sum = 0;
        String negString = "";
        for (String number : num){
            if(Integer.parseInt(number)<0){
                if (negString.equals("")){
                    negString = number;
                } else {
                    negString += ("," + number);
                }
            }
            if(Integer.parseInt(number)<1000){
                sum += Integer.parseInt(number);
            }
        }
        return  sum;
    }
    private String[] splitNumbers(String text, String s){
        return text.split(s);
    }
}

