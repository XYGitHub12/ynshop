package com.zc.manager.dao;

import com.zc.manager.pojo.dto.ItemQuery;
import com.zc.manager.pojo.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;
import com.zc.manager.pojo.vo.TbItemCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCustomMapper {
    long getCount(@Param("itemQuery") ItemQuery itemQuery);

    List<TbItemCustom> listItemsByPage(@Param("pageParam") PageParam pageParam, @Param("itemQuery") ItemQuery itemQuery);
}
