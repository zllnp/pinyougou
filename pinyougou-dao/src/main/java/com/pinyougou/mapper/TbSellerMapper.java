package com.pinyougou.mapper;

import com.pinyougou.pojo.TbSeller;
import com.pinyougou.pojo.TbSellerQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSellerMapper {
    int countByExample(TbSellerQuery example);

    int deleteByExample(TbSellerQuery example);

    int deleteByPrimaryKey(String sellerId);

    int insert(TbSeller record);

    int insertSelective(TbSeller record);

    List<TbSeller> selectByExample(TbSellerQuery example);

    TbSeller selectByPrimaryKey(String sellerId);

    int updateByExampleSelective(@Param("record") TbSeller record, @Param("example") TbSellerQuery example);

    int updateByExample(@Param("record") TbSeller record, @Param("example") TbSellerQuery example);

    int updateByPrimaryKeySelective(TbSeller record);

    int updateByPrimaryKey(TbSeller record);
}