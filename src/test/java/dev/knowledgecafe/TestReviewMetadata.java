package dev.knowledgecafe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestReviewMetadata {


    @Test
    public void testNullKeyReviewMetadataValue()
    {
        Metadata obj = new Metadata();
        Assertions.assertEquals(true, obj.reviewMetadata(null));
    }

    @Test
    public void testTrueKeyReviewMetadataValue()
    {
        Metadata obj = new Metadata();
        Assertions.assertEquals(true, obj.reviewMetadata(Boolean.TRUE));
    }

}
