package com.fun4g.emailjob.iDao;

import com.fun4g.emailjob.model.TProject;

public interface TProjectMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(TProject record);

    int insertSelective(TProject record);

    TProject selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(TProject record);

    int updateByPrimaryKey(TProject record);
}