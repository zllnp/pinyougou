package com.pinyougou.mapper;

import com.pinyougou.pojo.TbContent;
import com.pinyougou.pojo.TbContentQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentMapper {
    int countByExample(TbContentQuery example);

    int deleteByExample(TbContentQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    List<TbContent> selectByExample(TbContentQuery example);

    TbContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentQuery example);

    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentQuery example);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKey(TbContent record);
}