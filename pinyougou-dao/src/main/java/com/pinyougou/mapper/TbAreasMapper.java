package com.pinyougou.mapper;

import com.pinyougou.pojo.TbAreas;
import com.pinyougou.pojo.TbAreasQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAreasMapper {
    int countByExample(TbAreasQuery example);

    int deleteByExample(TbAreasQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAreas record);

    int insertSelective(TbAreas record);

    List<TbAreas> selectByExample(TbAreasQuery example);

    TbAreas selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAreas record, @Param("example") TbAreasQuery example);

    int updateByExample(@Param("record") TbAreas record, @Param("example") TbAreasQuery example);

    int updateByPrimaryKeySelective(TbAreas record);

    int updateByPrimaryKey(TbAreas record);
}