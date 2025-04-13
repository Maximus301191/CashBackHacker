package ru.netology.javaqa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void ShouldBuy1USD() {
        int amount = 1;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        assertEquals (actual,expected);
    }

    @Test
    public void ShouldBuy999USD() {
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        assertEquals (actual,expected);
    }

    @Test
    public void ShouldBuy1000USD() {
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals (actual,expected);
    }

    @Test
    public void ShouldBuy1200USD() {
        int amount = 1200;
        int expected = 800;
        int actual = cashbackHackService.remain(amount);

        assertEquals (actual,expected);
    }




}