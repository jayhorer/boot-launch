package com.zimug.bootlaunch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by Jay on 20/12/13 - 10:03
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    private Long id;
    private  String author;
    private String title;
    private String content;
    private String createTime;
    private List<Reader> readers;



}
