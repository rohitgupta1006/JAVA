import java.util.*;

public class Topological_Sort {
    private HashMap<Integer, List<Integer>> map;

    public Topological_Sort(int v) {
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void AddEdge(int v1, int v2) {
        map.get(v1).add(v2);
    }

    public int[] indegree() {
        int[] in = new int[map.size()];
        for (int v1 : map.keySet()) {
            for (int v2 : map.get(v1)) {
                in[v2]++;
            }
        }
        return in;
    }

    public void Topological() {
        Queue<Integer> q = new LinkedList<>();
        int[] in = indegree();

        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int r = q.poll();
            System.out.print(r + " "); // <-- FIXED: use print instead of println

            for (int nbrs : map.get(r)) {
                in[nbrs]--;
                if (in[nbrs] == 0) {
                    q.add(nbrs);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Topological_Sort g = new Topological_Sort(6);
        g.AddEdge(5, 0);
        g.AddEdge(5, 2);
        g.AddEdge(4, 0);
        g.AddEdge(4, 1);
        g.AddEdge(2, 3);
        g.AddEdge(3, 1);

        g.Topological();
    }
}
