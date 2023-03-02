package com.hendisantika.springbootgooglemapssample.repository;

import com.hendisantika.springbootgooglemapssample.entity.PlaceSense;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/3/23
 * Time: 06:52
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class SimplePlaceSenseRepository implements PlaceSenseRepository {
    private static Long CURRENT_ID = 1L;

    private final Map<Long, PlaceSense> placeSenses = new HashMap<>();

    @Override
    public <S extends PlaceSense> S save(S entity) {
        if (entity.getId() == null) {
            entity.setId(CURRENT_ID++);
        }
        placeSenses.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public <S extends PlaceSense> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<PlaceSense> findById(Long id) {
        return Optional.of(placeSenses.get(id));
    }

    @Override
    public boolean existsById(Long id) {
        return placeSenses.containsKey(id);
    }

    @Override
    public Iterable<PlaceSense> findAll() {
        return Collections.unmodifiableCollection(placeSenses.values());
    }

    @Override
    public Iterable<PlaceSense> findAllById(Iterable<Long> ids) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long count() {
        return placeSenses.size();
    }

    @Override
    public void deleteById(Long id) {
        placeSenses.remove(id);
    }

    @Override
    public void delete(PlaceSense entity) {
        placeSenses.remove(entity.getId());
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends PlaceSense> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }
}
