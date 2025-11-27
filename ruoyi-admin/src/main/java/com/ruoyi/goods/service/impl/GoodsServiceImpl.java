package com.ruoyi.goods.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.goods.mapper.GoodsMapper;
import com.ruoyi.goods.domain.Goods;
import com.ruoyi.goods.service.IGoodsService;

/**
 * 商品信息管理Service业务层处理
 * 
 * @author hyh
 * @date 2025-11-27
 */
@Service
public class GoodsServiceImpl implements IGoodsService 
{
    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 查询商品信息管理
     * 
     * @param id 商品信息管理主键
     * @return 商品信息管理
     */
    @Override
    public Goods selectGoodsById(Long id)
    {
        return goodsMapper.selectGoodsById(id);
    }

    /**
     * 查询商品信息管理列表
     * 
     * @param goods 商品信息管理
     * @return 商品信息管理
     */
    @Override
    public List<Goods> selectGoodsList(Goods goods)
    {
        return goodsMapper.selectGoodsList(goods);
    }

    /**
     * 新增商品信息管理
     * 
     * @param goods 商品信息管理
     * @return 结果
     */
    @Override
    public int insertGoods(Goods goods)
    {
        goods.setCreateTime(DateUtils.getNowDate());
        return goodsMapper.insertGoods(goods);
    }

    /**
     * 修改商品信息管理
     * 
     * @param goods 商品信息管理
     * @return 结果
     */
    @Override
    public int updateGoods(Goods goods)
    {
        goods.setUpdateTime(DateUtils.getNowDate());
        return goodsMapper.updateGoods(goods);
    }

    /**
     * 批量删除商品信息管理
     * 
     * @param ids 需要删除的商品信息管理主键
     * @return 结果
     */
    @Override
    public int deleteGoodsByIds(Long[] ids)
    {
        return goodsMapper.deleteGoodsByIds(ids);
    }

    /**
     * 删除商品信息管理信息
     * 
     * @param id 商品信息管理主键
     * @return 结果
     */
    @Override
    public int deleteGoodsById(Long id)
    {
        return goodsMapper.deleteGoodsById(id);
    }
}
