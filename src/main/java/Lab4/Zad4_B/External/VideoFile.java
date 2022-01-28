package Lab4.Zad4_B.External;

import java.io.File;
import java.net.URI;

public class VideoFile extends File {
    public VideoFile(String pathname) {
        super(pathname);
    }

    public VideoFile(String parent, String child) {
        super(parent, child);
    }

    public VideoFile(File parent, String child) {
        super(parent, child);
    }

    public VideoFile(URI uri) {
        super(uri);
    }
}
