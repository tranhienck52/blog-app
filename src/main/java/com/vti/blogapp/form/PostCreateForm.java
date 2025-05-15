package com.vti.blogapp.form;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostCreateForm {
    private String title;

    private String description;

    private String content;
}
