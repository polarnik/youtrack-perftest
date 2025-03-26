package com.jetbrains.youtrack.perftest.scenario.sitespeed.util;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class YouTrackUtil {
    public YouTrackConfig getConfig(String baseUrl) throws IOException, InterruptedException {
        YouTrackConfig config = new YouTrackConfig();
        String url = baseUrl + "/api/config?fields=build,defaultPage,readOnly,version";
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            config = gson.fromJson(response.body(), YouTrackConfig.class);
        }
        return config;
    }
}
