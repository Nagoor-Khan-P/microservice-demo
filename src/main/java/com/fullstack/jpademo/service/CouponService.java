package com.fullstack.jpademo.service;

import com.fullstack.jpademo.controller.entity.Coupon;

public interface CouponService {
	Coupon save(Coupon coupon);
	Coupon getCouponByCode(String code);
}
