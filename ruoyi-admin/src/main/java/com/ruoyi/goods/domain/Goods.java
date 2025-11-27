package com.ruoyi.goods.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品信息管理对象 tb_goods
 * 
 * @author hyh
 * @date 2025-11-27
 */
public class Goods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品ID */
    private Long id;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 商品类型（字典值） */
    @Excel(name = "商品类型", readConverterExp = "字=典值")
    private String goodsType;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal goodsPrice;

    /** 商品库存 */
    @Excel(name = "商品库存")
    private Long goodsStock;

    /** 商品主图（单张图片 URL） */
    @Excel(name = "商品主图", readConverterExp = "单=张图片,U=RL")
    private String goodsMainImg;

    /** 商品图片（多张图，JSON数组，例如 ["a.jpg","b.jpg"]） */
    @Excel(name = "商品图片", readConverterExp = "多=张图，JSON数组")
    private String goodsImages;

    /** 商品详情（富文本，可包含图片与文字） */
    @Excel(name = "商品详情", readConverterExp = "富=文本，可包含图片与文字")
    private String goodsDetail;

    /** 状态（0正常 1下架） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=下架")
    private Integer status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }

    public void setGoodsType(String goodsType) 
    {
        this.goodsType = goodsType;
    }

    public String getGoodsType() 
    {
        return goodsType;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) 
    {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsPrice() 
    {
        return goodsPrice;
    }

    public void setGoodsStock(Long goodsStock) 
    {
        this.goodsStock = goodsStock;
    }

    public Long getGoodsStock() 
    {
        return goodsStock;
    }

    public void setGoodsMainImg(String goodsMainImg) 
    {
        this.goodsMainImg = goodsMainImg;
    }

    public String getGoodsMainImg() 
    {
        return goodsMainImg;
    }

    public void setGoodsImages(String goodsImages) 
    {
        this.goodsImages = goodsImages;
    }

    public String getGoodsImages() 
    {
        return goodsImages;
    }

    public void setGoodsDetail(String goodsDetail) 
    {
        this.goodsDetail = goodsDetail;
    }

    public String getGoodsDetail() 
    {
        return goodsDetail;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goodsName", getGoodsName())
            .append("goodsType", getGoodsType())
            .append("goodsPrice", getGoodsPrice())
            .append("goodsStock", getGoodsStock())
            .append("goodsMainImg", getGoodsMainImg())
            .append("goodsImages", getGoodsImages())
            .append("goodsDetail", getGoodsDetail())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
