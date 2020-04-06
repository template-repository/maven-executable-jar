package com.github.romankh3.executablejar;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link ExecutableJarExample} object.
 */
public class ExecutableJarExampleTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        ExecutableJarExample main = new ExecutableJarExample();
        assertNotNull(main);
    }

}
