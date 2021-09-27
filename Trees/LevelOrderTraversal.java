// Problem Link : https://practice.geeksforgeeks.org/problems/level-order-traversal/1

static ArrayList <Integer> levelOrder(Node node) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            ans.add(curr.data);
            
            if(curr.left!= null)
            queue.add(curr.left);
            
            if(curr.right!=null)
            queue.add(curr.right);
        }
        return ans;
}






