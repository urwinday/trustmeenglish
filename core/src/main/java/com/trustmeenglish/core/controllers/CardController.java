package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.CardDTO;
import com.trustmeenglish.core.mappers.CardMapper;
import com.trustmeenglish.core.model.Card;
import com.trustmeenglish.core.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public CardDTO getCardById(@PathVariable Long id) {
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);
    }

//    public ResponseEntity<?> saveCard(@RequestParam("file")MultipartFile file,
//                                      @RequestBody CardDTO cardDTO) {
//        Card card = cardMapper.toEntity(cardDTO, file);
//        card = cardService.addCard(card);
//        cardDTO = cardMapper.toDTO(card);
//        return  new ResponseEntity<>(cardDTO, HttpStatus.CREATED);
//    }

}
