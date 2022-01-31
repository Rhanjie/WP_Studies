package Lab4.Zad4_D;

import java.util.ArrayList;

public interface ThirdPartyYoutubeLib {
    public abstract ArrayList<VideoInfo> listVideos();
    public abstract VideoInfo getVideoInfo(String id);
    public abstract Video downloadVideo(String id);
}
