package Lab4.Zad4_A;

import java.io.*;

public class FileDataSource implements DataSource {
    private String filename;

    private File file;

    FileDataSource(String filename) {
        this.filename = filename;

        file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            //Nic nie rob, jesli plik istnieje
        }
    }

    @Override
    public void writeData(String data) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(this.filename);
        } catch (IOException exception) {
            exception.printStackTrace();

            return;
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.printf(data);
        printWriter.close();
    }

    @Override
    public String readData() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();

            return "";
        }

        String currentLine = "";
        try {
            currentLine = reader.readLine();

            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();

            return "";
        }

        return currentLine;
    }

    @Override
    public String debugReadData() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();

            return "";
        }

        String currentLine = "";
        try {
            currentLine = reader.readLine();

            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();

            return "";
        }

        return currentLine;
    }
}
