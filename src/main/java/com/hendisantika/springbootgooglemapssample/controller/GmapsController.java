package com.hendisantika.springbootgooglemapssample.controller;

import com.hendisantika.springbootgooglemapssample.dto.PlaceSenseStatsDTO;
import com.hendisantika.springbootgooglemapssample.service.PlaceSenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    private final PlaceSenseService placeSenseService;
    private final ModelMapper dtoEntityMapper;

    @GetMapping("/")
    public String homePage(Model model) {
        PlaceSenseService stats = placeSenseService.getStats();
        PlaceSenseStatsDTO statsDTO = dtoEntityMapper.map(stats, PlaceSenseStatsDTO.class);
        model.addAttribute("stats", statsDTO);
        return "index";
    }
}
