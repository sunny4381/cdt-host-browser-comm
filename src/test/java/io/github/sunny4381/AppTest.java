/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.sunny4381;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testCall() throws Exception {
        assertThat(new App().call(), is(0));
    }
}
