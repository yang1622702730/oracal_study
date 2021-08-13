package com.fanyang.java.collection.exercise;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-10 20:13
 */
public class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public News() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "title = " + title ;
    }
}
