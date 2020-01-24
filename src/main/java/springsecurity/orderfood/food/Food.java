package springsecurity.orderfood.food;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name ="Ftype")
@Getter@Setter

public class Food {

    @Id@GeneratedValue
    @Column(name = "food_id")
    private Long id;

    private String name;
    private int price;
    private int max;

}
