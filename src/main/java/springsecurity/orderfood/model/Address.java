package springsecurity.orderfood.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {
        private String city;
        private String street;
}
