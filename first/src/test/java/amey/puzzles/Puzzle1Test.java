package amey.puzzles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Puzzle1Test {
    
    @Test
    public void removeVowelTest(){
        assertEquals("my", Puzzle1.replaceVowel("amey"));
        assertEquals("12345", Puzzle1.replaceVowel("a1e2i3o4u5"));
        assertEquals("123", Puzzle1.replaceVowel("aaa1eee2iii3ooouuu"));
        assertEquals("123", Puzzle1.replaceVowel("aeiou123uoiea"));
        assertEquals("112233", Puzzle1.replaceVowel("11aeiou22aeiou33"));
        assertEquals("Mry hd  lttl lmb", Puzzle1.replaceVowel("Mary had a little lamb"));
    }
}
