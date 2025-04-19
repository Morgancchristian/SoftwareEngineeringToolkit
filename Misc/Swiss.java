package SoftwareEngineeringToolkit.Misc;

import java.util.*;

public class Swiss {


    public ArrayList<Character> parseArgument (String[] args) {

        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            String item = args[i].trim().toLowerCase();

            for (int j = 0; j < item.length(); j++) {
                arrayList.add(item.trim().charAt(j));
            } 
        }
        return arrayList;
   }

   public ArrayList<Character> lettersOnly(ArrayList<Character> arrayList) {
        ArrayList<Character> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
                char elem = arrayList.get(i);
                
                switch (elem) {
                    case 'a':
                        newArrayList.add(elem);
                        break;
                    case 'b':
                        newArrayList.add(elem);
                        break;
                    case 'c':
                        newArrayList.add(elem);
                        break;
                    case 'd':
                        newArrayList.add(elem);
                        break;
                    case 'e':
                        newArrayList.add(elem);
                        break;
                    case 'f':
                        newArrayList.add(elem);
                        break;
                    case 'g':
                        newArrayList.add(elem);
                        break;
                    case 'h':
                        newArrayList.add(elem);
                        break;
                    case 'i':
                        newArrayList.add(elem);
                        break;
                    case 'j':
                        newArrayList.add(elem);
                        break;
                    case 'k':
                        newArrayList.add(elem);
                        break;
                    case 'l':
                        newArrayList.add(elem);
                        break;
                    case 'm':
                        newArrayList.add(elem);
                        break;
                    case 'n':
                        newArrayList.add(elem);
                        break;
                    case 'o':
                        newArrayList.add(elem);
                        break;
                    case 'p':
                        newArrayList.add(elem);
                        break;                    
                    case 'q':
                        newArrayList.add(elem);
                        break;
                    case 'r':
                        newArrayList.add(elem);
                        break;
                    case 's':
                        newArrayList.add(elem);
                        break;
                    case 't':
                        newArrayList.add(elem);
                        break;
                    case 'u':
                        newArrayList.add(elem);
                        break;
                    case 'v':
                        newArrayList.add(elem);
                        break;
                    case 'w':
                        newArrayList.add(elem);
                        break;
                    case 'x':
                        newArrayList.add(elem);
                        break;
                    case 'y':
                        newArrayList.add(elem);
                        break;
                    case 'z':
                        newArrayList.add(elem);
                        break;
                    default:
                        break;
                }
            }
            return newArrayList;
    }

    public boolean palindrome(ArrayList<Character> sequenceToTest) {
        
        ArrayList<Character> sequenceReversed = new ArrayList<>();
        
        Stack<Character> stack = new Stack<>();
        for (Character elem : sequenceToTest) {
            stack.push(elem);
        }

        for (int i = 0; i < sequenceToTest.size(); i++) {
            sequenceReversed.add(stack.pop());
        }

        boolean isPallindrome = true;

        for (int j = 0; j < sequenceToTest.size(); j++) {
            if (sequenceToTest.get(j) != sequenceReversed.get(j)) {
                isPallindrome = false;
            }
        }
        return isPallindrome;
    }

    public boolean validOctalNum(ArrayList<Character> numToTest) {
        boolean isOctalNum = true;
        for (int i =  0; i < numToTest.size(); i++) {
            char num = numToTest.get(i);
            switch (num) {
                case '0':
                    break;
                case '1':
                    break;
                case '2': 
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                default:
                    isOctalNum = false;
                    break;
            }
        }
        return isOctalNum;
    }

    public long octalToDecimal(ArrayList<Character> octalSequence) {
        long octalNum = 0;
        int exponent = 0;
        for (int i = octalSequence.size()-1; i >= 0; i--) {
            long num = Character.getNumericValue(octalSequence.get(i));
            octalNum += num * Math.pow(8,exponent);
            exponent++;
        }
        return octalNum;
    }

    public long addition(long octalDecimalForm, long decimalNum) {
        long result = octalDecimalForm + decimalNum;
        return result;
    }

    public long convertDecimalToOctal(long numToConvert) {
        long octal = 0;
        int place = 1;  
        
        while (numToConvert > 0) {
            long remainder = numToConvert % 8;
            octal += remainder * place;
            numToConvert /= 8;
            place *= 10;  
        }
        return octal;
    }

    public static void main(String[] args) {
        Swiss swiss = new Swiss();
        
        // Testing parseArgument 
        ArrayList<Character> test = swiss.parseArgument(args);
        for (Character item : test) {
            System.out.print(item);
        }
        System.out.println();
        /* Testing Palindrome
        System.out.println();
        // Testing lettersOnly
        ArrayList<Character> test2 = swiss.lettersOnly(test);
        for (Character item2 : test2) {
            System.out.print(item2);
        }
        System.out.println();
        // Testing palindrome
        System.out.println(swiss.palindrome(test2));
        */

        // Testing Octal num
        System.out.println(swiss.validOctalNum(test));
        System.out.println(swiss.octalToDecimal(test));
        System.out.println(swiss.addition(swiss.octalToDecimal(test), 271828));
        System.out.println(swiss.convertDecimalToOctal(swiss.addition(swiss.octalToDecimal(test), 271828)));
    }
}
