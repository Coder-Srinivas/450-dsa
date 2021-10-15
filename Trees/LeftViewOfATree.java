ArrayList<Integer> leftView(Node root){
    ArrayList<Integer> ans = new ArrayList<>();
    boolean[] visited = new boolean[100];
    preorder(root, visited, ans, 0);
    return ans;
  }
  
 static void preorder(Node root, boolean[] visited, ArrayList<Integer> ans, int level){
    if(root==null)
    return;
    if(!visited[level]){
        ans.add(root.data);
        visited[level] = true;
    }
    preorder(root.left, visited, ans, level+1);
    preorder(root.right, visited, ans, level+1);
}