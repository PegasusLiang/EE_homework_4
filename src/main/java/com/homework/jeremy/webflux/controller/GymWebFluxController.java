package com.homework.jeremy.webflux.controller;

import com.homework.jeremy.domain.Gym;
import com.homework.jeremy.handler.GymHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Api(tags = "GymWebFluxController", description = "Gym管理")
@RequestMapping(value = "/gym")
@RestController
public class GymWebFluxController {

    @Autowired
    private GymHandler gymHandler;

    @ApiOperation("ID查找Gym")
    @GetMapping(value = "/{id}")
    public Mono<Gym> findGymById(@PathVariable("id") Long id) {
        return gymHandler.findGymById(id);
    }

    @ApiOperation("展示Gym记录")
    @GetMapping()
    public Flux<Gym> findAllGym() {
        return gymHandler.findAllGym();
    }

    @ApiOperation("保存Gym")
    @PostMapping()
    public Mono<Gym> saveGym(@RequestBody Gym gym) {
        return gymHandler.save(gym);
    }

    @ApiOperation("更改Gym信息")
    @PutMapping()
    public Mono<Gym> modifyGym(@RequestBody Gym gym) {
        return gymHandler.modifyGym(gym);
    }

    @ApiOperation("根据ID删除Gym")
    @DeleteMapping(value = "/{id}")
    public Mono<Long> deleteGym(@PathVariable("id") Long id) {
        return gymHandler.deleteGym(id);
    }
}
