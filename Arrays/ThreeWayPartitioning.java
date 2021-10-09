public void threeWayPartition(int array[], int a, int b){
        
    int i = 0;
    int j = array.length - 1;
    
    while(i < j){
        if(array[i] > b){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }else{
            i++;
        }
    }
    i=0; 
    while(i < j){
        if(array[j] < a){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
        }else{
            j--;
        }
    }
}