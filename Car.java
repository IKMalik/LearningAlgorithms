import java.util.*;


public class Car{

    private String name;
    private int age;

    private static int numofcars = 0;

    public Car(){

        numofcars ++;

    }

    private void Make_car(){

        System.out.println(numofcars);

    }

    public static void main(String[] args){

        Car mynewcar = new Car();
        mynewcar.Make_car();

    }

}
