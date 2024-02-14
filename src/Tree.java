public class Tree {
    private final int branches;

    public Tree(int branches) {
        this.branches = branches;
    }

    public int songsFor(int birds) {
        if (branches == 0 || birds == 0) {
            return 0;
        }

        int possibleSongs;

        if (birds > branches) {
            possibleSongs = Math.disposition(birds, branches);
        } else if (birds < branches) {
            possibleSongs = Math.disposition(branches, birds);
        } else {
            possibleSongs = Math.factorial(birds);
        }

        return possibleSongs;
    }
}
