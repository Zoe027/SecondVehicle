package com.ldu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ldu.pojo.CommentExtend;
import com.ldu.pojo.Comments;
import com.ldu.pojo.Goods;

public interface GoodsMapper {
    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);//更新
    
    int deleteByPrimaryKeys(Integer id);//删除

    /**
     * 添加二手电瓶车
     * @param record
     * @return
     */
    int insert(Goods record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Goods record);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    Goods selectByPrimaryKey(Integer id);
    

	Goods selectById(Integer goodsId);

    /**
     * 通过主键更改信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * 通过主键更改信息，包括大文本信息
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(Goods record);

    /**
     * 通过主键更改信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Goods record);

    /**
     * 查询所有的电瓶车
     * @return
     */
    public List<Goods> selectAllGoods();

    List<Goods> searchGoods(@Param("name") String name,@Param("describle") String describle);

    /**
     * 根据最新发布分类，查询电瓶车
     * @param catelog_id
     * @return
     */
    public List<Goods> selectByStr(@Param("limit")Integer limit,@Param("name") String name,@Param("describle") String describle);

    /**
     * 根据电瓶车分类的id，查询电瓶车
     * @param catelog_id
     * @return
     */
    public List<Goods> selectByCatelog(@Param("catelog_id") Integer catelog_id,@Param("name") String name,@Param("describle") String describle);

    
    /**
     * 根据时间先后获取电瓶车信息，进行分页查询
     * 未在xml中实现
     * @return
     */
    public List<Goods> selectByDate(int page,int maxResults);

    /**
     * 根据catelog_id查询电瓶车信息，结果按擦亮时间排序，最新的在前
     * @return
     */
    public List<Goods> selectByCatelogOrderByDate(@Param("catelogId")Integer catelogId,@Param("limit")Integer limit);

    
    /**
     * 查询最新发布电瓶车信息，结果按擦亮时间排序，最新的在前
     * @return
     */
    public List<Goods> selectOrderByDate(@Param("limit")Integer limit);

    /**
     * 查询登录用户的所有二手电瓶车电瓶车
     * @param user_id
     * @return
     */
    public List<Goods> getGoodsByUserId(Integer user_id);
    
    /**
     * 提交的订单时，修改电瓶车状态
     * @param user_id
     * @return
     */
    int updateGoodsByGoodsId(Goods goods);
    /**
     * 获取电瓶车数
     * @return
     */
	List<Goods> getGoodsList();
	/**
	 * 模糊查询
	 * @param id
	 * @param name
	 * @param form
	 * @return
	 */
	List<Goods> getPageGoodsByGoods(@Param("id")Integer id, @Param("name")String name,@Param("status")Integer status);
	
	CommentExtend selectCommentsByGoodsId(@Param("id")Integer id);

	public void addComments(Comments comments);
}