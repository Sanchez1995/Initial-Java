package BSTWork;

public class BSTTest {

    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        //Traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("\nPostorder: ");
        tree.postorder();
        System.out.println("\nPreorder: ");
        tree.preorder();
        System.out.println("\nThe number of nodes is " + tree.getSize());

        //sear for an element
        System.out.println("\nIs Peter in the tree? " + tree.search("Peter"));

        java.util.ArrayList<BST.TreeNode<String>> path = tree.path("Peter");

        System.out.println("The path to Peter is: ");

        // display
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i).element + ", ");
        }
    }
}
