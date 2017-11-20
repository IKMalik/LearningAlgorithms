public class queue {

    private node headnode = null;
    private node tailnode = null;

    private class node{

        String id;
        node nextnode;

        node(String id){
            this.id = id;
        }
    }

    public static void main(String[] args){
        queue aqueue = new queue();
    }

    public void enqueue(String id){

        node oldtail = tailnode;
        tailnode = new node(id);
        tailnode = null;

        if (isempty()){
            headnode = tailnode;
        }
        else{
            oldtail.nextnode = tailnode;
        }


    }

    public boolean isempty(){

        return (headnode == null);
    }

    public String dequeue() {
        String id = headnode.id;
        headnode = headnode.nextnode;
        if (isempty()){
            tailnode = null;
        }
        return id;

    }
}


