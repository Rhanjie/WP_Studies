package Lab4.Zad4_D;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public ArrayList<VideoInfo> listVideos() {
        // Wyślij żądanie do interfejsu programowania aplikacji (API) YouTube.

        return new ArrayList<VideoInfo>(Arrays.asList(
                new VideoInfo("test1"),
                new VideoInfo("test2")
        ));
    }

    @Override
    public VideoInfo getVideoInfo(String id) {
        // Pobierz metadane pliku wideo.

        return new VideoInfo(id);
    }

    @Override
    public Video downloadVideo(String id) {
        // Pobierz plik wideo z YouTube.

        return new Video(id);
    }
}
