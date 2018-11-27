package com.pinyougou.mapper;

import com.pinyougou.pojo.TbSpecificationOption;
import com.pinyougou.pojo.TbSpecificationOptionQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSpecificationOptionMapper {
    int countByExample(TbSpecificationOptionQuery example);

    int deleteByExample(TbSpecificationOptionQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSpecificationOption record);

    int insertSelective(TbSpecificationOption record);

    List<TbSpecificationOption> selectByExample(TbSpecificationOptionQuery example);

    TbSpecificationOption selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSpecificationOption record, @Param("example") TbSpecificationOptionQuery example);

    int updateByExample(@Param("record") TbSpecificationOption record, @Param("example") TbSpecificationOptionQuery example);

    int updateByPrimaryKeySelective(TbSpecificationOption record);

    int updateByPrimaryKey(TbSpecificationOption record);
}