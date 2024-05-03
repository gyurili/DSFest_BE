package com.likelion.DSFest.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Notice")
@Builder
public class Notice extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //글 id

    private String title; // 글 제목

    private String content; // 글 내용

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
