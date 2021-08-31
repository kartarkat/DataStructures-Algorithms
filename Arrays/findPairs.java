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