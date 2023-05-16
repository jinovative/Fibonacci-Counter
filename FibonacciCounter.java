// A Fibonacci series is a popular sequence of numbers. The first two numbers of this series are 0 and 1. After this, the next Fibonacci number is obtained by adding the previous two. Thus the Fibonacci sequence is 0,1,1,2,3,5,8,13,...
//
//A Fibonacci counter is a machine that counts Fibonacci numbers. Much like a step tracker, it can be started at any count. It can be incremented or decremented by 1 (count falling below 0 is invalid). Given a number ’n’, the nth Fibonacci number can be calculated directly using Binet’s formula:

public class FibonacciCounter {
  // A constructor that takes the initial count value and initializes the object appropriately.
  private int count;

  public FibonacciCounter(int initialCount) {
    count = initialCount;
  }


  // A method that returns a FibonacciCounter object with its count incremented by 1.

  public FibonacciCounter incremented () {
    return new FibonacciCounter(count +1);
  }


  // A method that returns a FibonacciCounter object with its count decremented by 1. If it cannot be decremented, it returns the object with the same count.
  public FibonacciCounter decremented() {
    return new FibonacciCounter(count -1);
  }

  // A method that returns the current count of the counter.

  public int counter() {
    return count;
  }

  // A method that returns the Fibonacci number corresponding to the current count.

  public int currentCount() {
    if (count <= 1) {
      return count;
    }

    int prevPrevNum = 1; // 전 전 항 (n-2)
    int prevNum = 1; // 이전 항 (n-1)

    for (int i = 3; i < count; i++) {
      int curNum = prevPrevNum + prevNum; // 현재 항 (n)
      prevPrevNum = prevNum;
      prevNum = curNum;
    }
    return curNum;
}
