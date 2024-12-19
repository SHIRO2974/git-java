package chapter15.boarddApp.service;


import chapter15.boarddApp.dto.BoardRequestDto;
import chapter15.boarddApp.dto.BoardResponseDto;

import java.util.List;

public interface BoardService {
    List<BoardResponseDto> findAll();
    BoardResponseDto findByID(long id);
    void save(BoardRequestDto boardRequestDto);
    void update(long id, BoardRequestDto boardRequestDto);
    void delete(long id);
}
