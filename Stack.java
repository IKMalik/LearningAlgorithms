
class stack{

    private node headnode = null;

    private class node{

        String id;
        node nextnode;

        node(String id){

            this.id = id;
        }
    }

    public static void main(String[] args){
        stack astack = new stack();
        astack.push("bob");
        astack.push("cob");
        astack.push("dob");
        astack.pop();
        astack.pop();
        astack.pop();
        astack.pop();


    }

    public void push(String id){

        node anode = new node(id);

        anode.nextnode = headnode;
        headnode = anode;
    }

    public boolean isempty(){

        return (headnode == null);
    }

    public void pop() {

        if (this.isempty()) {
            System.out.println("Stack has no items to pop");
        } else {
            System.out.println("Node: " + headnode.id + "has been popped from stack");
            this.headnode = headnode.nextnode;
        }

    }
}

