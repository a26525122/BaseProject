package com.github.D0542426.C8763;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class kiritoTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        kirito triangle = new kirito(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
