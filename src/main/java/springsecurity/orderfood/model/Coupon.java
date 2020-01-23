package springsecurity.orderfood.model;


import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
public class Coupon {
    private Long price;
    private Long discount;
    private Long percent;
}
