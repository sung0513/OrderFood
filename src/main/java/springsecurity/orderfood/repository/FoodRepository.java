package springsecurity.orderfood.repository;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import springsecurity.orderfood.food.Food;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class FoodRepository {


        private final EntityManager em;

        public void save(Food food) {
            if(Food.getId()==null) {
                em.persist(food);
            }else {
                em.merge(food);
            }
        }

        public Food find(Long id) {
            return em.find(Food.class, id);
        }
        public List<Food> findAll() {

            return em.createQuery("select f from Food f", Food.class)
            .getResultList();
        }
}
