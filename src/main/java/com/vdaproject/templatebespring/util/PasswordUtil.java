package com.vdaproject.templatebespring.util;

public class PasswordUtil {
    private static final int passwordLength = 8;

    public static boolean validatePassword(String password) {
        int total = password.length();

        if (total < passwordLength) {
            return false;
        }

        int upChars = 0, lowChars = 0, special = 0, digits = 0;
        char ch;

        for (int i = 0; i < total; i++) {
            ch = password.charAt(i);
            if (Character.isUpperCase(ch))
                upChars = 1;
            else if (Character.isLowerCase(ch))
                lowChars = 1;
            else if (Character.isDigit(ch))
                digits = 1;
            else
                special = 1;
        }

        return upChars == 1 && lowChars == 1 && digits == 1 && special == 1;
    }
}
