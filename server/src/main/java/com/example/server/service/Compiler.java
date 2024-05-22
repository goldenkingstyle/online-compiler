package com.example.server.service;

import com.example.server.dto.CompileRequest;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.io.IOException;

public interface Compiler {
    public String compile(String directory) throws IOException, InterruptedException;
}
