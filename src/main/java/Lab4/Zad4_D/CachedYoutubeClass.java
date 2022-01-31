package Lab4.Zad4_D;

import java.util.ArrayList;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib service;
    private ArrayList<VideoInfo> listCache;
    private Video videoCache;

    private boolean needReset;

    CachedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;

        listCache = new ArrayList<>();
    }

    @Override
    public ArrayList<VideoInfo> listVideos() {
        if (listCache.isEmpty() || needReset) {
            listCache = service.listVideos();
        }

        return listCache;
    }

    @Override
    public VideoInfo getVideoInfo(String id) {
        if (!needReset && !listCache.isEmpty()) {
            for (var cachedVideoInfo : listCache) {
                if (cachedVideoInfo.id.equals(id)) {
                    System.out.println("Informacje o pliku byly w pamieci cache!");

                    return cachedVideoInfo;
                }
            }
        }

        if (videoCache == null || !videoCache.info.id.equals(id) || needReset) {
            System.out.println("Pobrano informacje o filmie!");

            return service.getVideoInfo(id);
        }

        else System.out.println("Informacje o pliku byly w pamieci cache!");

        return videoCache.info;
    }

    @Override
    public Video downloadVideo(String id) {
        if (videoCache == null || !videoCache.info.id.equals(id) || needReset) {
            videoCache = service.downloadVideo(id);

            System.out.println("Pobrano film!");
        }

        else System.out.println("Pobrany film byl w pamieci cache!");

        return videoCache;
    }
}
