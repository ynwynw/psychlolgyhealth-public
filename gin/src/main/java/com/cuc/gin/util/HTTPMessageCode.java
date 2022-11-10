package com.cuc.gin.util;

/**
 * @author : Chen X.T.
 * @since : 2020/1/26, 周日
 **/
public class HTTPMessageCode {
    public static class Login {
        public static final int OK = 1;
        public static final int FAILURE = 0;
    }
    public static class Register {
        public static final int EXISTS = 0;
        public static final int OK = 1;
    }

    public static class Common {
        public static final int OK = 1;
        public static final int FAILURE = 0;
        public static final int NOT_NULL = -1;
    }

}
