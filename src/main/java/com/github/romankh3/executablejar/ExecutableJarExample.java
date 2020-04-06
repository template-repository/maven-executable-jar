package com.github.romankh3.executablejar;

import org.apache.commons.lang3.StringUtils;

/**
 * Main class for Maven Executable Jar.
 */
public class ExecutableJarExample {

    public static final String JAVA_REPOSITORY_TEMPLATE = "executable-jar-example";

    public static void main(String[] args) {
        // added if to use library from classpath to be sure
        // that jar gets dependencies
        if(StringUtils.isNoneEmpty(JAVA_REPOSITORY_TEMPLATE)) {
            System.out.println(String.format("Hello world, %s!",JAVA_REPOSITORY_TEMPLATE));
        }
    }
}
