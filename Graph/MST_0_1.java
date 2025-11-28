import java.util.*;

public class MST_0_1 
{
  static HashMap<Integer, List<Integer>> map = new HashMap<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      map.put(i, new ArrayList<>());
    }

    for (int i = 1; i <= m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      map.get(a).add(b);
      map.get(b).add(a);
    }

    System.out.println(prims(n));
    sc.close();
  }

  public static int prims(int n) {
    PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
    HashSet<Integer> visited = new HashSet<>();

    pq.add(new Pair(1, 0));
    int sum = 0;

    while (!pq.isEmpty()) {
      Pair rem = pq.poll();

      if (visited.contains(rem.vtx))
        continue;

      visited.add(rem.vtx);
      sum += rem.cost;

      // check ALL nodes for 0/1 edge
      for (int nbrs=1; nbrs <= map.size(); nbrs++) {
        if (!visited.contains(nbrs)) {
          int cost=0;
          if(map.get(rem.vtx).contains(nbrs))
            {
            cost++;
            } 
          pq.add(new Pair(nbrs, cost));
        }
      }
    }

    return sum;
  }

  static class Pair {
    int vtx;
    int cost;

    public Pair(int vtx, int cost) {
      this.vtx = vtx;
      this.cost = cost;
    }
  }
}
