package com.zc.manager.web;

import com.zc.manager.pojo.dto.ItemQuery;
import com.zc.manager.pojo.dto.ItemResult;
import com.zc.manager.pojo.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;
import com.zc.manager.pojo.vo.TbItemCustom;
import com.zc.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品Action
 */
@Controller
public class ItemAction {

    @Autowired
    private ItemService itemService;

    /**
     * 模糊查询+分页查询商品
     * @param pageParam
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/items",method = RequestMethod.GET)
    public ItemResult<TbItemCustom> listItems(PageParam pageParam,ItemQuery itemQuery){

        ItemResult<TbItemCustom> result = null;
        try{
            result = itemService.listItems(pageParam,itemQuery);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 批量删除
     */
    @ResponseBody
    @RequestMapping(value = "/item/batch",method = RequestMethod.POST)
    public int remove(@RequestParam("ids[]")List<Long> ids){
        int i = 0;
        try {
            i = itemService.removeItemByIds(ids);
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

}
