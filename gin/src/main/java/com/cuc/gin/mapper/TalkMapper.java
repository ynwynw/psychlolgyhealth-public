package com.cuc.gin.mapper;

import com.cuc.gin.model.TalkEntity;

import java.util.List;

/**
 * @author : Chen X.T.
 * @since : 2020/3/9, 周一
 **/
public interface TalkMapper {
    void add(TalkEntity talkEntity);
    void remove(Long id);
    List<TalkEntity> getAll();
    void update(TalkEntity talkEntity);
}
