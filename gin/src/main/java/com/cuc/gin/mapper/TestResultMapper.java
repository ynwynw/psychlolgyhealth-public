package com.cuc.gin.mapper;

import com.cuc.gin.model.TestResultEntity;

import java.util.List;

/**
 * @author : Chen X.T.
 * @since : 2020/2/28, 周五
 **/
public interface TestResultMapper {
    List<TestResultEntity> getAll();
    void add(TestResultEntity entity);
}
