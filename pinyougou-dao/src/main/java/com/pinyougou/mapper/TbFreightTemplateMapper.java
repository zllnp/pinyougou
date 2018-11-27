package com.pinyougou.mapper;

import com.pinyougou.pojo.TbFreightTemplate;
import com.pinyougou.pojo.TbFreightTemplateQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFreightTemplateMapper {
    int countByExample(TbFreightTemplateQuery example);

    int deleteByExample(TbFreightTemplateQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbFreightTemplate record);

    int insertSelective(TbFreightTemplate record);

    List<TbFreightTemplate> selectByExample(TbFreightTemplateQuery example);

    TbFreightTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateQuery example);

    int updateByExample(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateQuery example);

    int updateByPrimaryKeySelective(TbFreightTemplate record);

    int updateByPrimaryKey(TbFreightTemplate record);
}