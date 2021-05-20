package com.company;

public class BST <K extends Comparable<K>, V> {
    private Node root;

    private class Node {
        private K key;
        private V val;
        private Node left, right;

        private Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public void put(K key, V val) {
        Node currentNode = new Node(key, val);
        root = put(root,currentNode);
    }

    private Node put(Node newNode, Node currentNode) {
        if (newNode == null) {
            return new Node(currentNode.key, currentNode.val);
        }

        int cmp = currentNode.key.compareTo(newNode.key);
        if(cmp == 0) {
            newNode.val = currentNode.val;
        } else if (cmp < 0) {
            newNode.left = put(newNode.left,currentNode);
        } else {
            newNode.right = put(newNode.right,currentNode);
        }
        return newNode;
    }
    public V get(K key) {
        Node newNode = root;
        return get(newNode, key);
    }
    private V get(Node newNode, K key) {
        if (newNode == null) {
            return null;
        }
        int cmp = key.compareTo(newNode.key);
        if(cmp == 0) {
            return newNode.val;
        } else if (cmp < 0) {
            return get(newNode.left,key);
        }
        return get(newNode.right,key);
    }
    public void delete(K key) { // ERROR
        Node newNode = root;
        delete(newNode, key);
    }
    private Node delete(Node newNode, K key) { // ERROR
        if (newNode == null) {
            return null;
        }
        int cmp = key.compareTo(newNode.key);
        if(cmp == 0) {
            return delete(newNode.left, newNode.right);
        } else if (cmp < 0) {
            return delete(newNode.left,key);
        }
        return delete(newNode.right,key);
    }
    private Node delete(Node node1, Node node2) { // ERROR
        if (node1 == null || node2 == null) {
            return node1;
        } else {
            return  node1 = node2;  // ЧТОБЫ ПРОСТО ОШИБКУ НЕ ВЫДАВАЛ
        }
    }

}