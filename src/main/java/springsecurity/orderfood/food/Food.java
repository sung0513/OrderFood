package springsecurity.orderfood.food;


import lombok.Getter;
import lombok.Setter;
import springsecurity.orderfood.model.Category;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToMany(mappedBy = "foods")
    private List<Category> categories = new ArrayList<>();

}
