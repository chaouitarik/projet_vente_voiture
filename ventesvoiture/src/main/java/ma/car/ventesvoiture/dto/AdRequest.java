package ma.car.ventesvoiture.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class AdRequest {
    private String title;
    private String description;
    private Double price;
    private String categoryName; // ou Long categoryId

    // getters et setters
}