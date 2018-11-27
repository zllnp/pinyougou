package com.pinyougou.mapper;

import com.pinyougou.pojo.TbAddress;
import com.pinyougou.pojo.TbAddressQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAddressMapper {
    int countByExample(TbAddressQuery example);

    int deleteByExample(TbAddressQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbAddress record);

    int insertSelective(TbAddress record);

    List<TbAddress> selectByExample(TbAddressQuery example);

    TbAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbAddress record, @Param("example") TbAddressQuery example);

    int updateByExample(@Param("record") TbAddress record, @Param("example") TbAddressQuery example);

    int updateByPrimaryKeySelective(TbAddress record);

    int updateByPrimaryKey(TbAddress record);
}