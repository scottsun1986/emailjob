package com.fun4g.emailjob.iDao;

import com.fun4g.emailjob.model.TJobRela;

public interface TJobRelaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TJobRela record);

    int insertSelective(TJobRela record);

    TJobRela selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TJobRela record);

    int updateByPrimaryKey(TJobRela record);
}