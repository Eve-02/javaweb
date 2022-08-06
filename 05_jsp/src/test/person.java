package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class person {

    private String name;
    private String[] phone;
    private List<String> cities;
    private Map<String,Object> map;

    public person() {
    }

    public person(String name, String[] phone, List<String> cities, Map<String, Object> map) {
        this.name = name;
        this.phone = phone;
        this.cities = cities;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "person{" +
                "name=" + name +
                ", phone=" + Arrays.toString(phone) +
                ", cities=" + cities +
                ", map=" + map +
                '}';
    }

}
