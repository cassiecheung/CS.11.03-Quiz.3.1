public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if(grade >= 90) {
            return 'A';
        }
        if(grade >= 80 && grade <= 89) {
            return 'B';
        }
        if(grade >= 70 && grade <= 79) {
            return 'C';
        }
        if(grade >= 60 && grade <= 69) {
            return 'D';
        }
        if(grade >= 50 && grade <= 59) {
            return 'E';
        }
        return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int argument) {
        if(argument % 3 == 0 && argument % 5 == 0) {
            return "fizzbuzz";
        }
        if(argument % 3 == 0) {
            return "fizz";
        }
        if(argument % 5 == 0) {
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if(str.length() < 2) {
            return str;
        }
        if(str.length() == 2) {
            return str + str + str;
        }
        String firstTwoChar = str.substring(0, 2);
        return firstTwoChar + str + firstTwoChar;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if(ab == c) {
            return true;
        }
        if(bc == a) {
            return true;
        }
        if(ac == b) {
            return true;
        }
        return false;
    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if(str.length() <= 3) {
            String upperStr = str.toUpperCase();
            return upperStr;
        }
        String lastThreeChar = str.substring(str.length()-3);
        String upperStr = lastThreeChar.toUpperCase();
        String lowerStr = str.substring(0,str.length()-3);
        return lowerStr + upperStr;
    }

}
