package com.example.server.service;

import java.io.IOException;

public class JSCompiler extends BasicCompiler{
    @Override
    public String compile(String directory) throws IOException, InterruptedException {
        return basicCompile(directory, "npm init -y && node main");
    }
}
