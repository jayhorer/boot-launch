package com.zimug.bootlaunch;

import com.zimug.bootlaunch.controller.ArticleRestController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.yaml.snakeyaml.events.Event;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by Jay on 20/12/27 - 11:03
 */
@Slf4j
@SpringBootTest
public class ArticleRestControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new ArticleRestController()).build();

    }

    @Test
    public void saveArticle() throws Exception {
        String article = "{\n" +
                "   \"id\": 1,\n" +
                "   \"author\": \"zimug\",\n" +
                "   \"title\": \"手摸手叫你开发springboot\",\n" +
                "   \"content\": \"c\",\n" +
                "   \"createTime\": \"2020-12-27 10:23:33\",\n" +
                "   \"reader\":[{ \"name\",:\"zimug\",\"age\":18},{\"name\",\"kobe\",\"age\":37}]\n" +
                "}";


        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.POST, "/rest/article")
                .contentType("application/json").content(article))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.author").value("zimug"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.reader[0].age").value(18))
                .andDo(print())
                .andReturn();

        log.info("article:{}",article);
        log.info(result.getResponse().getContentAsString());

    }


}
