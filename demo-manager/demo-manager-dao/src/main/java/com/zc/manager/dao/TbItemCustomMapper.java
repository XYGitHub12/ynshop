package com.zc.manager.dao;

import com.zc.manager.pojo.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;
import com.zc.manager.pojo.vo.TbItemCustom;

import java.util.List;

public interface TbItemCustomMapper {
    long getCount();

    List<TbItemCustom> listItemsByPage(PageParam pageParam);
}
