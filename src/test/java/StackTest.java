import org.example.Stack;
import org.example.utsefulexceptions.PutAndTakeOutException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;


    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void canCreateAStack() {
        assertNotNull(stack);
    }

    @Test
    void canIDoPushToTheStack() {
        assertTrue(stack.push(1));
    }

    @Test
    void getTheSizeOfTheStack() {
        assertEquals(0, stack.size());
    }

    @Test
    void doPushAndGetTheSize() {
        stack.push(1);
        assertEquals(1, stack.size());
    }

    @Test
    void doTwoPushAndGetTheSize() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }

    @Test
    void firstDoPopAndTrowsPutAndTakeOutException() {
        var exceptionPop = assertThrows(IndexOutOfBoundsException.class, () -> {
            stack.pop();
        });
        String current = exceptionPop.getMessage();
        String expected = "You can't get something out if there's nothing there";
        assertEquals(expected, current);
    }

    @Test
    void doPushAndPopAndShouldByEmptyAgain() {
        stack.push(1);
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    void doPeekShouldShowTheLastNumberAdd() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
    }

    @Test
    void doPushDoPeekAndDoSize() {
        stack.push(1);
        stack.peek();
        stack.size();
        assertEquals(1, stack.size());
    }

    @Test
    void doTwoPushAndTwoPopShouldBeZero() {
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        assertEquals(0, stack.size());
        assertNotEquals(2, stack.size());
    }

    @Test
    void doPushDoPopThenPushAndPopAgainShoulBeZero() {
        stack.push(1);
        stack.pop();
        stack.push(2);
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    void whatIsTheMaxSize() {
        var MAX_SIZE = Stack.MAX_SIZE;
        assertNotEquals(7, MAX_SIZE);
        assertEquals(5, MAX_SIZE);
    }

    @Test
    void tryingToExceedTheMaxSizeShouldNotHappen() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertNotEquals(6, stack.size());
        assertEquals(5, stack.size());
    }
}