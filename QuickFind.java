
import java.util.*; 


public class QuickFind
{
  ArrayList<Integer> N = new ArrayList<Integer>();
  
  
  public static void main(String[] args)
  {
    QuickFind x = new QuickFind();
    x.additems(5);
    if(x.Find(2,3))
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("No");
    }
    x.Union(1,2);
    x.Union(1,4);
    x.Union(0,4);
    System.out.println(x.N);
  }
  
  private void Union(int x, int y)
  {
    for (int i=0; i<this.N.size(); i++)
    {
      if (this.N.get(i).equals(this.N.get(y)))
      {
        this.N.set(i, x);
      }
    }
  }
  
  private void additems(Integer A)
  {
  	for (int i=0; i<A; i++)
    {
    	this.N.add(i);
    }
    System.out.println(this.N);
    
  }
  
  private boolean Find(int a, int b)
  {
  	int indexa = this.N.get(a);
    int indexb = this.N.get(b);
    if (indexa == indexb)
    {	
      return true;
    }
    else
    {
      return false;
    }
    
  }
  
  
}