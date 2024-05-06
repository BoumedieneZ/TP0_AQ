import org.example.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setup() {
        stack = new Stack();
    }

    @Test
    public void testPush() {
        stack.push(5);
        stack.push(10);
        Assertions.assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        stack.push(5);
        stack.push(10);
        int poppedElement = stack.pop();
        Assertions.assertEquals(10, poppedElement);
        Assertions.assertEquals(1, stack.size());
    }

    @Test
    public void testPeek() {
        stack.push(5);
        stack.push(10);
        int peekedElement = stack.peek();
        Assertions.assertEquals(10, peekedElement);
        Assertions.assertEquals(2, stack.size());
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push(5);
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(0, stack.size());
        stack.push(5);
        Assertions.assertEquals(1, stack.size());
        stack.push(10);
        Assertions.assertEquals(2, stack.size());
    }

    @Test
    public void testExpandArray() {
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        Assertions.assertEquals(15, stack.size());
    }
}
