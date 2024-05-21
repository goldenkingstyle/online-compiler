package com.example.server.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileService {

    public static String createFile(String extension, ArrayList<String> content) throws IOException {
        File file = new File("./", String.format("main.%s", extension));

        if (file.createNewFile()) {
            try (FileWriter fileWriter = new FileWriter(file)) {

                for (String line : content) {
                    fileWriter.write(line);
                    fileWriter.write("\n");
                }

            }
        }
        return file.getAbsolutePath();
    }
}
