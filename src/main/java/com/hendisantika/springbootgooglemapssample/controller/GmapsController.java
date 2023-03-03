package com.hendisantika.springbootgooglemapssample.controller;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/3/23
 * Time: 06:59
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequiredArgsConstructor
public class GmapsController {
    private final Environment env;

    private final ModelMapper dtoEntityMapper;

}
