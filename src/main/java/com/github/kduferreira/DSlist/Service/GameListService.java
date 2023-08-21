package com.github.kduferreira.DSlist.Service;

import com.github.kduferreira.DSlist.DTO.GameListDTO;
import com.github.kduferreira.DSlist.Projections.GameMinProjection;
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
    private final GameRepository gameRepository;



    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for(int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
