package com.github.kduferreira.DSlist.Repository;

import com.github.kduferreira.DSlist.domain.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository  extends JpaRepository<GameList, Long> {
}
