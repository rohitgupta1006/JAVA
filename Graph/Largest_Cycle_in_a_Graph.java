import java.util.LinkedList;
import java.util.Queue;

public class Largest_Cycle_in_a_Graph {
  public static void main(String[] args) 
  {  
    int[] edges={3,3,4,2,3};
  }
  public static int longestCycle(int[] edges)
  {
    int[] in = new int[edges.length];
    for(int i=0; i<edges.length; i++)
    {
      in[edges[i]]++;
    }
    Queue<Integer> q=new LinkedList<>();
    for(int i=0; i<in.length;i++)
    {
      if(in[i] == 0)
      {
        q.add(i);
      }
    }
    boolean[] visited=new boolean[edges.length];
    while(!q.isEmpty())
    {
      int e=q.poll();
      visited[e]=true;
      in[edges[e]]--;
      if(in[edges[e]]==0)
      {
        q.add(edges[e]);
      }
    }
    int ans=-1;
    for(int i=0;i<visited.length;i++)
    {
      if(visited[i] == false)
      {
        int c=1;
        int nbr=edges[i];
        while(nbr != i)
        {
          c++;
          visited[nbr]=true;
          nbr=edges[nbr];
        }
        ans=Math.max(ans, c);
      }
    }
    return ans;
  
  }
}
