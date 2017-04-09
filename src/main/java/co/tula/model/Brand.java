package co.tula.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand extends NamedEntity{

    public Brand(String name) {
        super(name);
    }

    public Brand() {
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
