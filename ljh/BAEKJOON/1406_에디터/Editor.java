/**
* 에디터(1406)
*/

import java.io.*;
import java.util.StringTokenizer;

public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        String s = br.readLine();
        Node head = new Node('H'); // HEAD Node 생성
        Node node = head;
        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                Node created = new Node(s.charAt(i));
                node.right = created;
                created.left = node;
                node = created;
            }
        }
        Node cursor = node;

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "L":
                    cursor = cursor.goLeft();
                    break;
                case "D":
                    cursor = cursor.goRight();
                    break;
                case "B":
                    cursor = cursor.delete();
                    break;
                case "P":
                    cursor = cursor.append(st.nextToken().charAt(0));
                    break;
            }
            System.out.println(cursor.c);
            System.out.println(head.printNode());
        }
        bw.write(head.printNode());
        bw.flush();
    }

    static class Node {
        char c;
        Node left;
        Node right;

        public Node(char c) {
            this.c = c;
        }

        public Node goRight() {
            if (this.right != null) {
                return this.right;
            }
            return this;
        }

        public Node goLeft() {
            if (this.left == null) {
                return this;
            }
            return this.left;
        }

        public Node delete() {
            if (this.c == 'H') {
                return this;
            }
            Node right = this.right;
            Node left = this.left;
            if (right == null) {
                left.right = null;
            } else {
                left.right = right;
                right.left = left;
            }
            return left;
        }

        public Node append(char c) {
            Node node = new Node(c);
            Node right = this.right;
            this.right = node;
            node.left = this;
            if (right != null) {
                node.right = right;
                right.left = node;
            }

            return node;
        }

        public String printNode() {
            Node node = this.right;
            StringBuffer sb = new StringBuffer();
            while (node != null) {
                sb.append(node.c);
                node = node.right;
            }

            return sb.toString();
        }
    }
}
