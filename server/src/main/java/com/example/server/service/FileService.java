package com.example.server.service;

import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


public class FileService {

    private final File workingDirectory;
    private final File file;

    public FileService(String extension)  {
        Date date = new Date();
        long time = date.getTime();

        this.workingDirectory = new File("./" + time);
        if(!workingDirectory.exists()){
            workingDirectory.mkdirs();
        }

        this.file = new File(workingDirectory, "main." + extension);
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

    public void deleteFile() throws IOException {
        FileUtils.deleteDirectory(workingDirectory);
    }
}
