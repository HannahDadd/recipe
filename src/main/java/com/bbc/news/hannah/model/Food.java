package com.bbc.news.hannah.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class Food {
    private @NonNull Integer id;
    private int quantity;
    private String name;
    private String quantityUnit;
    private boolean isLiquid;
}
