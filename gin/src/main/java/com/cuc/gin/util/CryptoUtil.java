package com.cuc.gin.util;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

/**
 * @author : Chen X.T.
 * @since : 2020/1/26, 周日
 **/
public class CryptoUtil {
    public static String getHashedPassword(String clear) {
        String sha256hex = null;
        String t = clear;
        for (int i=0;i<9;i++) {
            sha256hex = Hashing.sha256()
                    .hashString(t, StandardCharsets.UTF_8)
                    .toString();
            t = sha256hex;
        }
        return sha256hex;
    }
}
