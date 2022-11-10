package com.cuc.gin.mapper;

import com.cuc.gin.model.ChatMsgEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @author : Chen X.T.
 * @since : 2020/2/2, 周日
 **/
public interface ChatMsgMapper {
    void insert(ChatMsgEntity msg);

    List<ChatMsgEntity> queryAll();

    List<ChatMsgEntity> queryByFromTo(@Param("fromId")Long fromId, @Param("toId")Long toId);

}
