import java.math.*;
import java.util.Random;
public class Inheritance{
    static String regularExpression = "0-9";

    public static void ValidNumber(String s1){
        final int numberLength = 10;
        int numLength_new = 11;
        class PhoneNumber{
            String formattedNumber = null;
            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(regularExpression,"hi");
                if(currentNumber.length() == numberLength)
                    formattedNumber = currentNumber;
                else
                    formattedNumber = null;
            }
            public String getNumber(){
                return formattedNumber;
            }

        }

    }
    public static void main(String []args){
        Object x = new Object();
       
    }
}