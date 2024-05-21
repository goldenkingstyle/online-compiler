package com.example.server.service;

import com.example.server.dto.CompileRequest;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface Compiler {
    ResponseEntity<?> compile(CompileRequest compileRequest) throws IOException;
}
