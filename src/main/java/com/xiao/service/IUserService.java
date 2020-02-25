package com.xiao.service;

import com.xiao.domain.File;
import com.xiao.domain.User;

import java.util.List;

public interface IUserService {



    /**
     * 文件上传
     */
    void uploadFile(File file);

    /**
     * 文件下载
     */
    void downloadFile(File file);

    /**
     * 查询到该user所有的上传的文件
     * @return com.xiao.domain.File
     */
    List<File> showAllFile();

    /**
     * 用户登入，通过account和password查询，并返回完整信息的User
     * @param user
     * @return
     */
    User isLogin(User user);





}
