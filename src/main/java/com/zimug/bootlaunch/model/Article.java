package com.zimug.bootlaunch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Jay on 20/12/13 - 10:03
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Article {


    private Long id;
    private String author;
    private String title;
    private Date createTime;
    private String content;
}
