package com.company;

public class Quick<Q extends Comparable <Q>> {
    public void quick(Q[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        Q pivot = arr[(left+right)/2];
        int index = partition(arr,left,right, pivot);
        quick(arr,left,index - 1);
        quick(arr,index,right);
    }
    private int partition(Q[] arr, int left, int right, Q pivot) {

        while (left<=right) {

            while (arr[left].compareTo(pivot) < 0) {
                left++;
            }

            while (arr[right].compareTo(pivot) > 0) {
                right--;
            }

            if (left <= right) {
                swap(arr,left, right);

                left++;
                right--;
            }
        }

        return left;
    }
    private void swap(Q[] arr, int left, int right) {
        Q temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public void show(Q[] array) {
        if(array.length == 0) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

