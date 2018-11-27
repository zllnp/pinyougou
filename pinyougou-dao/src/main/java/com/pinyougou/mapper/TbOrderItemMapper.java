package com.pinyougou.mapper;

import com.pinyougou.pojo.TbOrderItem;
import com.pinyougou.pojo.TbOrderItemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderItemMapper {
    int countByExample(TbOrderItemQuery example);

    int deleteByExample(TbOrderItemQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    List<TbOrderItem> selectByExample(TbOrderItemQuery example);

    TbOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemQuery example);

    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemQuery example);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);
}