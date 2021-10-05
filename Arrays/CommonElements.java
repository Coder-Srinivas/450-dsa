ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
    // code here
    ArrayList<Integer> ans = new ArrayList<>();
    Set<Integer> a = new HashSet<>();
    Set<Integer> b = new HashSet<>();
    Set<Integer> c = new HashSet<>();
    
    for(int i : A){
        a.add(i);
    }
    for(int i : B){
        b.add(i);
    }
    
    for(int i : C){
        if(a.contains(i) && b.contains(i) && !c.contains(i)){
            ans.add(i);
            c.add(i);
        }
    }
    return ans;
}