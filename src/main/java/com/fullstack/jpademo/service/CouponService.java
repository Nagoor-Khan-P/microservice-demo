package com.fullstack.jpademo.service;

import com.fullstack.jpademo.controller.entity.Coupon;
import com.fullstack.jpademo.exceptions.CouponNotFound;

public interface CouponService {
	Coupon save(Coupon coupon);
	Coupon getCouponByCode(String code) throws CouponNotFound;
}
