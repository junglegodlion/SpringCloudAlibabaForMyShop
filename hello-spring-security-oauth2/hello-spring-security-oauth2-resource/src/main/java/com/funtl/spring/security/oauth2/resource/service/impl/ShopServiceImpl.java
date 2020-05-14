package com.funtl.spring.security.oauth2.resource.service.impl;

import com.funtl.spring.security.oauth2.resource.domain.Shop;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.spring.security.oauth2.resource.mapper.ShopMapper;
import com.funtl.spring.security.oauth2.resource.service.ShopService;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    @Resource
    private ShopMapper shopMapper;

    @Override
    public List<Shop> selectAll() {
        return shopMapper.selectAll();
    }
}
