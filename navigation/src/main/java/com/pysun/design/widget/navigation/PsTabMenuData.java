package com.pysun.design.widget.navigation;

import android.graphics.drawable.Drawable;

/**
 * Created by ljh on 2018/1/14.
 */

public class PsTabMenuData {

    private int tagId;
    private Drawable icon;
    private String label;
    private int notifyCount;
    private boolean isChecked = false;

    public PsTabMenuData(Drawable icon, String label) {
        this.icon = icon;
        this.label = label;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNotifyCount() {
        return notifyCount;
    }

    public void setNotifyCount(int notifyCount) {
        this.notifyCount = notifyCount;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }
}
