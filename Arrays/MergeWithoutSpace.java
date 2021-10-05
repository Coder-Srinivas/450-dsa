public void merge(int arr1[], int arr2[], int n, int m) {
        
    int gap = (m + n)%2 == 1 ? (m + n + 1)/2 : (m + n)/2;
    int i = 0;
    int j = gap;
    while(gap > 0){

        while(j < arr1.length){
            int one = arr1[i];
            int two = arr1[j];
            arr1[i] = Math.min(one, two);
            arr1[j] = Math.max(one, two);
            i++;
            j++;
        }
        
        if(gap >= arr1.length){
            j = gap - arr1.length;
        }else{
            j = 0;
        }
        
        while(i < arr1.length && j<arr2.length){
            int one = arr1[i];
            int two = arr2[j];
            arr1[i] = Math.min(one, two);
            arr2[j] = Math.max(one, two);
            i++;
            j++;
        }
        
        i = 0;
        while(j < arr2.length){
            int one = arr2[i];
            int two = arr2[j];
            arr2[i] = Math.min(one, two);
            arr2[j] = Math.max(one, two);

            i++;
            j++;
        }

        gap = gap%2 == 1 && gap != 1 ? (gap+1)/2 : gap/2;
        i = 0;
        j = gap;
    }
}