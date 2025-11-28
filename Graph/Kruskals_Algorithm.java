import java.util.HashMap;
import java.util.*;

public class Kruskals_Algorithm {
  private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Kruskals_Algorithm(int v) 
  {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) 
    {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) 
  {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

  class EdgePair
  {
    int e1,e2,cost;
    public EdgePair(int e1,int e2,int cost){
      this.e1=e1;
      this.e2=e2;
      this.cost=cost;
    }
    @Override
    public String toString(){
      return this.e1+"--"+this.e2+" @ "+this.cost;
    }
  }
  public List<EdgePair> getAllEdges()
  {
    List<EdgePair> l1=new ArrayList<>();
    for(int e1:map.keySet())
    {
      for(int e2:map.get(e1).keySet())
      {
        int cost=map.get(e1).get(e2);
        l1.add(new EdgePair(e1,e2,cost));
        
      }
    }
    return l1;
  }
  public void Kruskals_Algo()
  {
    List<EdgePair> l1=getAllEdges();
    Collections.sort(l1,(a,b)->a.cost-b.cost);
    DisJoinSet ds=new DisJoinSet();
    for(int v:map.keySet())
    {
      ds.create(v);
    }
    int ans=0;
    for(EdgePair e:l1){
      int re1=ds.find(e.e1);
      int re2=ds.find(e.e2);
      if(re1==re2)
      {
        
      }
      else{
        ds.union(e.e1,e.e2);
        ans+=e.cost;
        System.out.println(e);
      }
    }
    System.out.println(ans);
  }
  public static void main(String[] args) {
    Kruskals_Algorithm ga=new Kruskals_Algorithm(7);
    ga.AddEdge(1, 2, 10);
    ga.AddEdge(1, 3, 15);
    ga.AddEdge(2, 4, 12);
    ga.AddEdge(3, 4, 5);
    ga.AddEdge(2, 5, 15);
    ga.AddEdge(4, 5, 8);
    ga.AddEdge(5, 6, 6);
    ga.AddEdge(6, 7, 3);
    ga.AddEdge(5, 7, 18);
    ga.Kruskals_Algo();
  }
}
