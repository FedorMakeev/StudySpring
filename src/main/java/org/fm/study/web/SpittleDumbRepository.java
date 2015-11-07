package org.fm.study.web;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rbxmos523 on 11/5/2015 2:33 PM.
 */
@Service
public class SpittleDumbRepository implements SpittleRepository {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }

    @Override
    public Spittle findOne(int id) {
        return new Spittle("Spittle with id = " + id, new Date());
    }

}
