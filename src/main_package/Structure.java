package main_package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.Map;

public class Structure {
    @Autowired
    private Environment environment;

    public Structure(Map<String, Integer> map) {
        this.map = map;
    }

    Map<String, Integer> map;

    int f = 2;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setF(int f) {
        this.f = f;
    }

    public Structure() {
        super();
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}