package com.vti.blogapp.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentDto {
    private Long id;

    private String name;

    private String email;

    private  String Body;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
