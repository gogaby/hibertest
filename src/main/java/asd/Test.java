package asd;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test{
    @Autowired
     DirectionRepository directionRepository;

    @org.junit.Test
    public void test(){
        Direction direction1 = new Direction();
        Direction direction2 = new Direction();


        City city1 = new City();
        city1.setId((short) 1);
        city1.setName("city 1");
        City city2 = new City();
        city2.setId((short) 2);
        city2.setName("city 2");
        City city3 = new City();
        city3.setId((short) 3);
        city3.setName("city 3");
        City city4 = new City();
        city4.setId((short) 4);
        city4.setName("city 4");

//        city1.setDirection(direction1);
//        city2.setDirection(direction1);
//        city3.setDirection(direction2);
//        city4.setDirection(direction2);

        direction1.setId((short) 1);
        direction1.setName("direction 1");
        List<City> list1 = Arrays.asList(city1, city2);
        direction1.setCities(list1);

        direction2.setId((short) 2);
        direction2.setName("direction 2");
        List<City> list2 = Arrays.asList(city3, city4);
        direction2.setCities(list2);
        List<Direction> directions = Arrays.asList(direction1, direction2);

        directionRepository.saveAll(directions);
    }


}
