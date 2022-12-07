package Main;

/**
 *
 * @author tiagu
 */
public class Tree {
    public void printPreorder(Node node){
        if(node == null)
            return;

        System.out.println(node.getValue());

        printPreorder(node.getLeft());

        printPreorder(node.getRight());
    }
    public void printInordem(Node node){
        if(node == null)
            return;

        printPreorder(node.getLeft());

        System.out.println(node.getValue());

        printPreorder(node.getRight());
    }
    public void printPosordem(Node node){
        if(node == null)
            return;

        printPreorder(node.getLeft());

        printPreorder(node.getRight());

        System.out.println(node.getValue());
    }
}
