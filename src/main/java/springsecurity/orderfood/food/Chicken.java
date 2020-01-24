package springsecurity.orderfood.food;


import lombok.Getter;
import lombok.Setter;
import springsecurity.orderfood.food.Food;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter@Setter
@DiscriminatorValue("chicken")
public class Chicken extends Food {
    private String c_name;
    private int c_count;

}
