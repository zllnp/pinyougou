package com.pinyougou.mapper;

import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbGoodsDescQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsDescMapper {
    int countByExample(TbGoodsDescQuery example);

    int deleteByExample(TbGoodsDescQuery example);

    int deleteByPrimaryKey(Long goodsId);

    int insert(TbGoodsDesc record);

    int insertSelective(TbGoodsDesc record);

    List<TbGoodsDesc> selectByExample(TbGoodsDescQuery example);

    TbGoodsDesc selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") TbGoodsDesc record, @Param("example") TbGoodsDescQuery example);

    int updateByExample(@Param("record") TbGoodsDesc record, @Param("example") TbGoodsDescQuery example);

    int updateByPrimaryKeySelective(TbGoodsDesc record);

    int updateByPrimaryKey(TbGoodsDesc record);
}