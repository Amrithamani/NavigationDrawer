package com.vatsaltechnosoft.mani.amritha.navigationdrawer;

/**
 * Created by Amritha on 7/12/18.
 */
public class MenuModel {
    public String menuName, url;
    public boolean hasChildren, isGroup;

    public MenuModel(String menuName, boolean isGroup, boolean hasChildren, String url) {

        this.menuName = menuName;
        this.url = url;
        this.isGroup = isGroup;
        this.hasChildren = hasChildren;
    }
}
