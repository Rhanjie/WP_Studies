package Lab4.Zad4_D;

import Lab4.Zad4_C.Color;
import Lab4.Zad4_C.Forest;
import Lab4.Zad4_C.Texture;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pelnomocnik - Marcin Dyla\n");

        ThirdPartyYoutubeClass aYoutubeService = new ThirdPartyYoutubeClass();
        CachedYoutubeClass aYoutubeProxy = new CachedYoutubeClass(aYoutubeService);

        YoutubeManager manager = new YoutubeManager(aYoutubeProxy); //wczesniej bylo aYoutubeService
        manager.reactOnUserInput();
        manager.reactOnUserInput();
        manager.reactOnUserInput();

        aYoutubeProxy.downloadVideo("test1");
        aYoutubeProxy.downloadVideo("test1");
        aYoutubeProxy.downloadVideo("test2");
    }
}
