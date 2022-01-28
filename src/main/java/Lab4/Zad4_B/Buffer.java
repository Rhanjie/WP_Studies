package Lab4.Zad4_B;

import Lab4.Zad4_B.External.CompressionCodec;
import Lab4.Zad4_B.External.MPEG4CompressionCodec;

public class Buffer {
    public String filename;
    public byte[] bytes;
    public CompressionCodec codec;

    public Buffer(String filename, byte[] bytes, CompressionCodec codec) {
        this.filename = filename;
        this.bytes = bytes;
        this.codec = codec;
    }
}
