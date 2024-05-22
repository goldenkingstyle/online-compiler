package com.example.server.service;

import com.example.server.dto.CompileRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CompilerService {


    public String compile(CompileRequest compileRequest) throws IOException, InterruptedException {

        FileService fileService = new FileService(compileRequest.getType());
        String directory = fileService.createFile(compileRequest.getContent());

        Compiler compiler = CompilerFactory.create(compileRequest.getType());
        String output = compiler.compile(directory);

        fileService.deleteFile();

        return output;
    }

}
