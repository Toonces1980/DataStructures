package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 2/24/17.
 */

public class SinglyLinkedListTest {
    SinglyLinkedList startsWithTwo;

    @Before
    public void setup() {
        startsWithTwo = new SinglyLinkedList();
        startsWithTwo.add();
        startsWithTwo.add();
    };

    @Test
    public void singlyLinkedListAddTest() {
        Integer expected = 2;
        startsWithTwo.add();
        startsWithTwo.add();
        Integer actual = startsWithTwo.size();
        assertEquals(expected,actual);
    }

    @Test
    public void singlyLinkedListRemoveTest() {
        Integer expected = 1;
        Integer actual = startsWithTwo.size();
        assertEquals(expected,actual);
    }

    @Test
    public void singlyLinkedListContainsFalseTest() {
        Boolean expected = false;
        Boolean actual = startsWithTwo.contains(1);
        assertEquals(expected,actual);
    }

    @Test
    public void singlyLinkedListContainsTrueTest() {
        Boolean expected = true;
        Boolean actual = startsWithTwo.contains(2);
        assertEquals(expected,actual);
    }

    @Test
    public void singlyLinkedListFindTest() {
        Integer expected = 1;
        Integer actual = startsWithTwo.find(2);
        assertEquals(expected,actual);
    }

    @Test
    public void singlyLinkedListFindFalseTest() {
        Integer expected = -1;
        Integer actual = startsWithTwo.find(1);
        assertEquals(expected,actual);

    }

    @Test
    public void singlyLinkedListSizeTest() {
        Integer expected = 2;
        Integer actual = startsWithTwo.size();
        assertEquals(expected,actual);
    }

    @Test
    public void singlyLinkedListGetTest() {
        Object expected = 2;
        Object actual = startsWithTwo.get(0);
        assertEquals(expected,actual);
    }

    @Test
    public void singlyLinkedTest() {
        Object expected = startsWithTwo;
        Object actual = startsWithTwo;
        assertEquals(expected,actual);
    }
}