package com.company;


public class Main {

    public static void main(String[] args) {

            boolean notPalindrome = false;
            String string = "А за работу дадут? – Оба раза!";
            string = string.replaceAll("[^a-zA-Z]+", "").toLowerCase();

            char[] array = string.toCharArray();
            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                if (array[i] != array[j]) {
                    notPalindrome = true;
                    break;
                }
            }
            System.out.println(string + " Это палиндром? " + !notPalindrome);
        }
    }

