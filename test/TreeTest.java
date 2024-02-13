import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTest {

    @Test
    void noBranchesAndAnyBirdCanGenerateZeroSongs() {
        int birds = 25, branches = 0;
        Tree tree = new Tree(branches);

        assertEquals(0, tree.songsFor(birds));
    }

    @Test
    void anyBranchesAndZeroBirdsCanGenerateZeroSongs() {
        int birds = 0, branches = 25;
        Tree tree = new Tree(branches);

        assertEquals(0, tree.songsFor(birds));
    }

    @Test
    void sameAmountOfBranchesAndBirdsCanGenerateAmountFactorialSongs() {
        int birds = 3, branches = 3;
        Tree tree = new Tree(branches);

        assertEquals(6, tree.songsFor(birds));
    }

    @Test
    void higherAmountOfBirdsComparedToBranchesButNotZeroCanGenerateDispositionSongs() {
        int birds = 6, branches = 3;
        Tree tree = new Tree(branches);

        assertEquals(120, tree.songsFor(birds));
    }
}
