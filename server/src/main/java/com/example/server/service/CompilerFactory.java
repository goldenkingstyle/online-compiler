package com.example.server.service;

public class CompilerFactory {
    public static Compiler create(String type) {
        Compiler compiler = null;

        switch (type) {
            case "cpp":
                compiler = new CppCompiler();
        }

        return compiler;
    }
}
