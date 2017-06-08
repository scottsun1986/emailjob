package com.fun4g.emailjob.iDao;

import com.fun4g.emailjob.model.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}