public List<String> AllPossibleStrings(String s){
        
    List<String> ans = new ArrayList<>();
    
    for(int i=1; i<Math.pow(2, s.length()); i++){
        addString(ans, s, i);
    }
    Collections.sort(ans);
    return ans;
}

public static void addString(List<String> ans, String s, int i){
    
    int x = 0;
    String cur = "";
    while(i > 0){
        if((i & 1) != 0){
            cur += s.charAt(x);
        }
        i = (i>>1);
        x++;
    }
    ans.add(cur);
}