package com.hendisantika.springbootgooglemapssample.dto;

import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/3/23
 * Time: 06:51
 * To change this template use File | Settings | File Templates.
 */
@ToString
public class SavePlaceSenseResponseDTO {
    public Long placeSenseId;
    public PlaceSenseStatsDTO stats;
}
