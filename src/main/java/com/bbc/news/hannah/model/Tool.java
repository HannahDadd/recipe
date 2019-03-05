package com.bbc.news.hannah.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class Tool {
    private @NonNull Integer id;
    private String name;
}
