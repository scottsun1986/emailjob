package com.fun4g.emailjob.iDao;

import com.fun4g.emailjob.model.TJob;

public interface TJobMapper {
    int deleteByPrimaryKey(Integer jobId);

    int insert(TJob record);

    int insertSelective(TJob record);

    TJob selectByPrimaryKey(Integer jobId);

    int updateByPrimaryKeySelective(TJob record);

    int updateByPrimaryKey(TJob record);
}