package Week1;

public class Q1SumOfTwoStrings {
    public String addString(String num1, String num2) {
        if (num1.length() == 1 && num1.charAt(0) == '0') return num2;
        if (num2.length() == 1 && num2.charAt(0) == '0') return num1;
        int l1 = num1.length();
        int l2 = num2.length();
        int h = 0;
        StringBuilder res = new StringBuilder();
        while (l1 > 0 && l2 > 0) {
            int digit = (int) num1.charAt(--l1) - 48 + (int) num2.charAt(--l2) - 48 + h;
            h = digit / 10;
            digit = digit % 10;
            res.insert(0, (char) (digit + 48));
        }

        while (l1 > 0) {
            int digit = (int)num1.charAt(--l1) - 48 + h;
            h = digit / 10;
            digit = digit % 10;
            res.insert(0, (char) (digit + 48));
        }

        while (l2 > 0) {
            int digit = (int)num2.charAt(--l2) - 48 + h;
            h = digit / 10;
            digit = digit % 10;
            res.insert(0, (char) (digit + 48));
        }
        if (h>0) res.insert(0, '1');
        return res.toString();
    }

}
