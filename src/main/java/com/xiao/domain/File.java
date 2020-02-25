package com.xiao.domain;

import java.io.Serializable;
import java.util.Date;

public class File implements Serializable {
    private Integer id;
    //uid表示文件上传者,user.id
    private Integer uid;
    //课程码，课程的编码
    private String coursecode;
    //文件名和文件路径
    private String filename;
    private String filepath;
    //上传的时间
    private Date uploadtime;
    //权限，是否公开展示文件，是为1，否为0
    private byte access;

    @Override
    public String toString() {
        return "file{" +
                "id=" + id +
                ", uid=" + uid +
                ", coursecode='" + coursecode + '\'' +
                ", filename='" + filename + '\'' +
                ", filepath='" + filepath + '\'' +
                ", uploadtime=" + uploadtime +
                ", access=" + access +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public byte getAccess() {
        return access;
    }

    public void setAccess(byte access) {
        this.access = access;
    }
}
