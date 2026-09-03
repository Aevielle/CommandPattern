package commandPattern;

public class MusicPlayer {
    private int volume = 50;

    public String increaseVolume() {
        volume += 10;
        return "Music player volume increased to " + volume;
    }

    public String decreaseVolume() {
        volume -= 10;
        return "Music player volume decreased to " + volume;
    }
}