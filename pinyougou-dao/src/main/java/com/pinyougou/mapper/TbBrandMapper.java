package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBrandMapper {
    int countByExample(TbBrandQuery example);

    int deleteByExample(TbBrandQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    List<TbBrand> selectByExample(TbBrandQuery example);

    TbBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandQuery example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandQuery example);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);
}