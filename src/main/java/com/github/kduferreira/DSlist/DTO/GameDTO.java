package com.github.kduferreira.DSlist.DTO;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.github.kduferreira.DSlist.domain.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;

    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    private String longDescription;

    public GameDTO(){

    }

    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);//copiar atributos grandes que tem o mesmo nome da entidade que precisa copiar
    }

}
