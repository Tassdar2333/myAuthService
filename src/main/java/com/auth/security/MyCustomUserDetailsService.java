package com.auth.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 自定义组装用户信息服务
 * @version 1.0
 * @Auther wangchengyang
 * @Date 2022/9/22 11:25
 */
@Component
public class MyCustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //这里相当于是组装用户名密码以及权限列表的地方 可以从数据库查 也可以写死，最后这个UserDetails会被放入SecurityContext上下文中，供其他地方使用
        MyUserDetails userDetails = new MyUserDetails();
        userDetails.setPassword(username);
        userDetails.setPassword("123456");
        return userDetails;
    }
}
