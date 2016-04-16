package com.company;

public class MathOperations {

    public void getDivisor(int q, int w) {
        System.out.println(q + " / " + w + " = " + q / w + " и " + q % w + " в остатке");
    }

    public int sumChisla(int n) {
        int summ = 0;
        for (int i = 0; i < 3; i++) {
            summ += n % 10;
            n /= 10;
        }
        return summ;
    }

    public int integNumber(double n){
        return (int)n;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        math.getDivisor(21, 8);
        System.out.println("Сумма: " + math.sumChisla(26));
        System.out.println("ближайшее целое число "+math.integNumber(234.93));
        System.out.println("Сумма: " + math.sumChisla(156));


    }
}
