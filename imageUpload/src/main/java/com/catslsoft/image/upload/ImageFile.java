package com.catslsoft.image.upload;

public class ImageFile {
    public static final String IMAGE_DIR = "C:\\Temp\\";

    private String id;
    private String contentType;
    private String fileName;
    private int contentLength;

    public ImageFile(String id, String contentType, String fileName, int contentLength) {
        this.id = id;
        this.contentType = contentType;
        this.fileName = fileName;
        this.contentLength = contentLength;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getContentLength() {
        return contentLength;
    }

    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
    }
}
