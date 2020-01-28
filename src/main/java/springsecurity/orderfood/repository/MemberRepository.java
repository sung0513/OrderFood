package springsecurity.orderfood.repository;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.Member;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

        private final EntityManager em;

        public Long save(Member member) {

            em.persist(member);

        }

        public Member find(Long id) {
            return em.find(Member.class, id);
        }
        // 하나만 조회하는

        public List<Member> findAll() {
            return em.createQuery("select m from Member m", Member.class)
                    .getResultList();
        }
        // 엔티
        public List<Member> findByName(String name) {

            return em.createQuery("select m from Member m where m.name = :name" , Member.class)
                    .setParameter("name" , name)
                    .getResultList();
        }
        //public List<Member> findHaveCoupon(String)

    //쿠폰을 가지 있는 회원 검색

}



