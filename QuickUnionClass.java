import java.util.*;

public class QuickUnion{
    
    private int[] values;
    private int[] treeSize;

     public static void main(String []args){
     }
     
     public void create(int size){
         
         // declare size trees 
         
         values = new int[size];
         treeSize = new int[size];
         
         for (int count=0; count<size; count++){
             values[count] = count;
             treeSize[count] = 1;
         }
     }
       
     public boolean connected(int val1, int val2){
         
         return (values[val1] == values[val2]);
         
     }
     
     public int getRoot(int val){
         
         while (val != values[val]){
             
             // simple one pass path compression in a single line
             values[val] = values[values[val]];
             
             
             val = values[val];
         }
         
         return val;
     }
     
     public void union(int val1, int val2){
         
         int rootval1 = getRoot(val1);
         int rootval2 = getRoot(val2);
         
         // added weighted tree analysis to get lg N max depth
         // return call exits method
         if (rootval1 == rootval2) return;
          
         // adding val 1 to val 2, so val 2 tree increases NOT val 1's tree
         else if (treeSize[rootval1] <= treeSize[rootval2]){
             values[rootval1] = values[rootval2];
             treeSize[rootval2] += treeSize[rootval1];
         }
         else{
             values[rootval2] = values[rootval1];
             treeSize[rootval1] += treeSize[rootval2];
         }
         
     }
     
}
