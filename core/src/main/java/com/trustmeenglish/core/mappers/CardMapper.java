package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.CardDTO;
import com.trustmeenglish.core.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CardMapper {
    @Mapping(source = "enWord", target = "enWordDTO")
    @Mapping(source = "ruWord", target = "ruWordDTO")
    CardDTO toDTO(Card card);
}
