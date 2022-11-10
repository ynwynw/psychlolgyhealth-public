package com.cuc.gin.mapper;

import com.cuc.gin.model.BoardEntity;
import com.cuc.gin.model.ChatMsgEntity;

import java.util.List;

/**
 * @author : Chen X.T.
 * @since : 2020/2/26, 周三
 **/
public interface BoardMapper {

    List<BoardEntity> getAll();

    void updateOne(BoardEntity boardEntity);

    void insert(BoardEntity boardEntity);
}
