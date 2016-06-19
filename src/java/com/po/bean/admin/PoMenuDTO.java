/*
 * Copyright : luckybear
 * Create software make life better than  * 
 */
package com.po.bean.admin;

/**
 *
 * @author Lucky Bear
 */
public class PoMenuDTO {
    
    private long menu_id;
    private String menu_name;
    private String menu_icon;
    private long parent_id;
    private long page_id;
    private int menu_order;
    private String descriptions;
    private String language;
    private int app_id;
    private int visible;
    private String page_name;
    private String page_uri;
    private String page_bean;

    public long getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(long menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_icon() {
        return menu_icon;
    }

    public void setMenu_icon(String menu_icon) {
        this.menu_icon = menu_icon;
    }

    public long getParent_id() {
        return parent_id;
    }

    public void setParent_id(long parent_id) {
        this.parent_id = parent_id;
    }

    public long getPage_id() {
        return page_id;
    }

    public void setPage_id(long page_id) {
        this.page_id = page_id;
    }

    public int getMenu_order() {
        return menu_order;
    }

    public void setMenu_order(int menu_order) {
        this.menu_order = menu_order;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public String getPage_uri() {
        return page_uri;
    }

    public void setPage_uri(String page_uri) {
        this.page_uri = page_uri;
    }

    public String getPage_bean() {
        return page_bean;
    }

    public void setPage_bean(String page_bean) {
        this.page_bean = page_bean;
    }
}
