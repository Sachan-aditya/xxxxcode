package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum GraphDirection {
    DIRECTED,
    UNDIRECTED;
}

public class Graph {
    private class Node {
        public String value;

        public Node(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

    private Map<Node, List<Node>> adjacencyList;
    private Map<String, Node> nodes;

    public Graph() {
        this.adjacencyList = new HashMap<>();
        this.nodes = new HashMap<>();
    }

    public Node createNode(String value) {
        if (!nodes.containsKey(value)) {
            nodes.put(value, new Node(value));
        }
        return nodes.get(value);
    }

    public void createConnections(Node from, Node to, GraphDirection graphDirection) {
        if (!adjacencyList.containsKey(from)) {
            adjacencyList.put(from, new ArrayList<>());
        }
        adjacencyList.get(from).add(to);
        if (graphDirection == GraphDirection.UNDIRECTED) {
            if (!adjacencyList.containsKey(to)) {
                adjacencyList.put(to, new ArrayList<>());
            }
            adjacencyList.get(to).add(from);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (var entry : adjacencyList.entrySet()) {
            sb.append(entry.getKey()).append("->").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        var a = graph.createNode("A");
        var b = graph.createNode("B");
        var c = graph.createNode("C");
        var d = graph.createNode("D");
        graph.createConnections(a, b, GraphDirection.DIRECTED);
        System.out.println(graph);
    }
}