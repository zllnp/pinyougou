package com.pinyougou.mapper;

import com.pinyougou.pojo.TbPayLog;
import com.pinyougou.pojo.TbPayLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPayLogMapper {
    int countByExample(TbPayLogQuery example);

    int deleteByExample(TbPayLogQuery example);

    int deleteByPrimaryKey(String outTradeNo);

    int insert(TbPayLog record);

    int insertSelective(TbPayLog record);

    List<TbPayLog> selectByExample(TbPayLogQuery example);

    TbPayLog selectByPrimaryKey(String outTradeNo);

    int updateByExampleSelective(@Param("record") TbPayLog record, @Param("example") TbPayLogQuery example);

    int updateByExample(@Param("record") TbPayLog record, @Param("example") TbPayLogQuery example);

    int updateByPrimaryKeySelective(TbPayLog record);

    int updateByPrimaryKey(TbPayLog record);
}