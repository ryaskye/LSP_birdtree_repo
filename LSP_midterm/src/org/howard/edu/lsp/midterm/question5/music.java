package org.howard.edu.lsp.midterm.question5;

/**
 * used google for starter code
 */

public class music implements Streamable {
    private String songTitle;

    public music(String songTitle) {
        this.songTitle = songTitle;
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + songTitle);
    }

    @Override
    public void pause() {
        System.out.println("Paused music: " + songTitle);
    }

    @Override
    public void stop() {
        System.out.println("Stopped music: " + songTitle);
    }

    // Music-specific behavior
    public void addToPlaylist(String playlistName) {
        System.out.println("Added " + songTitle + " to " + playlistName + " playlist");
    }
}