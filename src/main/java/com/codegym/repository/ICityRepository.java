package com.codegym.repository;

import com.codegym.model.City;
import com.codegym.model.dto.GdpPieChart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {
    @Query(value = "select c.name as Name, sum(gdp) * 100 / (select sum(gdp) from city) as Result from city c group by c.name", nativeQuery = true)
    List<GdpPieChart> gdpPieChart();
}
