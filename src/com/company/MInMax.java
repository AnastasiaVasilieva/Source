package com.company;

public class MInMax {
    private double n;

    public static void main(String[] args) {
        double n;
        MInMax minmax = new MInMax();
        minmax.setN(567.12);
        n = minmax.getN();
        System.out.println("max = "+minmax.findMax(n));
        System.out.println("min = "+minmax.findMin(n));

    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }


    public int findMax(double n) {
        double max = 0;
        while (n > 0) {
            double m = n % 10;
            if (max < m) {
                max = m;
            }
            n /= 10;
        }
        return (int) max;
    }

    public int findMin(double n) {
        double min = 9;
        while (n > 1) {
            double m = n % 10;
            if (min > m) {
                min = m;
            }
            n /= 10;
        }
        return (int) min;
    }
}
