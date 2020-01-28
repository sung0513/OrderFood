package springsecurity.orderfood.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springsecurity.orderfood.food.Food;
import springsecurity.orderfood.repository.FoodRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class FoodService {


        private final FoodRepository foodRepository;

        @Transactional
        public  void saveFood(Food food) {
            foodRepository.save(food);
        }

        public List<Food> findFoods() {
            return FoodRepository.findAll();
        }
        public Food find(Long foodId) {
            return FoodRepository.find(foodId);
        }

}
