package com.example.miniproject_01.entity;

import com.google.gson.annotations.SerializedName;

public class Article {
    @SerializedName("ID")
    private int id;
    @SerializedName("TITLE")
    private String title;
    @SerializedName("DESCRIPTION")
    private String description;
    @SerializedName("CREATED_DATE")
    private String createdDate;
    @SerializedName("IMAGE")
    private String image;

    public Article() {
    }

    public Article(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
