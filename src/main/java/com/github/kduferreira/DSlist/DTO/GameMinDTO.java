package com.github.kduferreira.DSlist.DTO;

import com.github.kduferreira.DSlist.domain.Game;
import lombok.Data;

@Data
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.imgUrl = entity.getYear();
        this.shortDescription = entity.getShortDescription();
    }
}
