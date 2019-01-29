package com.daylight.website.js;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class Startup implements RequestHandler<Request, Response> {

    public Response handleRequest(Request request, Context context) {

        return new Response(request, context);
    }
}