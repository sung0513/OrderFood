package springsecurity.springsecurityjwt.model;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter@Setter
public class User {


        @Id@GeneratedValue
        @Column(name = "User_id")
        private long id;


}
