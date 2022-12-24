package com.hmdp;

import com.hmdp.service.impl.ShopServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class HmDianPingApplicationTests {
    @Resource
    private ShopServiceImpl shopService;

    @Test
    void test() throws InterruptedException {
        shopService.saveShop2Redis(1L,10L);
        shopService.saveShop2Redis(2L,10L);
        shopService.saveShop2Redis(3L,10L);
        shopService.saveShop2Redis(4L,10L);
        shopService.saveShop2Redis(5L,10L);
    }

}
