package com.fullstack.jpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.jpademo.controller.entity.Coupon;
import com.fullstack.jpademo.service.CouponService;

@RestController
@RequestMapping("/mycoupons")
public class CouponController {
	
	@Autowired
	private CouponService couponService;
	
	@PostMapping
	public Coupon save(@RequestBody Coupon coupon) {//convert json object into java object this is the reason why we use Spring Rest
		return couponService.save(coupon);
	}
	
	@GetMapping("/{code}")
	public Coupon getCouponByCode(@PathVariable("code") String code) {
		return couponService.getCouponByCode(code);
	}
}
