package _22y._05m.graph_traverse;


import java.util.*;

public class Graph {
    //hlavička, začátek seznamu
    private Node head;

    public Graph() {
        this.head = new Node(0);
    }

    public Node getHead() {
        return head;
    }
    Set<Node> visited = new TreeSet<>();
    void printGraphDFS(Node n)
    {
        visited.add(n);
        for (Node currentN:n.nextNodeList) {
            if(!visited.contains(currentN)) {
                System.out.print(currentN.data + " ");
                printGraphDFS(currentN);
            }
            System.out.println();
        }
    }

    public List<Node> getNodeListDFS() {
        LinkedList<Node> out = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        visited.clear();

        stack.add(this.head);
        while (!stack.isEmpty()) {
            Node tmp= stack.pop();
            if (!visited.contains(tmp)) {
                visited.add(tmp);
                out.add(tmp);
                for (Node currentN : tmp.nextNodeList) {
                    if (!visited.contains(currentN)) {
                        stack.push(currentN);
                    }
                }
            }
        }
        return out;
    }
}
