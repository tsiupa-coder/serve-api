package com.serve.api.error;

import lombok.Getter;

@Getter
public class ErrorInfo {
    private final String url;
    private final String info;

    ErrorInfo(String url, String info) {
        this.url = url;
        this.info = info;
    }
}