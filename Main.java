package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


  class PatternMatcher {

    public void compare(String i) {
        Pattern p = Pattern.compile("[A-Z].+[.]");
        Matcher m = p.matcher(i);
        if (i.matches("[A-Z].+[.]")) {
            System.out.println("Input String Matches with pattern");
        }
        else{
            System.out.println("Input String does not Matche with pattern");
        }
    }

}

    public class Main {

        public static void main(String args[]) {
            PatternMatcher m1 = new PatternMatcher();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the String");
            String i = s.nextLine();
            m1.compare(i);


        }
    }

/*   int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            String signup = sc.next();
            String current = sc.next();
          System.out.println("\t");
            kyc.calculateRange(signup, current);*/
