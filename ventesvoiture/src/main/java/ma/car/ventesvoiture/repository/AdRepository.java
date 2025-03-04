package ma.car.ventesvoiture.repository;


import ma.car.ventesvoiture.entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {
    List<Ad> findByCategoryId(Long categoryId);
    List<Ad> findByUserId(Long userId);
}