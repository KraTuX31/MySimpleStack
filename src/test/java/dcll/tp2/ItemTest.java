package dcll.tp2;

import junit.framework.TestCase;

public class ItemTest extends TestCase {

    public void testToString() throws Exception {
        Item it = new Item("myItem");
        assertTrue(it.toString().equals("myItem"));
    }
}