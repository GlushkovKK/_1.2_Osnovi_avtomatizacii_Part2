package ru.netologi;

import static org.junit.Assert.assertEquals;

public class BonusCashTest {
    @org.junit.Test
    public void showWorkCashback(){
        int boundary = 2000;
        int amount = 10;
        int expected = 1000;

        BonusCash service = new BonusCash();
        int actual = service.remain(boundary);

        assertEquals(expected,actual);


    }

    @org.junit.Test
    public void showWorkCashback2(){
        int boundary = 900;
        int amount = 10;
        int expected = 100;

        BonusCash service = new BonusCash();
        int actual = service.remain(boundary);

        assertEquals(expected,actual);


    }


}