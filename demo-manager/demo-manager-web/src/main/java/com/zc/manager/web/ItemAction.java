package com.zc.manager.web;

import com.zc.manager.dto.ItemResult;
import com.zc.manager.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;
import com.zc.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品Action
 */
@Controller
public class ItemAction {

    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "/items",method = RequestMethod.GET)
    public ItemResult<TbItem> listItems(PageParam pageParam){

        ItemResult<TbItem> result = null;
        try{
            result = itemService.listItems(pageParam);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
