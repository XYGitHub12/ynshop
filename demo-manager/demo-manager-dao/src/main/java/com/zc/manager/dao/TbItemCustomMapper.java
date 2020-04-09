package com.zc.manager.dao;

import com.zc.manager.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;

import java.util.List;

public interface TbItemCustomMapper {
    long getCount();

    List<TbItem> listItemsByPage(PageParam pageParam);
}
