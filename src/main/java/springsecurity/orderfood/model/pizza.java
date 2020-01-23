package springsecurity.orderfood.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter@Setter

public class pizza extends Food{

    private String p_name;
    private int p_count;

}
