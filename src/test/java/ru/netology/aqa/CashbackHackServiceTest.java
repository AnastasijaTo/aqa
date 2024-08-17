package ru.netology.aqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@Test
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    public void shouldSummaLess1000() {

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public class CashbackHackServiceTest {
        CashbackHackService service = new CashbackHackService();

        public void shouldNotRemain1000() {
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;
            assertEquals(expected, actual);
        }
    }