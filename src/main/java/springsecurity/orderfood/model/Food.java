package springsecurity.orderfood.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter@Setter

public class Food {

    @Id@GeneratedValue
    @Column(name = "food_id")
    private Long id;

    private String name;
    private int price;
    private int max;

}
