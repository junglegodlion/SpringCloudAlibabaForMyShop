package com.funtl.spring.security.oauth2.resource.service;

import com.funtl.spring.security.oauth2.resource.domain.Shop;

import java.util.List;

public interface ShopService{


    List<Shop> selectAll();
}
