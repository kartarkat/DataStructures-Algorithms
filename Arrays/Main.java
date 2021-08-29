package ds.algo;

//Dynamic array
//[10, 20, 30] , java
//implementing dynamic array

//simplest data structure, in java default static, array list
//lookup by index - o1  , insert, delete, value -on

//there is inbuilt dynamic array in java
//vector - increases 100 size when full, synchronied can be acces by one at atime
//arraylist<> 50% size, easy to use, .add, .remove, .indexof, toarray, etc..


public class Main {

    public static void main(String[] args) {
        DynamicArray number = new DynamicArray(5);
        number.insert(10); //0
        number.insert(20);  //1
        number.insert(30); //2
        number.insert(40); //3
        number.insert(50);
        number.insert(60);
        number.removeAt(2);
        System.out.println(number.find(40));
        number.printing();



    }
}
