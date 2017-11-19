import java.util.*;

public class LinkedList {

    public Node firstNode;

    public static void main(String[] args)
    {
        LinkedList alist = new LinkedList();
        alist.searchNode("Bob");
    }

    public boolean isEmpty(){

        return (this.firstNode == null);
    }

    public void addNode(String Id, int age){

        Node newNode = new Node(Id, age);
        newNode.nextNode = this.firstNode;
        this.firstNode = newNode;
    }

    public void showNodes(){

        Node currentNode = this.firstNode;

        while (currentNode.nextNode != null){

            currentNode.display();
            currentNode = currentNode.nextNode;
        }
    }

    public void searchNode(String Id){

        Node searchNode = this.firstNode;

        if (!isEmpty()){

            while (!searchNode.Id.equals(Id)){

                if (searchNode.nextNode == null){

                    System.out.println("Node not found");
                    break;
                }
                else{

                    searchNode=searchNode.nextNode;
                }
            }

            System.out.println("Node:" + searchNode.Id+ "was found");
        }
        else{
            System.out.println("Linked list is empty");
        }
    }

    public void removeNode(String Id){
        Node Currentnode = this.firstNode;
        Node Lastnode = this.firstNode;

        while (!Currentnode.Id.equals(Id)){

            if (Currentnode.nextNode == null){
                System.out.println("Not not in list");
            }
            else{

                Lastnode = Currentnode;
                Currentnode = Currentnode.nextNode;
            }
        }

        if (Currentnode == firstNode){
            this.firstNode = this.firstNode.nextNode;
        }
        else{
            Lastnode.nextNode = Currentnode.nextNode;
            System.out.println("Node: "+ Id+ "Removed");

        }
    }
}

class Node{

    public String Id = "";
    public int age = 0;

    Node nextNode;

    public Node(String Id, int age){
        this.Id = Id;
        this.age = age;
    }

    public void display(){
        System.out.println("Id: "+this.Id+ "Age:"+ this.age);
    }
}