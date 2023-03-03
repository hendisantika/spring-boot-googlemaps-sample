package com.hendisantika.springbootgooglemapssample.service;

import com.hendisantika.springbootgooglemapssample.entity.Place;
import com.hendisantika.springbootgooglemapssample.entity.PlaceSense;
import com.hendisantika.springbootgooglemapssample.entity.Sense;
import com.hendisantika.springbootgooglemapssample.repository.PlaceSenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PlaceSenseService {
    public int numVisitedPlaces;
    public int numWannaGoPlaces;
    public int numLovedPlaces;
    public int numVisitedCountries;

    @Autowired
    private PlaceSenseRepository placeSenseRepository;

    public PlaceSenseService getStats() {
        Iterable<PlaceSense> placeSenses = placeSenseRepository.findAll();
        return computeStats(placeSenses);
    }

    public PlaceSense save(PlaceSense placeSense) {
        return placeSenseRepository.save(placeSense);
    }

    private PlaceSenseService computeStats(Iterable<PlaceSense> placeSenses) {
        PlaceSenseService stats = new PlaceSenseService();
        Set<String> visitedCountries = new HashSet<>();
        for (PlaceSense placeSense : placeSenses) {
            collectStats(placeSense, stats, visitedCountries);
        }
        stats.numVisitedCountries = visitedCountries.size();
        return stats;
    }

    private void collectStats(PlaceSense placeSense, PlaceSenseService stats, Set<String> visitedCountries) {
        Sense sense = placeSense.getSense();
        if (sense.impliesVisited()) {
            stats.numVisitedPlaces++;
            Place place = placeSense.getPlace();
            visitedCountries.add(place.getCountryCode());
        }
        if (sense == Sense.YES_LOVED_IT) {
            stats.numLovedPlaces++;
        }
        if (sense == Sense.NO_WANNA_GO) {
            stats.numWannaGoPlaces++;
        }
    }
}
