package com.example.server.service;

import com.example.server.dto.CompileRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CompilerService implements Compiler {

    @Override
    public ResponseEntity<?> compile(CompileRequest compileRequest) throws IOException {

        String path = FileService.createFile(compileRequest.getType(), compileRequest.getContent());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
