public class QuickUnion {

  private int[] values = {0,1,2,3,4,5,6,7,8};

  public static void main(String[] args) {

    QuickUnion test = new QuickUnion();{

  }

  public boolean connected(int val1, int val2){

    return (get_root(val1) == get_root(val2));

  }
  
  public int get_root(int val){

    while (val != values[val]){

      val = values[val];
    }

    return val;
  }

  public void union (int val1, int val2){

    values[get_root(val1)] = get_root(val2);
    
  }

}
   
/*    System.out.println(test.connected(3, 2));
    test.union(3, 2);
    test.union(4, 5);
    test.union(3, 4);
    System.out.println(test.connected(3, 5)); */
