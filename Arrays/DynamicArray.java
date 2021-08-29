package ds.algo;

//manual
//inbuilt - arraylist, vector o(1) -index , o(n)

public class DynamicArray {

    //create , declare
    private int[] items;
    private int count = 0;

    //constructor
    public DynamicArray(int value) {
        items = new int[value];
    }

    //insert method
    public void insert(int item){   //insert(6);
        if (items.length == count){
            //create new array
            int[] newItems = new int[count * 2];
            //copy old array - new array
            for(int i=0; i<count; i++)
                newItems[i] =items[i];
            //items - newitems
            items = newItems;
        }

        //if space available
        items[count] = item;
        count++;
    }

    //print method
    public void printing(){
        for(int i=0; i<count; i++)
            System.out.println(items[i]);
    }

    //delete method
    public void removeAt(int index){
        //validate the index
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        //if value present
        for(int i=index; i<count; i++)
            items[i]=items[i+1];
        count --;

    }

    //search , find
    public int find(int item){
        //present print, else no
        for(int i=0; i<count; i++)
            if(items[i] == item)
                return i;

        return -1;

    }




}
