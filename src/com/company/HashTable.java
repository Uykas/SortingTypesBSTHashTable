package com.company;

public class HashTable<K, V> {

    private class HashNode<K, V> { // Created private class are closed all except "HashTable" (HashNode == Node) class.
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public HashNode() {

        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }

    private HashNode<K, V>[] array;
    public int M = 11;
    private int size; // Цифра узлов

    public HashTable() {
        array = new HashNode[13];
    }

    public HashTable(int M) {
        array = new HashNode[M];
    }

    private int hash(K key) {
        int hashHash = key.hashCode() % array.length;
        if (hashHash > 0 || hashHash == 0) {
            return hashHash;
        } else { // (hashHash < 0)
            return hashHash * (-1);
        }

    }

    public void put(K key, V value) {
        int index = hash(key); // It's like a number that into array's range.

        HashNode node = new HashNode(key, value);
        if(array[index] != null){
            node.next = array[index];
        }
        array[index] = node;

        size++;
    }

    public V get(K key) {
        int index = hash(key);

        if (array[index] == null) {
            return null;
        }
        HashNode node = array[index]; // Moving... it is like a "Run, Node! Run!"

        do {
            if (!node.key.equals(key)){ // If equality have bad answer, continue via "next".
                node = node.next;
            } else if (equality(node.key,key)) {// Finally found. Return this value from Node.
                return (V) node.value;
            }
        } while (node != null); // Node is not empty, Базар жок.

        if(node == null) {
            return null;
        }
        return null; // Not found, then null go back.

    }

    public V remove(K key) {
        int index = hash(key);
        HashNode tempArray = array[index];
        if (tempArray != null) {
            HashNode newNode = tempArray;
            HashNode oldNode = null;
            do {
                HashNode temp = newNode.next;
                if(equality(newNode.key, key)) {
                    if(oldNode != null) {
                        oldNode.next = temp;
                    }   else{
                        tempArray = temp;
                    }
                }
                oldNode = newNode;
                newNode = temp;
            } while (newNode != null);
            array[index]  = tempArray;
            return null;
        }

        return null;
    }
    private boolean equality(Object x, Object y) {
        return x.equals(y);
    }

    public boolean contains(V value) {
        for (int i = 0; i < array.length; i++) {

            HashNode node = array[i];
            while (node != null){

                if(equality(node.value, value)){
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    public K getKey(V value) {
        for (int i = 0; i < array.length; i++) {


            HashNode node = array[i];
            while (node != null){

                if(equality(node.value, value)){
                    return (K) node.key;
                }
                node = node.next;
            }
        }

        return null; // Not found, then null go back.
    }


}
