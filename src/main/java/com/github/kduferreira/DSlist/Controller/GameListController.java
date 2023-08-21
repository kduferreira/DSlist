package com.github.kduferreira.DSlist.Controller;

import com.github.kduferreira.DSlist.DTO.GameMinDTO;
import com.github.kduferreira.DSlist.DTO.GameListDTO;
import com.github.kduferreira.DSlist.DTO.ReplacementDTO;
import com.github.kduferreira.DSlist.Repository.GameListRepository;
import com.github.kduferreira.DSlist.Service.GameListService;
import com.github.kduferreira.DSlist.Service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
@AllArgsConstructor
public class GameListController {

    private final GameService gameService;
    private final GameListRepository gameListRepository;
    private final GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findbyAll(){
        List<GameListDTO> gameList = gameListService.findAll();
        return gameList;
    }
    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;

    }

    @PostMapping("/{listId}/replacement")
    public void move (@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId,body.getSourceIndex(), body.getDestinationIndex());

    }
}
