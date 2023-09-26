public class Graph {

    private int[] nodes;
    private int[][] edges;

    public Graph(int[] n, int[][] e) {

        this.nodes = n;

        this.edges = e;

    }

    public static void main(String[] args) {

        int[] nodes = {1, 2, 3};
        int[][] edges = {{1,2}, {1, 3}, {2,3}};

        Graph g = new Graph(nodes, edges);
    }
}
