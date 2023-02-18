package com.blog.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class ModelMapping {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
