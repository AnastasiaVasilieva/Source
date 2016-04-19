package com.company;

public class MathOperations {

    private double n;

    public static void main(String[] args) {

        MathOperations math = new MathOperations();
        double n;
        math.setN(265);
        n = math.getN();
        System.out.println(math.sumChisla(n));

        MathOperations arifm = new MathOperations();
        double num;
        arifm.setN(648);
        num = arifm.getN();
        System.out.println(arifm.sumChisla(num));

    }

    public double getN() {
        return n;
    }

    public void setN(double newN) {
        n = newN;
    }

    public int sumChisla(double n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


}

