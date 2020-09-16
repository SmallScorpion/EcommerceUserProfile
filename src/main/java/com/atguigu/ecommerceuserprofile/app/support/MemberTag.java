package com.atguigu.ecommerceuserprofile.app.support;/**
 * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved
 * <p>
 * Project: EcommerceUserProfile
 * Package: com.atguigu.ecommerceuserprofile.app.support
 * Version: 1.0
 * <p>
 * Created by SmallScorpion on 2020/6/12 14:10
 */

import lombok.Data;

import java.util.List;

/**
 * @ClassName: MemberTag
 * @Description:
 * @Author: SmallScorpion on 2020/6/12 14:10
 * @Version: 1.0
 */
@Data
public class MemberTag {
    // 1. 用户基本信息
    private String memberId;
    private String phone;
    private String sex;
    private String channel;
    private String subOpenId;
    private String address;
    private String regTime;
    // 2. 用户下单行为特征
    private Long orderCount;
    private String orderTime;
    private Double orderMoney;
    private List<String> favGoods;
    // 3. 用户消费能力标签
    private String freeCouponTime;
    private List<String> couponTimes;
    private Double chargeMoney;
    // 4. 服务反馈标签
    private Long overTime;
    private Integer feedBack;
}
