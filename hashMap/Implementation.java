package hashMap;

import java.util.LinkedList;
import java.util.Objects;

public class Implementation {

    private LinkedList<Node>[] buckets;
    private int n; // total nodes
    private int N; // number of buckets

    public Implementation() {
        N = 4;
        buckets = new LinkedList[N];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void put(int key, String value) {
        int bi = hashFunction(key);
        int di = getDataIndex(bi, key);

        if (di != -1) {
            buckets[bi].get(di).value = value; // update
        } else {
            buckets[bi].add(new Node(key, value)); // insert
            n++;
        }

        double lambda = (double) n / N;
        if (lambda > 2.0) {
            rehash();
        }
    }

    public String get(int key) {
        int bi = hashFunction(key);
        int di = getDataIndex(bi, key);

        if (di != -1) {
            return buckets[bi].get(di).value;
        } else {
            return null;
        }
    }

    public boolean remove(int key) {
        int bi = hashFunction(key);
        int di = getDataIndex(bi, key);

        if (di != -1) {
            buckets[bi].remove(di);
            n--;
            return true;
        }
        return false;
    }

    private void rehash() {
        LinkedList<Node>[] oldBuckets = buckets;
        N = N * 2;
        buckets = new LinkedList[N];

        for (int i = 0; i < N; i++) {
            buckets[i] = new LinkedList<>();
        }

        n = 0; // Reset count and reinsert all old data

        for (LinkedList<Node> bucket : oldBuckets) {
            for (Node node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    private int getDataIndex(int bi, int key) {
        LinkedList<Node> list = buckets[bi];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key == key) {
                return i;
            }
        }
        return -1;
    }
    public void display() {
        System.out.println("HashMap contents:");
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Node node : buckets[i]) {
                System.out.print("[" + node.key + " => " + node.value + "] ");
            }
            System.out.println();
        }
    }


    private int hashFunction(int key) {
        return Math.abs(Objects.hash(key)) % buckets.length;
    }

    private class Node {
        int key;
        String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
