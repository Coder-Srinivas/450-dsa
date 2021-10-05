void rearrange(int arr[], int n) {
    // code here
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();
    
    for(int i : arr){
        if(i >= 0){
            pos.add(i);
        }else{
            neg.add(i);
        }
    }
    int p = 0;
    int ne = 0;
    for(int i=0; i<n; i++){
        if((i%2 == 0 && p<pos.size()) || ne >= neg.size()){
            arr[i] = pos.get(p);
            p++;
        }else{
            arr[i] = neg.get(ne);
            ne++;
        }
    }
    
}