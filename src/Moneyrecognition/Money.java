package Moneyrecognition;

import java.util.Scanner;
import java.util.regex.*;

public class Money
{
    final static Pattern pattern = Pattern.compile("^\\d+(\\.\\d{2})? (USD|EU|RUB)$");

    public static void main(String[] args)
    {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite den`gi");
        input = in.nextLine();
        System.out.println(Proverka(input));
    }
    public static boolean Proverka(String string)
    {
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}