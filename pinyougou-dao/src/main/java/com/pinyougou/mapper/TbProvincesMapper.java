package com.pinyougou.mapper;

import com.pinyougou.pojo.TbProvinces;
import com.pinyougou.pojo.TbProvincesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProvincesMapper {
    int countByExample(TbProvincesQuery example);

    int deleteByExample(TbProvincesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProvinces record);

    int insertSelective(TbProvinces record);

    List<TbProvinces> selectByExample(TbProvincesQuery example);

    TbProvinces selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbProvinces record, @Param("example") TbProvincesQuery example);

    int updateByExample(@Param("record") TbProvinces record, @Param("example") TbProvincesQuery example);

    int updateByPrimaryKeySelective(TbProvinces record);

    int updateByPrimaryKey(TbProvinces record);
}