package com.bbc.news.hannah.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Builder
public class Tool {
    private @NonNull @Getter Integer id;
    private @Getter @Setter String name;
}
