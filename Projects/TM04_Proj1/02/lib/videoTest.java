package lib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class videoTest {
    private video video;
    private String videoName;
    private int rating;

    @Before
    public void before() {
        videoName = "Test Name";
        rating = 5;
        video = new video(videoName);
    }

    @Test
    public void getNameTest() {
        assertEquals(videoName, video.getName());
    }

    @Test
    public void doCheckoutTest() {
        video.doCheckout();
        assertTrue(video.getCheckout());
    }

    @Test
    public void doReturnTest() {
        video.doReturn();
        assertFalse(video.getCheckout());
    }

    @Test
    public void receiveRatingTest() {
        video.receiveRating(rating);
        assertEquals(rating, video.getRating());
    }

    @Test
    public void getRatingTest() {
        video.receiveRating(rating);
        assertEquals(rating, video.getRating());
    }

    @Test
    public void getCheckoutTest() {
        video.doCheckout();
        assertTrue(video.getCheckout());
        video.doReturn();
        assertFalse(video.getCheckout());
    }

}