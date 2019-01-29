package com.daylight.website.js;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    private Map<String, String> body;
    private Map<String, String> headers;
    private String method;
    private Map<String, String> params;
    private Map<String, String> query;
}