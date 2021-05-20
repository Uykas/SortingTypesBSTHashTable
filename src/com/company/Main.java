package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        BST bst = new BST();
        bst.put(0,"00");
        bst.put(1,11);
        bst.put(2,"IU");
        System.out.println("Get key = 0, should be 00: " + bst.get(0));
        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        HashTable hashTable = new HashTable();
        hashTable.put(-1,"Нурлан Сабуров");
        hashTable.put(0,false);
        hashTable.put(1,2021);
        hashTable.put(1,"Всем большой Рахмет");
        hashTable.put(2,1984);
        System.out.println("This next two rows, These values in the same key [2021,\"Всем большой Рахмет\"].");
        System.out.println("Check contains?:" + hashTable.contains(2021));
        System.out.println("Check contains?:" + hashTable.contains("Всем большой Рахмет"));
        //
        System.out.println("Show by get(2), the value: " + hashTable.get(2));
        System.out.println("Show by getKey(1984), the key: " + hashTable.getKey(1984));
        //
        hashTable.remove(-1); // Deleting
        System.out.println("After remove (-1), check by contains(\"Нурлан Сабуров\"): " + hashTable.contains("Нурлан Сабуров"));
        System.out.println("After remove (-1), check by get(-1): " + hashTable.get(-1));

        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        Merge mergeSort = new Merge();
        Comparable[] x = {1,2,5,9,11};
        Comparable[] y = {0,3,7,8};
        for (Comparable k : x) {
            System.out.println(k + " ");
        }System.out.print("<-- x");
        System.out.println(" ");
        for (Comparable p : y) {
            System.out.println(p + " ");
        }System.out.print("<-- y");
        System.out.println(" ");
        System.out.println("^ Original arrays");
        mergeSort.merge(x,y);

        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

        Quick quickSort = new Quick();
        Comparable[] arr = {'с','b','a'};
        Comparable[] arr1 = {7,6,5,4,3,2,1};
        quickSort.quick(arr,0,arr.length-1);
        quickSort.show(arr);
        System.out.println("--");
        quickSort.quick(arr1,0, arr1.length-1);
        quickSort.show(arr1);
        System.out.println("<-- After Quick Sort");

        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println(" ");

    }
}
