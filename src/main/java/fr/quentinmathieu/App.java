package fr.quentinmathieu;

import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        // init reader for user prompt
        Scanner reader = new Scanner(System.in);

        System.exit(0);
        while (true){
            System.out.println("Enter a number: ");
            String cardNumberString =  reader.nextLine();
            try {
                long cardNumber =  Long.parseLong(cardNumberString.replace(" ", ""));
                checkCardNumber(cardNumber);
                }
            catch (Exception e) {
            // close de prompt's reader
            reader.close();
                System.out.println("Veuillez rentrer une valeur correcte\n");
                System.exit(-1);
            }
            
        }
    }


    public static boolean checkCardNumber(long cardNumber){
        // select mult factor depends if the length of the numbers string is even or not
        int multFactor = (Long.toString(cardNumber).length()%2 == 0) ? 1 : 2;
        long sum = 0;

        // While the number still > 0 divide by 10 and work on each number
        while (cardNumber > 0){

            long currentNum  = cardNumber%10;
            cardNumber /= 10;
        
            
            currentNum = currentNum*multFactor;
            long currentNumFinal = calcSumNumbers(currentNum);
            
            sum += currentNumFinal;

             // switch the mult factor = 1 OR 2
             multFactor = (multFactor == 1) ? 2 : 1;

        }
        System.out.println(sum);

        // check if the sum end by 0
        if (sum % 10 == 0 ){
            System.out.println("OK");
            return true;
        }
        else {
            System.out.println("BAD INPUT");
            return false;
        }
    }

    // add each digit that compose a number
    public static long calcSumNumbers(long currentNum){
        long currentNumFinal = 0;
        while (currentNum > 0){
            currentNumFinal+=currentNum%10;
            currentNum /= 10;
        }

        return currentNumFinal;
    }
}
