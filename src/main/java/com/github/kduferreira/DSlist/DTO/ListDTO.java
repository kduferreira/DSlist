package com.github.kduferreira.DSlist.DTO;

import com.github.kduferreira.DSlist.domain.GameList;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class ListDTO {


    private Long id;
    private String name;


    public ListDTO() {
    }

    public ListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
