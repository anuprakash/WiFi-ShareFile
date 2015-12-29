package com.example.wifiapp.model;

import android.graphics.drawable.Drawable;

/**
 * Created by fg607 on 15-11-26.
 */
public class AppInfo {
    private Drawable appIcon;
    private String appName;
    private String appPackage;

    public AppInfo(Drawable appIcon, String appName, String appPackage) {
        this.appIcon = appIcon;
        this.appName = appName;
        this.appPackage = appPackage;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }
}
