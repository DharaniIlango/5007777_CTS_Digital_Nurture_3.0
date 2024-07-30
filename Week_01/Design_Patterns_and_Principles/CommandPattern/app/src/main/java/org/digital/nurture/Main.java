package org.digital.nurture;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        System.out.println("Testing Light On Command:");
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        System.out.println("Testing Light Off Command:");
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
