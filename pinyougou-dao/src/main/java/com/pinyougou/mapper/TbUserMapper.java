package com.pinyougou.mapper;

import com.pinyougou.pojo.TbUser;
import com.pinyougou.pojo.TbUserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
    int countByExample(TbUserQuery example);

    int deleteByExample(TbUserQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserQuery example);

    TbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserQuery example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserQuery example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}