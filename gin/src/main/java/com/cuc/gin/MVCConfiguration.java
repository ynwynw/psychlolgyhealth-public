package com.cuc.gin;

import com.cuc.gin.web.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : Chen X.T.
 * @since : 2020/3/2, 周一
 **/
@Configuration
public class MVCConfiguration implements WebMvcConfigurer {
    @Bean
    public AuthInterceptor userInterceptor() {
        return new AuthInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor());
    }
}
