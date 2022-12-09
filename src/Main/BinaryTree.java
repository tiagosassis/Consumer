package Main;

/**
 *
 * @author tiagu
 */
public class BinaryTree {
    Node root;

    public BinaryTree(int value){
        this.root = new Node(value);
    }

    public void insert(int value) {
		insert(value, root);
	}
	
	private void insert(int value, Node root) {
		
		if (root.getValue() == value) return;
		
		if (root.getNodeLeft() == null && root.getValue() > value) {		
			Node newNode = new Node(value);
			root.setNodeLeft(newNode);
			return;
        }
        else{
		    if (root.getNodeRight() == null && root.getValue() < value) {
			    Node newNode = new Node(value);
			    root.setNodeRight(newNode);
			    return;
	        }
		
		    if (value < root.getValue()) 
			    insert(value, root.getNodeLeft());
		    else 
			    insert(value, root.getNodeRight());
		
	    }
	}

    public Node getRoot(){
        return root;
    }

    public void printPreorder(){
        printPreorder(root);
    }
    private void printPreorder(Node node){
        if(node == null)
           return;
        
        System.out.println(node.getValue());

        printPreorder(node.getNodeLeft());

        printPreorder(node.getNodeRight());
    }
    
    public void printInordem(){
        printInordem(root);
    }
    private void printInordem(Node node){
        if(node == null)
            return;

        printPreorder(node.getNodeLeft());

        System.out.println(node.getValue());

        printPreorder(node.getNodeRight());
    }

    public void printPosordem(){
        printPosordem(root);
    }
    private void printPosordem(Node node){
        if(node == null)
            return;

        printPreorder(node.getNodeLeft());

        printPreorder(node.getNodeRight());

        System.out.println(node.getValue());
    }

    public boolean isStrictBinaryTree(){
        return isStrictBinaryTree(root);
        
    }
    public boolean isStrictBinaryTree(Node root){
        if(root == null)
            return true;

        if((root.getNodeLeft() == null && root.getNodeRight() != null) || (root.getNodeLeft() != null && root.getNodeRight() ==  null))
            return false;
        
        return isStrictBinaryTree(root.getNodeLeft()) && isStrictBinaryTree(root.getNodeRight());
        
    }

    public boolean isFullBinaryTree(){
        return isFullBinaryTree(root);
    }
    public boolean isFullBinaryTree(Node root){
        return true;
    }

    public boolean isCompleteBinaryTree(){
        return isCompleteBinaryTree(root);
    }
    public boolean isCompleteBinaryTree(Node root){
        return true;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }
    public boolean isBalanced(Node root){
        return true;
    }
}
