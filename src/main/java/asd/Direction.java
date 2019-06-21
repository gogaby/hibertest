package asd;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "directions")
public class Direction {


    private short id;

    private String name;

    private List<City> cities;

    @PrePersist
    public void pre(){
        boolean stop;
        if (cities != null) {
            cities.forEach(this::accept);
        }
        hashCode();
        stop = true;
    }

    @Id
    @Column(name = "id", nullable = false)
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "direction")
    public List<City> getCities() {
        return cities;
    }

    public void addCity(City city){
        this.cities.add(city);
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    private void accept(City city) {
        city.setDirection(this);
    }
}
