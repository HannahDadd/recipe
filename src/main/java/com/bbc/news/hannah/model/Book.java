package com.bbc.news.hannah.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class Book {
    private @NonNull Integer id;
    private String authorName;
    private String title;
    @Singular private List<Recipe> recipes;
}
