package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {

    /**
     * 查询全部订单，关联用户信息
     * @return
     */
    List<VideoOrder> queryVideoOrderList();



    /**
     * 查询全部订单，关联用户信息 懒加载
     * @return
     */
    List<VideoOrder> queryVideoOrderListLazy();



    /**
     * 查询全部用户的全部订单
     * @return
     */
    List<User> queryUserOrder();




}
