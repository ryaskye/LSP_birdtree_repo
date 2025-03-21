package org.howard.edu.lsp.midterm.question5;
/**
 * used google for starter code
 */
public class Audiobook implements Streamable {
    private String bookTitle;

    public Audiobook(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void play() {
        System.out.println("Playing audiobook: " + bookTitle);
    }

    @Override
    public void pause() {
        System.out.println("Paused audiobook: " + bookTitle);
    }

    @Override
    public void stop() {
        System.out.println("Stopped audiobook: " + bookTitle);
    }

    // Audiobook-specific behavior
    public void setPlaybackSpeed(double speed) {
        System.out.println("Setting playback speed of audiobook: " + bookTitle + " to " + speed + "x");
    }
}
