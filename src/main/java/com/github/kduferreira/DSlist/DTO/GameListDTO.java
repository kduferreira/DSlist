package com.github.kduferreira.DSlist.DTO;

import com.github.kduferreira.DSlist.domain.GameList;
import lombok.Data;

@Data
public class GameListDTO {


    private Long id;
    private String name;


    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
