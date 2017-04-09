package co.tula.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country extends NamedEntity{

    public Country(String name) {
        super(name);
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
