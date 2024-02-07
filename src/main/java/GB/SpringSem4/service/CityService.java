package GB.SpringSem4.service;

import GB.SpringSem4.model.City;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class CityService {

    private List<City> cityList = new ArrayList<>();

    public void addCity (City city){
        cityList.add(city);
    }
}
