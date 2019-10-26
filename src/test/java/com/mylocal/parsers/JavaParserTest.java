package com.mylocal.parsers;

import static org.junit.Assert.assertTrue;

import com.mylocal.parsers.entity.EntityClass;
import org.junit.Test;

import java.util.List;

public class JavaParserTest {

    @Test
    public void shouldReadFields() {
        EntityClass entityClass = JavaParser.read("src/test/resources", "User.java");
        assertTrue(entityClass.getFields().size() == 4);
    }

}
