import java.util.ArrayList;

public class QuickUnionClass {

    ArrayList<Integer> N = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        QuickUnionClass bee = new QuickUnionClass();
        bee.QuickUnion(4);
        bee.union(2,3);
        System.out.println(bee.N);
    }

    private int getRoot(int node)
    {
        while(this.N.get(node) != node)
        {
            node = this.N.get(node);
        }
        return node;
    }

    private void QuickUnion(int A)
    {
        for (int i=0; i<A; i++)
        {
            this.N.add(i);
        }
    }

    private void union(int p, int q)
    {
        if (!this.checkSameRoot(p,q))
        {
            this.N.set(p, this.N.get(q));
        }
        else
        {
            System.out.println("Already connected");
        }
    }

    private boolean checkSameRoot(int p, int q)
    {
        int proot = this.getRoot(p);
        int qroot = this.getRoot(q);

        return (proot == qroot);
    }






}
