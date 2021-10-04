public static int doUnion(int a[], int n, int b[], int m) {
    //Your code here
    
    Set<Integer> union = new HashSet<>();
    
    for(int i : a){
        union.add(i);
    }
    
    for(int i : b){
        union.add(i);
    }
    
    return union.size();
}