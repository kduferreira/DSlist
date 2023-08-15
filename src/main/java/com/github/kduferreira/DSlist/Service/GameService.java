package com.github.kduferreira.DSlist.Service;

import com.github.kduferreira.DSlist.DTO.GameDTO;
import com.github.kduferreira.DSlist.DTO.GameMinDTO;
import com.github.kduferreira.DSlist.Projections.GameMinProjection;
import com.github.kduferreira.DSlist.Repository.GameRepository;
import com.github.kduferreira.DSlist.domain.Game;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {


    private final GameRepository gameRepository;


    @Transactional(readOnly = true)// nao vou fazer nada escrita. metodo mais rapido
    public GameDTO findById(Long Id){
        Game result = gameRepository.findById(Id).get(); //pegar do banco de dados
        GameDTO dto= new GameDTO(result); //converter para DTO
        return dto;

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

}
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
