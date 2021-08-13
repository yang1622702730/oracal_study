package com.fanyang.java.collection.exercise;

import java.util.Objects;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-11 08:49
 */
public class Journalism {
    private String title;
    private String author;
    private String content;
    private String pushDate;

    public Journalism(String title) {
        this.title = title;
    }

    public Journalism(String title, String author, String content, String pushDate) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.pushDate = pushDate;
    }

    public Journalism() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPushDate() {
        return pushDate;
    }

    public void setPushDate(String pushDate) {
        this.pushDate = pushDate;
    }

    @Override
    public String toString() {
        return "title='" + title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Journalism)) return false;
        Journalism that = (Journalism) o;
        return Objects.equals(getTitle(), that.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }
}
