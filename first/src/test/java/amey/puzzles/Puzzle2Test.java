package amey.puzzles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Puzzle2Test {
    
    Puzzle2 puzzle = new Puzzle2();
    
    @Test
    public void testPuzzle(){
        assertEquals(true, puzzle.isIsogram("qwerty"));
        assertEquals(true, puzzle.isIsogram("abcxyz"));
        assertEquals(true, puzzle.isIsogram("AbCdEfGhIj"));
        assertEquals(false, puzzle.isIsogram("ameya"));
        assertEquals(false, puzzle.isIsogram("see"));
        assertEquals(false, puzzle.isIsogram("Elephant"));
        assertEquals(false, puzzle.isIsogram("AbaBcaCdcD"));
    }
    
}
