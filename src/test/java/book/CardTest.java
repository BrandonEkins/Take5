package book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {
    @Test
    void testPrintCard () {
        Card testCard = new Card(1,3);
        assertEquals("[ 1, 3 ]", testCard.printCard());
    }
}
