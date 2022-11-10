package com.cuc.gin.util;

/**
 * @author : Chen X.T.
 * @since : 2020/1/26, 周日
 **/
public class HTTPMessageText {
    public static class Login {
        public static final String OK = "登录成功";
        public static final String FAILURE = "用户名或密码错误";
    }
    public static class Register {
        public static final String EXISTS = "用户名已存在";
        public static final String OK = "注册成功";
    }

    public static class Common {
        public static final String OK = "成功";
        public static final String FAILURE = "失败";
        public static final String NOT_NULL = "输入不能为空";
    }

}
