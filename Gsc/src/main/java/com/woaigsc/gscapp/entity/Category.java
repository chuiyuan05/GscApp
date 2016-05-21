package com.woaigsc.gscapp.entity;

import java.util.List;

/**
 * Created by chuiyuan on 16-5-21.
 * This is for CategoryFragment.
 */
public class Category {
    private int id;
    private String ref ;
    private List<String> details;

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
