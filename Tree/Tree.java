public class Tree{//shows relational data
    TreeNode root;
    
    public void add(int data){
        if(root == null){
            root = new TreeNode(data);
            return;
        }

        TreeNode currentNode = root;
        while(currentNode != null){
            if(data < currentNode.data){
                if(currentNode.left != null){
                    currentNode = currentNode.left; // now will compare inputted data with new current node
                }
                else{
                    currentNode.left = new TreeNode(data);
                    return;
                }
            }
    
            else if(data > currentNode.data){
                if(currentNode.right != null){
                    currentNode = currentNode.right;
                }
                else{
                    currentNode.right = new TreeNode(data);
                    return;
                }
            }
        }
    }
    
    public void printTree(){
        root.printNodes();
    }

    
}
