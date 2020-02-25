package com.xiao.service;

import com.xiao.dao.IUserDao;
import com.xiao.domain.File;
import com.xiao.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService implements IUserService {
    private IUserDao dao;


    @Override
    public void uploadFile(File file) {

    }

    @Override
    public void downloadFile(File file) {

    }

    @Override
    public List<File> showAllFile() {
        return null;
    }

    @Override
    public User isLogin(User user) {
        return null;
    }
}
