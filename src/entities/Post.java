package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date comment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList();

    public Post() {
    }

    public Post(Date comment, String title, String content, Integer likes) {
        this.comment = comment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getComment() {
        return this.comment;
    }

    public void setComment(Date comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        return "{" +
            " comment='" + getComment() + "'" +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", likes='" + getLikes() + "'" +
            ", comments='" + getComments() + "'" +
            "}";
    }

}