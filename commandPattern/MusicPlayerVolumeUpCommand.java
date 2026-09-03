package commandPattern;

public class MusicPlayerVolumeUpCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerVolumeUpCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.increaseVolume();
    }
}