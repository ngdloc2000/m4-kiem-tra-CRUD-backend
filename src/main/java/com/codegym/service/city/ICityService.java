package com.codegym.service.city;

import com.codegym.model.City;
import com.codegym.model.dto.GdpPieChart;
import com.codegym.service.IGenericService;

import java.util.List;

public interface ICityService extends IGenericService<City> {
    List<GdpPieChart> gdpPieChart();
}
