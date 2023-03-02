package com.hendisantika.springbootgooglemapssample.entity;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/3/23
 * Time: 06:49
 * To change this template use File | Settings | File Templates.
 */
@Data
public class Place {
    private Long id;
    private String name;
    private String countryCode;
    private LatLng latLng;
}
