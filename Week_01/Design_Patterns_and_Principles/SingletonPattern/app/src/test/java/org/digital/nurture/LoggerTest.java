// app/src/test/java/org/digital/nurture/LoggerTest.java
package org.digital.nurture;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoggerTest {
    @Test
    public void testSingleton() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Both references should point to the same instance
        assertSame(logger1, logger2);

        // Test logging
        logger1.log("Singleton pattern works!");
        logger2.log("Only one instance is used!");
    }
}
