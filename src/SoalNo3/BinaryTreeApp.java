package SoalNo3;

public class BinaryTreeApp {
     public static void main(String [] args) {
        BinaryTree tree = new BinaryTree();
        
        TreeNode node;
        
        node = new TreeNode(50);
        tree.insert (node);
        
        node = new TreeNode(30);
        tree.insert (node);
        
        node = new TreeNode(20);
        tree.insert (node);
        
        node = new TreeNode(40);
        tree.insert (node);
        
        node = new TreeNode(70);
        tree.insert (node);
        
        
        System.out.print("Traversal dengan inorder : ");
        tree.inOrder();
        System.out.println();
        System.out.print("Traversal dengan preorder : ");
        tree.preOrder();
        System.out.println();
        System.out.print("Traversal dengan postorder : ");
        tree.postOrder();
        System.out.println();
    }
}
    
