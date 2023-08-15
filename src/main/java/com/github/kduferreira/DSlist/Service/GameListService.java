package com.github.kduferreira.DSlist.Service;

import com.github.kduferreira.DSlist.DTO.ListDTO;
import com.github.kduferreira.DSlist.Repository.GameListRepository;
import com.github.kduferreira.DSlist.Repository.GameRepository;
import com.github.kduferreira.DSlist.domain.GameList;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class GameListService {

    private final GameListRepository gameListRepository;


   

    @Transactional
    public List<ListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new ListDTO(x)).toList();
    }
}
