import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PPMImageTest {
    private PPMImage test1;

    public void setUp() {
        test1 = new PPMImage("kenny.ppm");
    }
    /*
     * Check the method can correctly change color to grey level
     * @test makeGrey
     */
    public void test1() {

        short[][] expected = { { 2, 5, 8, 11, 14 },
                               { 17, 20, 23, 26, 29 },
                               { 32, 35, 38, 41, 44 },
                               { 47, 50, 53, 56, 59 },
                               { 62, 65, 68, 71, 74 }};

        short[][] actual = test1.makeGrey("kenny.pgm");
        assertArrayEquals(expected, actual);
    }
    /*
     * Compare two image files whether is consistent
     */
    public void test1a() {
        test1.makeGrey("kenny.pgm");
        PGMImage expected = new PGMImage("kenny-expected.pgm") ;
        PGMImage actual =   new PGMImage("kenny.pgm");
        assertTrue(actual.equals(expected));
    }
}
