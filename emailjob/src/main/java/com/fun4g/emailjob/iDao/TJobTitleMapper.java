package com.fun4g.emailjob.iDao;

import com.fun4g.emailjob.model.TJobTitle;

public interface TJobTitleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TJobTitle record);

    int insertSelective(TJobTitle record);

    TJobTitle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TJobTitle record);

    int updateByPrimaryKey(TJobTitle record);
}