package com.zc.manager.service;

import com.zc.manager.dto.ItemResult;
import com.zc.manager.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;

public interface ItemService {
    ItemResult<TbItem> listItems(PageParam pageParam);
}
