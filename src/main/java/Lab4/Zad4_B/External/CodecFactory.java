package Lab4.Zad4_B.External;

import Lab4.Zad4_B.External.CompressionCodec;
import Lab4.Zad4_B.External.MPEG4CompressionCodec;
import Lab4.Zad4_B.External.OggCompressionCodec;

import java.io.File;

public class CodecFactory {
    public CodecFactory(){}

    public static CompressionCodec extract(File file) {
        String extension = "";
        String filename = file.getName();

        int i = filename.lastIndexOf('.');
        if (i > 0) {
            extension = filename.substring(i+1);
        }

        return (extension.equals("mp4"))
                ? new MPEG4CompressionCodec()
                : new OggCompressionCodec();
    }
}