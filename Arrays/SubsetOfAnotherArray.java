public String isSubset( long a1[], long a2[], long n, long m) {
        
    Set<Long> set = new HashSet<>();
    boolean subset = true;
    for(long i : a1){
        set.add(i);
    }
    
    for(long i : a2){
        if(!set.contains(i)){
            subset = false;
            break;
        }
    }
    
    return subset ? "Yes" : "No";
} 