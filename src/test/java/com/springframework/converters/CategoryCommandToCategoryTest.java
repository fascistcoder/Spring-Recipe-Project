package com.springframework.converters;

import com.springframework.commands.CategoryCommand;
import com.springframework.model.Category;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 27/09/21
 */
class CategoryCommandToCategoryTest {

    public static final Long ID_VALUE = new Long(1L);
    public static final String DESCRIPTION = "description";
    CategoryCommandToCategory conveter;

    @BeforeEach
    void setUp() throws Exception {
        conveter = new CategoryCommandToCategory();
    }

    @Test
    void testNullObject() throws Exception {
        assertNull(conveter.convert(null));
    }

    @Test
    void testEmptyObject() throws Exception {
        assertNotNull(conveter.convert(new CategoryCommand()));
    }

    @Test
    void convert() throws Exception {
        //given
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(ID_VALUE);
        categoryCommand.setDescription(DESCRIPTION);

        //when
        Category category = conveter.convert(categoryCommand);

        //then
        assertEquals(ID_VALUE, category.getId());
        assertEquals(DESCRIPTION, category.getDescription());
    }

}