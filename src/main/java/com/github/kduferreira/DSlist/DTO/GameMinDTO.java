package com.github.kduferreira.DSlist.DTO;

import com.github.kduferreira.DSlist.Projections.GameMinProjection;
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

    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.imgUrl = projection.getYear();
        this.shortDescription = projection.getshortDescription();
    }
}
