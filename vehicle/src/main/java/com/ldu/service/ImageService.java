package com.ldu.service;

import java.util.List;

import com.ldu.pojo.Image;

/**
 * Created by lenovo on 2017/5/12.
 */
public interface ImageService {
    int insert(Image record);
    /**
     * 通过电瓶车id获取该电瓶车的图片
     * @param goodsId
     * @return
     */
    public List<Image> getImagesByGoodsPrimaryKey(Integer goodsId);

    /**
     * 通过电瓶车Id删除电瓶车
     * @param goodsId
     * @return
     */
    int deleteImagesByGoodsPrimaryKey(Integer goodsId);
}