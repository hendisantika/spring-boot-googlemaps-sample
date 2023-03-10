package com.hendisantika.springbootgooglemapssample;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@SpringBootApplication
@ControllerAdvice
public class SpringBootGooglemapsSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGooglemapsSampleApplication.class, args);
    }

    @ModelAttribute
    public void setModelAttributes(Model model) {
        model.addAttribute("bootstrapVersion", "4.1.3");
        model.addAttribute("jqueryVersion", "3.3.1-1");
        model.addAttribute("faVersion", "5.3.1");
    }

    @Bean
    public ModelMapper modelMapper() {
        // Used to map DTOs to Entities and vice versa
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setFieldMatchingEnabled(true);
        return modelMapper;
    }
}
