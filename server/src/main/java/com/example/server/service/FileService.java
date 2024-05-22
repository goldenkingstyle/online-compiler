package com.example.server.service;

import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class FileService {

    private final File file;

    public FileService(String extension) {
        this.file = new File("./", String.format("main.%s", extension));
    }

    public String createFile(ArrayList<String> content) throws IOException {

        if (file.createNewFile()) {
            try (FileWriter fileWriter = new FileWriter(file)) {

                for (String line : content) {
                    fileWriter.write(line);
                    fileWriter.write("\n");
                }

            }
        }

        return file.getParentFile().getAbsolutePath();
    }

    public void deleteFile() {
        file.delete();
    }
}
