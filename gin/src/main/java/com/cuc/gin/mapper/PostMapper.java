package com.cuc.gin.mapper;

import com.cuc.gin.model.PostEntity;

import java.util.List;

/**
 * @author : Chen X.T.
 * @since : 2020/2/26, 周三
 **/
public interface PostMapper {
    PostEntity getOne(Long id);
    List<PostEntity> getAll();
    void insertOne(PostEntity postEntity);
    void deleteOne(Long id);
}
