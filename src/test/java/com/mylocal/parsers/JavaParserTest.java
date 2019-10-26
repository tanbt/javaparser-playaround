package com.mylocal.parsers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.List;

public class JavaParserTest {

    @Test
    public void shouldReadFields() {
        List<EntityField> entityFields = JavaParser.read("src/test/resources", "User.java");
        assertTrue(entityFields.size() == 4);
    }

}
