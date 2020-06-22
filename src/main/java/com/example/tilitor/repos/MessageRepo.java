package com.example.tilitor.repos;

import com.example.tilitor.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    /**
     * Поиск по тегу.
     * @param tag Тег.
     * @return Коллекция тегов.
     */
    List<Message> findByTag(String tag);
}
