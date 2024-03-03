package dev.knowledgecafe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMetadata {

    @Test
    public void testValidKeyMetadataValue()
    {
        Metadata obj = new Metadata();
        Assertions.assertEquals("MY VALUE", obj.getMetadata("My Value"));
    }

    @Test
    public void testBlankKeyMetadataValue()
    {
        Metadata obj = new Metadata();
        Assertions.assertEquals("Invalid key!", obj.getMetadata(""));
    }

    //@Test
    public void testNullKeyMetadataValue()
    {
        Metadata obj = new Metadata();
        Assertions.assertEquals("Invalid key!", obj.getMetadata(null));
    }

}
