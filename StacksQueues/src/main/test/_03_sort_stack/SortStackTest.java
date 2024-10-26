public class SortStackTest {

  @Test
  public void sortStackTest() {
    SortStack sortStack = new SortStack();

    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(1);
    stack.push(5);
    stack.push(2);
    stack.push(4);
    Deque<Integer> sortedStack = sortStack.sort(stack);

    
  }
}
