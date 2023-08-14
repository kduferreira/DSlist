package com.github.kduferreira.DSlist.Service;

import com.github.kduferreira.DSlist.DTO.GameMinDTO;
import com.github.kduferreira.DSlist.Repository.GameRepository;
import com.github.kduferreira.DSlist.domain.Game;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {


    private final GameRepository gameRepository;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

}

}
