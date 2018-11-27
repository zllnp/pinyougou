package com.pinyougou.mapper;

import com.pinyougou.pojo.TbTypeTemplate;
import com.pinyougou.pojo.TbTypeTemplateQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTypeTemplateMapper {
    int countByExample(TbTypeTemplateQuery example);

    int deleteByExample(TbTypeTemplateQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTypeTemplate record);

    int insertSelective(TbTypeTemplate record);

    List<TbTypeTemplate> selectByExample(TbTypeTemplateQuery example);

    TbTypeTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateQuery example);

    int updateByExample(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateQuery example);

    int updateByPrimaryKeySelective(TbTypeTemplate record);

    int updateByPrimaryKey(TbTypeTemplate record);
}