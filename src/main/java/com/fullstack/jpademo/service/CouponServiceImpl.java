package com.fullstack.jpademo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fullstack.jpademo.controller.entity.Coupon;
import com.fullstack.jpademo.exceptions.CouponNotFound;
import com.fullstack.jpademo.repository.CouponRepository;

public class CouponServiceImpl implements CouponService{
	
	@Autowired
	private CouponRepository couponRepository;

	@Override
	public Coupon save(Coupon coupon) {
		// TODO Auto-generated method stub
		couponRepository.save(coupon);
		return coupon;
	}

	@Override
	public Coupon getCouponByCode(String code) {
		// TODO Auto-generated method stub
		Optional<Coupon> coupons =couponRepository.findById(code);
		if(coupons.isPresent()) {
			return coupons.get();
		}
		throw new CouponNotFound();
	}

}
