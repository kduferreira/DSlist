package com.github.kduferreira.DSlist.Repository;

import com.github.kduferreira.DSlist.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
