/**
 * CS 5004.
 * Lab 2-2.
 * JinYoung Park.
 * Fibonacci Counter.
 */

public class FibonacciCounter {
  private final int count;

  /**
   * Constructs FibonacciCounter object with initial count.
   *
   * @param initialCount initial count value
   * @throws IllegalArgumentException if the initial count is negative
   */
  public FibonacciCounter(int initialCount) {
    if (initialCount < 0) {
      throw new IllegalArgumentException("Initial count can not be negative");
    }
    count = initialCount;
  }

  /**
   * Returns new FibonacciCounter object with count value incremented by 1.
   *
   * @return FibonacciCounter object with an incremented count
   * @throws IllegalStateException if incremented count exceeds Integer.
   */
  public FibonacciCounter incremented() {
    int newCount = count + 1;
    if (newCount < 0) {
      throw new IllegalStateException("Can not increment count beyond int");
    }
    return new FibonacciCounter(newCount);
  }

  /**
   * Returns new FibonacciCounter object with count value decremented by 1.
   *
   * @return FibonacciCounter object with a decremented count
   * @throws IllegalStateException if the decremented count is negative
   */
  public FibonacciCounter decremented() {
    int newCount = count - 1;
    if (newCount < 0) {
      throw new IllegalStateException("Can not decrement count below 0");
    }
    return new FibonacciCounter(newCount);
  }

  /**
   * Returns the current count value.
   *
   * @return the current count value
   */
  public int counter() {
    return count;
  }

  /**
   * Calculates Fibonacci number of the current count value.
   * Make next number in the sequence based on the current counter.
   * Fibonacci starts with 1 and 1.
   * Each subsequent number is the sum of the two previous numbers.
   * If counter value is less than or equal to 1, the number is returned.
   *
   * @return the Fibonacci number of the current count value
   */
  public int sequence() {
    if (counter() <= 1) {
      return count;
    }
    int prevPrevNum = 1;
    int prevNum = 1;
    int curNum = 0;
    for (int i = 3; i <= counter(); i++) {
      curNum = prevPrevNum + prevNum;
      prevPrevNum = prevNum;
      prevNum = curNum;
    }
    return curNum;
  }
}
