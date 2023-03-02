package com.hendisantika.springbootgooglemapssample.entity;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/3/23
 * Time: 06:50
 * To change this template use File | Settings | File Templates.
 */
public enum Sense {
    YES_LOVED_IT(true),
    YES_MEH(true),
    YES_HATED_IT(true),
    NO_WANNA_GO(false),
    NOT_INTERESTED(false);

    private final boolean impliesVisited;

    Sense(boolean impliesVisited) {
        this.impliesVisited = impliesVisited;
    }

    public boolean impliesVisited() {
        return impliesVisited;
    }
}
