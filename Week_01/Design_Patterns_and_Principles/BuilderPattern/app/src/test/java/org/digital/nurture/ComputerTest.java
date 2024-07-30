package org.digital.nurture;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ComputerTest {

    @Test
    public void testComputerBuilder() {
        Computer computer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .build();
        
        String computerStr = computer.toString();
        
        assertTrue(computerStr.contains("CPU=Intel i9"), "CPU should be Intel i9");
        assertTrue(computerStr.contains("RAM=32GB"), "RAM should be 32GB");
        assertTrue(computerStr.contains("Storage=2TB SSD"), "Storage should be 2TB SSD");
    }
}
