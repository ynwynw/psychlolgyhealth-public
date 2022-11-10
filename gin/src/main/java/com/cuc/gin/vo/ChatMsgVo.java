package com.cuc.gin.vo;

import com.cuc.gin.model.ChatMsgEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Chen X.T.
 * @since : 2020/2/3, 周一
 **/
public class ChatMsgVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String aId;
    private String aUsername;
    private String aAvatar;
    private String bId;
    private String bUsername;
    private String bAvatar;
    private List<ChatMsgEntity> messages;

    public ChatMsgVo() {
    }

    public ChatMsgVo(String aId, String aUsername, String aAvatar, String bId, String bUsername, String bAvatar, List<ChatMsgEntity> messages) {
        this.aId = aId;
        this.aUsername = aUsername;
        this.aAvatar = aAvatar;
        this.bId = bId;
        this.bUsername = bUsername;
        this.bAvatar = bAvatar;
        this.messages = messages;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaUsername() {
        return aUsername;
    }

    public void setaUsername(String aUsername) {
        this.aUsername = aUsername;
    }

    public String getaAvatar() {
        return aAvatar;
    }

    public void setaAvatar(String aAvatar) {
        this.aAvatar = aAvatar;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbUsername() {
        return bUsername;
    }

    public void setbUsername(String bUsername) {
        this.bUsername = bUsername;
    }

    public String getbAvatar() {
        return bAvatar;
    }

    public void setbAvatar(String bAvatar) {
        this.bAvatar = bAvatar;
    }

    public List<ChatMsgEntity> getMessages() {
        return messages;
    }

    public void setMessages(List<ChatMsgEntity> messages) {
        this.messages = messages;
    }
}
