public class Tree {
    private final int branches;

    public Tree(int branches) {
        this.branches = branches;
    }

    public int songsFor(int birds) {
        if (branches == 0) {
            return 0;
        }
        return factorial(birds);
    }

    private int factorial(int birds) {
        if (birds <= 2)
            return birds;

        return birds * factorial(birds - 1);
    }
}
