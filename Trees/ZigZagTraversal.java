ArrayList<Integer> zigZagTraversal(Node root)
{
    //Add your code here.
    ArrayList<Integer> ans = new ArrayList<>();
    getAns(root, ans);
    return ans;
}

static void getAns(Node root, ArrayList<Integer> ans){
    boolean change = true;
    
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        int size = q.size();
        ArrayList<Integer> level = new ArrayList<>();
        while(size-- > 0){
            Node curr = q.poll();
            level.add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        
        if(change){
            ans.addAll(level);
        }else{
            Collections.reverse(level);
            ans.addAll(level);
        }
        change = !change;
    }
}