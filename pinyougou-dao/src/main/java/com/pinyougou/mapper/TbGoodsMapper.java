package com.pinyougou.mapper;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsMapper {
    int countByExample(TbGoodsQuery example);

    int deleteByExample(TbGoodsQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    List<TbGoods> selectByExample(TbGoodsQuery example);

    TbGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbGoods record, @Param("example") TbGoodsQuery example);

    int updateByExample(@Param("record") TbGoods record, @Param("example") TbGoodsQuery example);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);
}