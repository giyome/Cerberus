package com.redcats.tst.entity;

/**
 * {Insert class description here}
 *
 * @author Tiago Bernardes
 * @version 1.0, 10/01/2013
 * @since 2.0.0
 */
public class Environment {

    private String env;
    private String ip;
    private String url;
    private String urlLogin;
    private String build;
    private String revision;
    private boolean active;
    private String typeApplication;
    private String seleniumIp;
    private String seleniumPort;
    private String seleniumBrowser;
    private String path;
    private boolean maintenance;
    private String maintenanceStr;
    private String maintenanceEnd;

    public String getIp() {
        return this.ip;
    }

    public void setIp(String tempIp) {
        this.ip = tempIp;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String tempUrl) {
        this.url = tempUrl;
    }

    public String getUrlLogin() {
        return this.urlLogin;
    }

    public void setUrlLogin(String tempUrlLogin) {
        this.urlLogin = tempUrlLogin;
    }

    public String getBuild() {
        return this.build;
    }

    public void setBuild(String tempBuild) {
        this.build = tempBuild;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String tempRevision) {
        this.revision = tempRevision;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean tempActive) {
        this.active = tempActive;
    }

    public String getTypeApplication() {
        return this.typeApplication;
    }

    public void setTypeApplication(String tempTypeApplication) {
        this.typeApplication = tempTypeApplication;
    }

    public String getSeleniumIp() {
        return this.seleniumIp;
    }

    public void setSeleniumIp(String seleniumIp) {
        this.seleniumIp = seleniumIp;
    }

    public String getSeleniumPort() {
        return this.seleniumPort;
    }

    public void setSeleniumPort(String seleniumPort) {
        this.seleniumPort = seleniumPort;
    }

    public String getSeleniumBrowser() {
        return this.seleniumBrowser;
    }

    public void setSeleniumBrowser(String seleniumBrowser) {
        this.seleniumBrowser = seleniumBrowser;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String tempPath) {
        this.path = tempPath;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    }

    public String getMaintenanceStr() {
        return maintenanceStr;
    }

    public void setMaintenanceStr(String maintenanceStr) {
        this.maintenanceStr = maintenanceStr;
    }

    public String getMaintenanceEnd() {
        return maintenanceEnd;
    }

    public void setMaintenanceEnd(String maintenanceEnd) {
        this.maintenanceEnd = maintenanceEnd;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
    
}