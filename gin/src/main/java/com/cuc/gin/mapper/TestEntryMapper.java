package com.cuc.gin.mapper;

import com.cuc.gin.model.TestEntryEntity;

import java.util.List;

/**
 * @author : Chen X.T.
 * @since : 2020/2/27, 周四
 **/
public interface TestEntryMapper {
    List<TestEntryEntity> getAll();
    void removeAll();
    void add(TestEntryEntity entity);

}
