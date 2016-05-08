package com.woaigsc.gscapp.entity;

/**
 * Created by chuiyuan on 16-4-25.
 */
public class Poem {
    private int id ; //MySQL int
    /**
     * 朝代
     */
    private String dynasty ; //tinytext,max=255
    /**
     * 诗的类别
     */
    private String category ;//tinytext
    private String title ;//text,max= 65535
    private String author ;//tinytext
    private String content ;//text
    /**
     * 查看content时的链接
     */
    private String href ;//text
    /**
     * 现代文翻译
     * not considered now
     */
    private String translation ;//text

    public Poem(){

    }
    public Poem(int id ,String dynasty, String category, String title,
                String author, String content, String href, String translation ){
        this.id = id;
        this.dynasty = dynasty ;
        this.category = category ;
        this.title = title ;
        this.author = author ;
        this.content = content ;
        this.href = href ;
        this.translation = translation ;
    }

    public int getId(){
        return id ;
    }

    public void setId(){
        this.id = id;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String toString (){
        return getDynasty()+":"+getCategory()+"\n"+
                getHref()+"\n"+
                getAuthor()+"\n"+getTitle()+"\n"+getContent()+"\n"+
                getTranslation();
    }
}
