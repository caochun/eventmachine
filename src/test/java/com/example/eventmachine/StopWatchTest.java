package com.example.eventmachine;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    private StopWatch stopWatch;

    /**
     * Set up instance variables required by this test case.
     */
    @BeforeEach
    public void setUp() throws Exception {
        stopWatch = new StopWatch();
    }

    /**
     * Tear down instance variables required by this test case.
     */
    @AfterEach
    public void tearDown() {
        stopWatch = null;
    }

    @Test
    public void testStopWatch() {
        Assertions.assertEquals("reset", stopWatch.getCurrentState());
        stopWatch.fireEvent(StopWatch.EVENT_START);
        Assertions.assertEquals("running", stopWatch.getCurrentState());
        stopWatch.fireEvent(StopWatch.EVENT_SPLIT);
        Assertions.assertEquals("paused", stopWatch.getCurrentState());
        stopWatch.fireEvent(StopWatch.EVENT_UNSPLIT);
        Assertions.assertEquals("running", stopWatch.getCurrentState());
        stopWatch.fireEvent(StopWatch.EVENT_STOP);
        Assertions.assertEquals("stopped", stopWatch.getCurrentState());
        stopWatch.fireEvent(StopWatch.EVENT_RESET);
        Assertions.assertEquals("reset", stopWatch.getCurrentState());
    }

}
