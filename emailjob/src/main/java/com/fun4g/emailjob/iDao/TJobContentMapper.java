package com.fun4g.emailjob.iDao;

import com.fun4g.emailjob.model.TJobContent;

public interface TJobContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TJobContent record);

    int insertSelective(TJobContent record);

    TJobContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TJobContent record);

    int updateByPrimaryKey(TJobContent record);
}