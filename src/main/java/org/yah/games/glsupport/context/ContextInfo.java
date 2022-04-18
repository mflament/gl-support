package org.yah.games.glsupport.context;

public final class ContextInfo {
    public final String contextApi;
    public final String renderer;
    public final String vendor;
    public final String version;
    public final int openglMajorVersion;
    public final int openglMinorVersion;

    public ContextInfo(String contextApi, String renderer, String vendor, String version, int openglMajorVersion, int openglMinorVersion) {
        this.contextApi = contextApi;
        this.renderer = renderer;
        this.vendor = vendor;
        this.version = version;
        this.openglMajorVersion = openglMajorVersion;
        this.openglMinorVersion = openglMinorVersion;
    }

    @Override
    public String toString() {
        return "ContextInfo{" +
                "contextApi='" + contextApi + '\'' +
                ", renderer='" + renderer + '\'' +
                ", vendor='" + vendor + '\'' +
                ", version='" + version + '\'' +
                ", openglMajorVersion=" + openglMajorVersion +
                ", openglMinorVersion=" + openglMinorVersion +
                '}';
    }
}
