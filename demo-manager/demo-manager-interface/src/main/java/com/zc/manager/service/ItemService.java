package com.zc.manager.service;

import com.zc.manager.pojo.dto.ItemResult;
import com.zc.manager.pojo.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;
import com.zc.manager.pojo.vo.TbItemCustom;

public interface ItemService {
    ItemResult<TbItemCustom> listItems(PageParam pageParam);
}
