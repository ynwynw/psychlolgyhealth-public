package com.cuc.gin.vo;

import java.io.Serializable;

/**
 * @author : Chen X.T.
 * @since : 2020/3/2, 周一
 **/
public class UserInfoVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long userId;
    private String username;
    private String jws;
    private Integer status;

    public UserInfoVo() {
    }

    public UserInfoVo(Long userId, String username, String jws, Integer status) {
        this.userId = userId;
        this.username = username;
        this.jws = jws;
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJws() {
        return jws;
    }

    public void setJws(String jws) {
        this.jws = jws;
    }
}
