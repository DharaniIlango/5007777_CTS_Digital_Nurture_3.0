package org.digital.nurture;

import org.junit.Before;
import org.junit.Test;

public class CommandPatternTest {

    private Light light;
    private Command lightOnCommand;
    private Command lightOffCommand;
    private RemoteControl remoteControl;

    @Before
    public void setUp() {
        light = new Light();
        lightOnCommand = new LightOnCommand(light);
        lightOffCommand = new LightOffCommand(light);
        remoteControl = new RemoteControl();
    }

    @Test
    public void testLightOnCommand() {
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
    }

    @Test
    public void testLightOffCommand() {
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
