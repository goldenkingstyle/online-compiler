package com.example.server.controller;

import com.example.server.dto.CompileRequest;
import com.example.server.service.CompilerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/api/compiler")
@RequiredArgsConstructor
public class CompilerController {

    final CompilerService compilerService;

    @PostMapping("/compile")
    public ResponseEntity<?> compile(@RequestBody CompileRequest compileRequest) throws IOException {
        System.out.println(compileRequest.getType());
        return compilerService.compile(compileRequest);
    }

}
