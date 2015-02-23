package dcll.tp2;

import junit.framework.TestCase;

public class MyStackTest extends TestCase {

    public void testIsEmpty() throws Exception {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }

    public void testGetSize() throws Exception {
        MyStack stack = new MyStack();
        stack.push(new Item("item1"));
        assertEquals(stack.getSize(),1);
    }

    public void testPush() throws Exception {
        MyStack stack = new MyStack();
        stack.push(new Item("item1"));
        assertEquals(stack.getSize(),1);
    }

    public void testPeek() throws Exception {
        MyStack stack = new MyStack();
        Item it1 = new Item("item1");
        stack.push(it1);
        assertTrue(it1.equals(stack.peek()));
    }

    public void testPop() throws Exception {
        MyStack stack = new MyStack();
        stack.push(new Item("item1"));
        stack.pop();
        assertEquals(stack.getSize(),0);
    }
}