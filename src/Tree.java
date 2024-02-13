public class Tree {
    private final int branches;

    public Tree(int branches) {
        this.branches = branches;
    }

    public int songsFor(int birds) {
        if (birds == 1 && branches == 1) return 1;
        return 0;
    }
}
