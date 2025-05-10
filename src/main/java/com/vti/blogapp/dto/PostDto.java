package com.vti.blogapp.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostDto {
    private long id;

    private String title;

    private String description;

    private String content;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
