import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3, 5, 7, 9 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9, 7, 5, 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 9 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 9 }, input2);
	}
}

  // @Test
  // public void testReversed() {
  //   int[] input1 = { };
  //   assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  // }
// }
