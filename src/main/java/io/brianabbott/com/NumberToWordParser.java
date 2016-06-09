package io.brianabbott.com;

import java.util.ArrayList;

/**
 * Created by brianabbott on 6/9/16.
 */
public class NumberToWordParser {


    public static String numberToWordConverter(String number) {
        if(!number.matches("\\d+")){ return "Invalid Input";}
        ArrayList<String> numberSections = numberSplitter(number);
        String convertedWords = "";

        //Handle input > 999 Thousand
        if (numberSections.size() == 3) {
            convertedWords += sectionConverter(numberSections.get(0)) + "Million";
            convertedWords += sectionConverter(numberSections.get(1)) + "Thousand";
            convertedWords += sectionConverter(numberSections.get(2)) + "Dollars";
        }
        //Handle input < 1 Million
        else if (numberSections.size() == 2) {
            convertedWords += sectionConverter(numberSections.get(0)) + "Thousand";
            convertedWords += sectionConverter(numberSections.get(1)) + "Dollars";
        }

        //Handle input < 1 Thousand
        else {
            convertedWords += sectionConverter(numberSections.get(0)) + "Dollars";
        }
        return convertedWords;
    }

    //Uses Length of Section to Determine formatting and additional Words
    private static String sectionConverter(String section) {
        String convertedSection = "";
        if (section.length() == 3) {
            if (section.substring(0, 1).equals("0")) {

            } else {
                convertedSection += numberToWordLookup(section.substring(0, 1)) + "Hundred";
            }
            if (!section.substring(1, 2).equals("0") && !section.substring(2).equals("0")) {

                if (section.substring(1, 2).equals("1")) {
                    convertedSection += numberToWordLookup(section.substring(1));
                } else {
                    convertedSection += numberToWordLookup(section.substring(1, 2) + "0") + numberToWordLookup(section.substring(2));
                }
            }
        }
        if (section.length() == 2) {
            if (section.substring(0, 1).equals("1")) {
                convertedSection += numberToWordLookup(section.substring(0));
            } else {
                convertedSection += numberToWordLookup(section.substring(0, 1) + "0") + numberToWordLookup(section.substring(1));
            }

        } else {
            convertedSection += numberToWordLookup(section.substring(0));

        }
        return convertedSection;
    }


    //Splits the number into arraylist items depending on its length.
    // These sections are then converted by section converter
    private static ArrayList<String> numberSplitter(String number) {
        int numberLength = number.length();
        ArrayList<String> numberSections = new ArrayList<String>();

        if (numberLength == 9) {
            numberSections.add(number.substring(0, 3));
            numberSections.add(number.substring(3, 6));
            numberSections.add(number.substring(6));
        }

        if (numberLength == 8) {
            numberSections.add(number.substring(0, 2));
            numberSections.add(number.substring(2, 5));
            numberSections.add(number.substring(5));
        }

        if (numberLength == 7) {
            numberSections.add(number.substring(0, 1));
            numberSections.add(number.substring(1, 4));
            numberSections.add(number.substring(4));
        }

        if (numberLength == 6) {
            numberSections.add(number.substring(0, 3));
            numberSections.add(number.substring(3));
        }

        if (numberLength == 5) {
            numberSections.add(number.substring(0, 2));
            numberSections.add(number.substring(2));
        }

        if (numberLength == 4) {
            numberSections.add(number.substring(0, 1));
            numberSections.add(number.substring(1));
        }

        if (numberLength <= 3) {
            numberSections.add(number);
        }
        return numberSections;
    }


    public static String numberToWordLookup(String text) {
        String convertedWord = "";

        switch (text) {

            case "0":
                convertedWord = "Zero";
                break;

            case "1":
            case "01":
                convertedWord = "One";
                break;

            case "2":
            case "02":
                convertedWord = "Two";
                break;

            case "3":
            case "03":
                convertedWord = "Three";
                break;

            case "4":
            case "04":
                convertedWord = "Four";
                break;

            case "5":
            case "05":
                convertedWord = "Five";
                break;

            case "6":
            case "06":
                convertedWord = "Six";
                break;

            case "7":
            case "07":
                convertedWord = "Seven";
                break;

            case "8":
            case "08":
                convertedWord = "Eight";
                break;

            case "9":
            case "09":
                convertedWord = "Nine";
                break;

            case "10":
                convertedWord = "Ten";
                break;

            case "11":
                convertedWord = "Eleven";
                break;

            case "12":
                convertedWord = "Twelve";
                break;

            case "13":
                convertedWord = "Thirteen";
                break;

            case "14":
                convertedWord = "Fourteen";
                break;

            case "15":
                convertedWord = "Fifteen";
                break;

            case "16":
                convertedWord = "Sixteen";
                break;

            case "17":
                convertedWord = "Seventeen";
                break;

            case "18":
                convertedWord = "Eighteen";
                break;

            case "19":
                convertedWord = "Nineteen";
                break;

            case "20":
                convertedWord = "Twenty";
                break;

            case "30":
                convertedWord = "Thirty";
                break;

            case "40":
                convertedWord = "Forty";
                break;

            case "50":
                convertedWord = "Fifty";
                break;

            case "60":
                convertedWord = "Sixty";
                break;

            case "70":
                convertedWord = "Seventy";
                break;

            case "80":
                convertedWord = "Eighty";
                break;

            case "90":
                convertedWord = "Ninety";
                break;
        }
        return convertedWord;

    }


}
