package Lab4.Zad4_B;

import Lab4.Zad4_B.External.*;

import java.io.File;
import java.io.IOException;

public class VideoConverter {
    private File file;

    private CompressionCodec sourceCodec;
    private CompressionCodec destinationCodec;

    public File convert(String filename, String format) throws IOException {
        file = new VideoFile(filename);

        sourceCodec = CodecFactory.extract(file);
        destinationCodec = (format.equals("mp4"))
                ? new MPEG4CompressionCodec()
                : new OggCompressionCodec();

        Buffer buffer = BitrateReader.read(file, sourceCodec);
        File result = BitrateReader.convert(buffer, destinationCodec);

        result = (new AudioMixer()).fix(result);
        return result;
    }
}
