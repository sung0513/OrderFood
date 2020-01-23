package springsecurity.orderfood.repository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.Member;

@Repository
@Transactional
public class Memberrepository {


        @PersistenceContext
        private EntityManager em;

        public Long save(Member member) {

            em.persist(member);
            return member.getid();

        }
        public Member find(Long id) {
            return em.find(Member.class, id);
        }


}



