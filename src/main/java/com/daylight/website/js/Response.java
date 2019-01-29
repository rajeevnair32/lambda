package com.daylight.website.js;

import com.amazonaws.services.lambda.runtime.Context;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {

    private Request request;
    private Context context;
}