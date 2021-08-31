    /*
    find pairs with given sum, given a array of size n
    find all pairs, it ia sorted array with distinct number
    if no pair then, print -1.

    for example: 1,2,3,4,5,6,7 - 9
    2+7, 3+6, 4+5
    */ 
public void findPairs() {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
        int total = -12;

        int start = 0;
        int end = arr.length -1;

        while (start < end) {

            if (arr[start] + arr[end] > total)
                end--;
            else if (arr[start] + arr[end] < total)
                start++;
            else if(arr[start] + arr[end] == total) {
                System.out.println(arr[start] + "," + arr[end]);
                end--;
                start++;
            }



        }

    }
