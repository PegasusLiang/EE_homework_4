package com.homework.jeremy.handler;

import com.homework.jeremy.dao.GymRepository;
import com.homework.jeremy.domain.Gym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class GymHandler {

    private final GymRepository gymRepository;

    @Autowired
    public GymHandler(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    public Mono<Gym> save(Gym gym) {
        return gymRepository.save(gym);
    }

    public Mono<Gym> findGymById(Long id) {

        return gymRepository.findById(id);
    }

    public Flux<Gym> findAllGym() {

        return gymRepository.findAll();
    }

    public Mono<Gym> modifyGym(Gym gym) {

        return gymRepository.save(gym);
    }

    public Mono<Long> deleteGym(Long id) {
        gymRepository.deleteById(id);
        return Mono.create(gymMonoSink -> gymMonoSink.success(id));
    }
}