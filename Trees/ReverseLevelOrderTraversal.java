// Problem Link : https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1

public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            ans.add(curr.data);
            
            if(curr.right!=null)
            queue.add(curr.right);
            
            if(curr.left!= null)
            queue.add(curr.left);
            
            
        }
        Collections.reverse(ans);
        return ans;
}