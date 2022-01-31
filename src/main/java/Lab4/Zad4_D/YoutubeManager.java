package Lab4.Zad4_D;

import java.util.ArrayList;

public class YoutubeManager {
    protected ThirdPartyYoutubeLib service;

    private VideoInfo info;
    private ArrayList<VideoInfo> list;

    YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        info = service.getVideoInfo(id);

        //Renderuj strone z filmem.
    }

    public void renderListPanel() {
        list = service.listVideos();

        //Renderuj liste miniaturek plikow wideo
    }

    public void reactOnUserInput() {
        //Pobierz id elementu filmu
        String clickedId = "test1";

        renderVideoPage(clickedId);
        renderListPanel();
    }
}
