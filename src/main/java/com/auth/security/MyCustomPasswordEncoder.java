package com.auth.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 自定义密码加密类
 * @version 1.0
 * @Auther wangchengyang
 * @Date 2022/9/22 11:32
 */
@Component
public class MyCustomPasswordEncoder implements PasswordEncoder {

    /**
     * 这里用于根据自定义加密方法返回字符串
     * @param rawPassword
     * @return
     */
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    /**
     * 这个方法到时候会用于将上下文中密码与用户输入密码作比较来判断是否认证成功
     * @param rawPassword
     * @param encodedPassword
     * @return
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }
}
