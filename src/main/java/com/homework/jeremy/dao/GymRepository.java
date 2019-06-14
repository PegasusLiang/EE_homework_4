package com.homework.jeremy.dao;

import com.homework.jeremy.domain.Gym;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends ReactiveMongoRepository<Gym, Long> {

}