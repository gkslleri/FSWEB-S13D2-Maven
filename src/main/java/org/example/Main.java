package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int toplam = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }

        return toplam == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String sayi = String.valueOf(number);
        String sonuc = "";

        for (int i = 0; i < sayi.length(); i++) {
            switch (sayi.charAt(i)) {
                case '0':
                    sonuc += "Zero ";
                    break;
                case '1':
                    sonuc += "One ";
                    break;
                case '2':
                    sonuc += "Two ";
                    break;
                case '3':
                    sonuc += "Three ";
                    break;
                case '4':
                    sonuc += "Four ";
                    break;
                case '5':
                    sonuc += "Five ";
                    break;
                case '6':
                    sonuc += "Six ";
                    break;
                case '7':
                    sonuc += "Seven ";
                    break;
                case '8':
                    sonuc += "Eight ";
                    break;
                case '9':
                    sonuc += "Nine ";
                    break;
            }
        }

        return sonuc.trim();
    }
}
