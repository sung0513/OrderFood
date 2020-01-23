package springsecurity.orderfood.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter@Setter
public class Chicken extends Food {


    private String c_name;
    private int c_count;

}
