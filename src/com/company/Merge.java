package com.company;

public class Merge<M extends Comparable <M>> {
    public void merge(M[] x, M[] y) {
        int i = 0, j = 0;

        Comparable[] all =  new Comparable[x.length + y.length];

        for (int k = 0; k < all.length; k++) {
            Comparable obj;

            if (i == x.length) {
                obj = y[j++];
            } else if (j == y.length) {
                obj = x[i++];
            } else {
                if (x[i].compareTo(y[j]) < 0) {  // x < y   3 < 5
                    obj = x[i++];
                } else {
                    obj = y[j++];
                }
            }
            all[k] = obj;
        }
        for (Comparable m : all) {
            System.out.println(m + " ");
        }System.out.println("<-- After Merge Sort");
    }
}
