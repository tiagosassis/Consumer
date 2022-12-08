package Main;

/**
 *
 * @author tiagu
 */
public class Node {
    private int value;
    private Node nodeLeft, nodeRight;
    
    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNodeLeft() {
        return this.nodeLeft;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public Node getNodeRight() {
        return this.nodeRight;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }
    
}
