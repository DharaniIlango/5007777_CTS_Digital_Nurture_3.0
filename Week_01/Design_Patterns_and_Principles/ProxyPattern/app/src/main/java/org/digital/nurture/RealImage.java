package org.digital.nurture;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading " + filename + " from server.");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}