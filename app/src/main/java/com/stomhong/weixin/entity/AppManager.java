package com.stomhong.weixin.entity;

/**
 * @author StomHong on 2016/10/14.
 */

public class AppManager {
    private String name;
    private String brief;
    private boolean isOpen;
    private boolean isTitle;

    public boolean isTitle() {

        return isTitle;
    }

    public void setTitle(boolean title) {
        isTitle = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
