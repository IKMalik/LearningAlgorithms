public class binarySearch
{
  
  public static void main(String[] args)
  {
    int[] a = new int[5];
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    a[3] = 4;
    a[4] = 5;
    int result = search(a,2);
  }
  
  public static int search (int[]a, int key){
  
    int low = 0;
    int hi = a.length -1; 
    int mid = (hi+low)/2;
    
    while (low <= hi){
      if (key < a[mid]){
      	hi = mid-1;
      }
      else if (key > a[mid]){
      	low = mid + 1;
      }
      else{
        return mid;
      }
    }
    return -1; 
  }
}
