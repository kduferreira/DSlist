package com.github.kduferreira.DSlist.Controller;

import com.github.kduferreira.DSlist.DTO.GameMinDTO;
import com.github.kduferreira.DSlist.Service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@AllArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }

}
