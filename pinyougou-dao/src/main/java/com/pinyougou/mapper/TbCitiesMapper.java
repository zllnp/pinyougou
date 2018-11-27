package com.pinyougou.mapper;

import com.pinyougou.pojo.TbCities;
import com.pinyougou.pojo.TbCitiesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCitiesMapper {
    int countByExample(TbCitiesQuery example);

    int deleteByExample(TbCitiesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCities record);

    int insertSelective(TbCities record);

    List<TbCities> selectByExample(TbCitiesQuery example);

    TbCities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCities record, @Param("example") TbCitiesQuery example);

    int updateByExample(@Param("record") TbCities record, @Param("example") TbCitiesQuery example);

    int updateByPrimaryKeySelective(TbCities record);

    int updateByPrimaryKey(TbCities record);
}