public class TreeNode {
    TreeNode left = null;
    TreeNode right = null;
    int data;

    public TreeNode(int d){
        data = d;
    }

    public void printNodes(){
        System.out.println("node " + data +": ");
        if(left!= null){
            System.out.print(left.data + ",");
        }
        if(right!= null){
            System.out.print("j" + right.data);
        }
        System.out.println();
        if(left!=null){
            left.printNodes();
        }
        if(right!=null){
            right.printNodes();
        }
        System.out.println();
    }
}

