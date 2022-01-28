package Lab4.Zad4_B.External;

import Lab4.Zad4_B.Buffer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class BitrateReader {

    public static Buffer read(File file, CompressionCodec sourceCodec) throws IOException {
        return new Buffer(file.getName(), Files.readAllBytes(file.toPath()), sourceCodec);
    }

    public static File convert(Buffer buffer, CompressionCodec destinationCodec) {
        String format;

        //Konwertuj
        if (buffer.codec instanceof MPEG4CompressionCodec) {
            //Zmodyfikuj buffer.bytes

            format = "ogg";
        }

        else {
            //Zmodyfikuj buffer.bytes inaczej

            format = "mkv";
        }

        String filename = buffer.filename.replaceFirst("[.][^.]+$", "") + "." + format;
        File convertedFile = new File("res\\output\\" + filename);

        /*try (FileOutputStream outputStream = new FileOutputStream(convertedFile)) {
            outputStream.write(buffer.bytes);
        } catch (IOException exception) {
            exception.printStackTrace();
        }*/

        return convertedFile;
    }
}
