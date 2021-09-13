package com.company;

public class Main {

    //Opgave 5.3

    public static boolean Fermat(int a, int b, int c, int n) {
        return((Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n) && n <= 2);
    }

    public static void main(String[] args) {
        Boolean fermat = Fermat(1,2,3,2);
        if (fermat){
            System.out.println("No, that doesn't work");
        } else {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
    }
}
