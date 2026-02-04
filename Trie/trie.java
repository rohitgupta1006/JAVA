package Trie;
import java.util.*;

public class trie {
  class Node{
    char ch;
    boolean  isterminal;
    HashMap<Character,Node> child;
    public Node(char ch){
      this.ch=ch;
      child=new HashMap<>();
    }

  }
  private Node root;
  public trie(){
    root=new Node('*');
  }
  public void insert(String word)
  {
    Node curr=root;
    for(int i = 0; i<word.length();i++)
    {
      char ch=word.charAt(i);
      if(curr.child.containsKey(ch))
      {
        curr=curr.child.get(ch);
      }
      else{
        Node nn=new Node(ch);
        curr.child.put(ch,nn);
        curr=nn;
      }
    }
    curr.isterminal=true;
  }
  
}
