/**
* 1021 회전하는 큐
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static Node head;
    public static Node left;
    public static Node right;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        head = new Node(1);
        Node node = head;
        for (int i = 2; i <= n; i++) {
            Node prev = node;
            node.right = new Node(i);
            node = node.right;
            node.left = prev;
        }
        node.right = head;
        head.left = node;

        st = new StringTokenizer(br.readLine());
        int size = n;
        int count = 0;
        for (int i = 0; i < m; i++) {
            int pick = Integer.parseInt(st.nextToken());

            int count_left = goLeft(head, pick);
            int count_right = goRight(head, pick);
            if (count_left < count_right) {
                head = left;
                count += count_left;
            } else {
                head = right;
                count += count_right;
            }
            head = delete(head);
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }

    public static int goLeft(Node node, int val) {
        int count = 0;
        while (node.value != val) {
            node = node.left;
            count++;
        }
        left = node;

        return count;
    }

    public static int goRight(Node node, int val) {
        int count = 0;
        while (node.value != val) {
            node = node.right;
            count++;
        }
        right = node;

        return count;
    }

    public static Node delete(Node node) {
        Node right = node.right;
        Node left = node.left;
        right.left = left;
        left.right = right;

        return right;
    }

    static class Node {
        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }
    }
}