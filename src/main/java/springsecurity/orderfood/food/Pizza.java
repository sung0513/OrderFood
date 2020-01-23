package springsecurity.orderfood.food;


import lombok.Getter;
import lombok.Setter;
import springsecurity.orderfood.food.Food;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter@Setter
@DiscriminatorValue("pizza")
public class Pizza extends Food {
    private String p_name;
    private int p_count;

}
