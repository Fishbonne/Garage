package co.tula.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class Color extends NamedEntity{

    public Color(String name) {
        super(name);
    }

    public Color() {
    }

    @Override
    public String toString() {
        return "Color{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
