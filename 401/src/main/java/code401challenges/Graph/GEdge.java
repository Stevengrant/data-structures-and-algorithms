package code401challenges.Graph;

public class GEdge {
    private GNode left;
    private GNode right;
    public int weight;

    //PUBLIC CONSTRUCTOR
    public GEdge (GNode left, GNode right, int weight){
        this.left = left;
        this.right = right;
        this.weight = weight;
    };

    //GETTERS/SETTERS
    public GNode getLeft() {
        return left;
    }

    public void setLeft(GNode left) {
        this.left = left;
    }

    public GNode getRight() {
        return right;
    }

    public void setRight(GNode right) {
        this.right = right;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
