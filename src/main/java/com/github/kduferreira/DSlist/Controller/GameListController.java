package com.github.kduferreira.DSlist.Controller;

import com.github.kduferreira.DSlist.DTO.ListDTO;
import com.github.kduferreira.DSlist.Repository.GameListRepository;
import com.github.kduferreira.DSlist.Service.GameListService;
import com.github.kduferreira.DSlist.domain.GameList;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
@AllArgsConstructor
public class GameListController {

    private final GameListRepository gameListRepository;
    private final GameListService gameListService;

    @GetMapping
    public List<ListDTO> findbyAll(){
        List<ListDTO> gameList = gameListService.findAll();
        return gameList;
    }
}
