package com.fullstack.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.jpademo.controller.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, String>{

}
