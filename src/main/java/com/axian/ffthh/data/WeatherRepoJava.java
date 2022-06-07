package com.axian.ffthh.data;

import com.axian.ffthh.data.Forecast;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WeatherRepoJava extends CrudRepository<Forecast, UUID> {

    Forecast findOneByZip(String zip);
}
