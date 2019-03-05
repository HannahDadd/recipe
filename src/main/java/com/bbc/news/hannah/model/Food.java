package com.bbc.news.hannah.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Builder
public class Food {

    private @NonNull @Getter Integer id;
    private @Getter @Setter int quantity;
    private @Getter @Setter String name;
    private @Setter @Getter String quantityUnit;
    private @Getter @Setter boolean isLiquid;
}
