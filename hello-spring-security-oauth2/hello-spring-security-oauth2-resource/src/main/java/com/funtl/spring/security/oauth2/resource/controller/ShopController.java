package com.funtl.spring.security.oauth2.resource.controller;

import com.funtl.spring.security.oauth2.resource.domain.Shop;
import com.funtl.spring.security.oauth2.resource.dto.ResponseResult;
import com.funtl.spring.security.oauth2.resource.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping(value = "/")
    public ResponseResult<List<Shop>> list() {
        List<Shop> tbContents = shopService.selectAll();
        return new ResponseResult<List<Shop>>(HttpStatus.OK.value(), HttpStatus.OK.toString(), tbContents);
    }
}
