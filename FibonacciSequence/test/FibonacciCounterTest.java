import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Unit tests for the FibonacciCounter class.
 */
public class FibonacciCounterTest {

  /**
   * Testing if the initialCounting is negative.
   */
  @org.junit.Test
  public void testInitialCountNegative() {
    assertThrows(IllegalArgumentException.class, () -> new FibonacciCounter(-1));
  }

  /**
   * Testing incremented() method.
   */
  @org.junit.Test
  public void testIncremented() {
    FibonacciCounter counter = new FibonacciCounter(7);
    FibonacciCounter incrementedCounter = counter.incremented();
    assertEquals(8, incrementedCounter.counter());
  }

  /**
   * Testing if incremented() is overflowed.
   */
  @org.junit.Test
  public void testIncrementedOverflow() {
    FibonacciCounter counter = new FibonacciCounter(Integer.MAX_VALUE);
    assertThrows(IllegalStateException.class, counter::incremented);
  }

  /**
   * Testing decrement() method.
   */
  @org.junit.Test
  public void testDecremented() {
    FibonacciCounter counter = new FibonacciCounter(7);
    FibonacciCounter decrementedCounter = counter.decremented();
    assertEquals(6, decrementedCounter.counter());
  }

  /**
   * Testing if incremented() method is underflow.
   */
  @org.junit.Test
  public void testDecrementedUnderflow() {
    FibonacciCounter counter = new FibonacciCounter(0);
    assertThrows(IllegalStateException.class, counter::decremented);
  }

  /**
   * Testing counter() method.
   */
  @org.junit.Test
  public void testCounter() {
    FibonacciCounter counting = new FibonacciCounter(4);
    assertEquals(4, counting.counter());

  }

  /**
   * Testing sequence() method.
   */
  @org.junit.Test
  public void testSequence() {
    FibonacciCounter counter1 = new FibonacciCounter(0);
    assertEquals(0, counter1.sequence());

    FibonacciCounter counter2 = new FibonacciCounter(1);
    assertEquals(1, counter2.sequence());

    FibonacciCounter counter3 = new FibonacciCounter(7);
    assertEquals(13, counter3.sequence());
  }
}