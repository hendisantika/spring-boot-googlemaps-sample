package com.hendisantika.springbootgooglemapssample.service;

import com.hendisantika.springbootgooglemapssample.entity.PlaceSense;
import com.hendisantika.springbootgooglemapssample.repository.PlaceSenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

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

    public PlaceSenseStats getStats() {
        Iterable<PlaceSense> placeSenses = placeSenseRepository.findAll();
        return computeStats(placeSenses);
    }

    public PlaceSense save(PlaceSense placeSense) {
        return placeSenseRepository.save(placeSense);
    }

    private PlaceSenseStats computeStats(Iterable<PlaceSense> placeSenses) {
        PlaceSenseStats stats = new PlaceSenseStats();
        Set<String> visitedCountries = new HashSet<>();
        for (PlaceSense placeSense : placeSenses) {
            collectStats(placeSense, stats, visitedCountries);
        }
        stats.numVisitedCountries = visitedCountries.size();
        return stats;
    }
}
