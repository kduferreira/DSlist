package com.github.kduferreira.DSlist.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Entity
@Data
@Table(name = "tb_belonging")
public class Belonging {

@EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setGameList(list);
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
