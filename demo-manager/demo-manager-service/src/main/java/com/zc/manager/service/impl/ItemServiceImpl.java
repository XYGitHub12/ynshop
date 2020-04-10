package com.zc.manager.service.impl;

import com.zc.manager.dao.TbItemCustomMapper;
import com.zc.manager.dao.TbItemMapper;
import com.zc.manager.pojo.dto.ItemQuery;
import com.zc.manager.pojo.dto.ItemResult;
import com.zc.manager.pojo.dto.PageParam;
import com.zc.manager.pojo.po.TbItem;
import com.zc.manager.pojo.po.TbItemExample;
import com.zc.manager.pojo.vo.TbItemCustom;
import com.zc.manager.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbItemCustomMapper tbItemCustomDao;
    @Autowired
    private TbItemMapper tbItemDao;

    @Override
    public ItemResult<TbItemCustom> listItems(PageParam pageParam, ItemQuery itemQuery) {

        ItemResult<TbItemCustom> result = new ItemResult<>();
        result.setCode(0);
        result.setMsg("select success");
        try {
            //count
            long count = tbItemCustomDao.getCount(itemQuery);
            result.setCount(count);
            //data
            List<TbItemCustom> data = tbItemCustomDao.listItemsByPage(pageParam,itemQuery);
            result.setData(data);
        }catch (Exception e){
            result.setCount(-1);
            result.setMsg("select failed");
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public int removeItemByIds(List<Long> ids) {

        int i = 0;
        try {
            TbItem tbItem = new TbItem();
            tbItem.setStatus((byte)3);
            //创建模板对象
            TbItemExample tbItemExample = new TbItemExample();
            TbItemExample.Criteria criteria = tbItemExample.createCriteria();
            criteria.andIdIn(ids);
            //执行更新
            i = tbItemDao.updateByExampleSelective(tbItem, tbItemExample);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
