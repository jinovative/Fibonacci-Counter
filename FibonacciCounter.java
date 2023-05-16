public class FibonacciCounter {
  private final int count;

  public FibonacciCounter(int initialCount) {
    count = initialCount;
  }

  public FibonacciCounter incremented() {
    return new FibonacciCounter(count + 1);
  }

  public FibonacciCounter decremented() {
    return new FibonacciCounter(count - 1);
  }

  public int counter() {
    return count;
  }

  public int count() {
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
  public String toString() {
    return "FibonacciCounter: count=" + count + ", fibonacciNumber=" + count();
  }

  public static void main(String[] args) {
    FibonacciCounter counter = new FibonacciCounter(7);
    System.out.println(counter);
  }
}
