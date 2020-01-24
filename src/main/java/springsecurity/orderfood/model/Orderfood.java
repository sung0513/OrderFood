package springsecurity.orderfood.model;


import lombok.Getter;
import lombok.Setter;
import springsecurity.orderfood.food.Food;

import javax.persistence.*;

@Entity
@Getter@Setter
@Table(name = "orderfood")
public class Orderfood {


    @Id@GeneratedValue
    @Column(name = "orderfood_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int foodprice;

    private int count;

    private String;

}
