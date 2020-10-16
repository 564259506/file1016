package cn.wxc.service.impl;

import cn.wxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: UserServiceImpl
 * Date: 2020/8/14 13:41 周五
 * yy:猥琐别浪，等我发育。
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserById(String id) {
        return "这里是8001的提供者，id:"+id;
    }
}
