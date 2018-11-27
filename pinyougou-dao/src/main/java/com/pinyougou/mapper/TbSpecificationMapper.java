package com.pinyougou.mapper;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSpecificationMapper {
    int countByExample(TbSpecificationQuery example);

    int deleteByExample(TbSpecificationQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSpecification record);

    int insertSelective(TbSpecification record);

    List<TbSpecification> selectByExample(TbSpecificationQuery example);

    TbSpecification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSpecification record, @Param("example") TbSpecificationQuery example);

    int updateByExample(@Param("record") TbSpecification record, @Param("example") TbSpecificationQuery example);

    int updateByPrimaryKeySelective(TbSpecification record);

    int updateByPrimaryKey(TbSpecification record);
}