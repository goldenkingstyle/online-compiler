package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Data
public class CompileRequest {
    private String type;
    private ArrayList<String> content;
}
