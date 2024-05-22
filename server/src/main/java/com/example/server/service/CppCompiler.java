package com.example.server.service;

import java.io.File;
import java.io.IOException;

public class CppCompiler extends BasicCompiler {

    @Override
    public String compile(String directory) throws IOException, InterruptedException {
        return basicCompile(directory, "g++ main.cpp && a.exe");
    }

}
