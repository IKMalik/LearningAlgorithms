import java.util.*;

class dynamicArrayStack {

    private String[] chars= new String[1];
    private int position=0;

    public static void main(String[] args){
        dynamicArrayStack stack = new dynamicArrayStack();
        stack.push("bob");
        stack.push("cob");
        stack.pop();
        stack.display();
    }

    public boolean isEmpty(){
        return ( position== 0);
    }

    public void push(String word){
        if (position == chars.length){
            resize(2*chars.length);
        }
        chars[position] = word;
        position++;
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            String word = chars[position - 1];
            chars[position - 1] = null;
            position--;
            if (position <= chars.length / 4 && position > 0) {
                resize(chars.length / 2);
            }
        }
    }

    public void resize(int size){

        String[] duplicate = new String[size];

        for (int i=0; i<position; i++){
            duplicate[i] = chars[i];
        }
        chars = duplicate;

    }

    public void display(){
        System.out.println(Arrays.toString(chars));

    }
}