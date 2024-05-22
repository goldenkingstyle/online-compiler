package com.example.server.service;

public class CompilerFactory {
    public static Compiler create(String type) {
        Compiler compiler = null;

        switch (type) {
            case "cpp":
                compiler = new CppCompiler();
                break;
            case "js":
                compiler = new JSCompiler();
                break;
        }

        return compiler;
    }
}
