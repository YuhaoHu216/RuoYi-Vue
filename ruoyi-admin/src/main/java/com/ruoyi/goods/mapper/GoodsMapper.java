package com.ruoyi.goods.mapper;

import java.util.List;
import com.ruoyi.goods.domain.Goods;

/**
 * 商品信息管理Mapper接口
 * 
 * @author hyh
 * @date 2025-11-27
 */
public interface GoodsMapper 
{
    /**
     * 查询商品信息管理
     * 
     * @param id 商品信息管理主键
     * @return 商品信息管理
     */
    public Goods selectGoodsById(Long id);

    /**
     * 查询商品信息管理列表
     * 
     * @param goods 商品信息管理
     * @return 商品信息管理集合
     */
    public List<Goods> selectGoodsList(Goods goods);

    /**
     * 新增商品信息管理
     * 
     * @param goods 商品信息管理
     * @return 结果
     */
    public int insertGoods(Goods goods);

    /**
     * 修改商品信息管理
     * 
     * @param goods 商品信息管理
     * @return 结果
     */
    public int updateGoods(Goods goods);

    /**
     * 删除商品信息管理
     * 
     * @param id 商品信息管理主键
     * @return 结果
     */
    public int deleteGoodsById(Long id);

    /**
     * 批量删除商品信息管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGoodsByIds(Long[] ids);
}
