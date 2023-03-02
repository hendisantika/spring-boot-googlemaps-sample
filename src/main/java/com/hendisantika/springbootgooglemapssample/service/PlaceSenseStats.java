package com.hendisantika.springbootgooglemapssample.service;

import com.hendisantika.springbootgooglemapssample.repository.PlaceSenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/3/23
 * Time: 06:53
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class PlaceSenseStats {
    private final PlaceSenseRepository placeSenseRepository;
}
