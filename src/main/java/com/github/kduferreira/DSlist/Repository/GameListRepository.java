package com.github.kduferreira.DSlist.Repository;

import com.github.kduferreira.DSlist.domain.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameListRepository  extends JpaRepository<GameList, Long> {
    @Modifying //anotacao quando nao se ultiliza o select no query, mas  update delete insert
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
