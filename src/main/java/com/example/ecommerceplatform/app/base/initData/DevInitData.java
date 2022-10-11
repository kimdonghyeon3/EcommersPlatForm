package com.example.ecommerceplatform.app.base.initData;

import com.example.ecommerceplatform.app.member.service.MemberService;
import com.example.ecommerceplatform.app.product.service.ProductService;
import com.example.ecommerceplatform.app.song.service.SongService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(MemberService memberService, SongService songService, ProductService productService) {
        return args -> {
            before(memberService, songService, productService);
        };
    }
}
