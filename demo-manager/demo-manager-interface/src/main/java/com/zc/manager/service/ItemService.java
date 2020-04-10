package com.zc.manager.service;

import com.zc.manager.pojo.dto.ItemQuery;
import com.zc.manager.pojo.dto.ItemResult;
import com.zc.manager.pojo.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;
import com.zc.manager.pojo.vo.TbItemCustom;

import java.util.List;

public interface ItemService {

    int removeItemByIds(List<Long> ids);

    ItemResult<TbItemCustom> listItems(PageParam pageParam, ItemQuery itemQuery);
}
