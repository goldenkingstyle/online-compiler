package com.example.server.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public abstract class BasicCompiler implements Compiler {

    public String basicCompile(String directory, String command) throws IOException, InterruptedException {

        char disk = directory.charAt(0);

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("cmd.exe", "/c", String.format("%c: && cd %s && %s", disk, directory, command));

        Process process = processBuilder.start();

        StringBuilder output = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while((line = bufferedReader.readLine()) != null){
            output.append(line).append('\n');
        }

        process.waitFor();

        return output.toString();

    }
}
