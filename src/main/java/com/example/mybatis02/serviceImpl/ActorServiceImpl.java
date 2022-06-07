/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mybatis02.serviceImpl;

import com.example.mybatis02.model.Actor;
import com.example.mybatis02.repository.ActorMyBatisRepository;
import com.example.mybatis02.service.ActorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author KEILA
 */
@Service

public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorMyBatisRepository ActorMyBatisRepository;

    @Override
    public List<Actor> findAll() {
        return ActorMyBatisRepository.findAll();
    }

    @Override
    public Actor findById(long id) {
        return ActorMyBatisRepository.findById(id);
    }

    @Override
    public int deleteById(long id) {
        return ActorMyBatisRepository.delete(id);
    }

    @Override
    public int insert(Actor actor) {
        return ActorMyBatisRepository.insert(actor);
    }

    @Override
    public int update(Actor actor) {
        return ActorMyBatisRepository.update(actor);
    }
    
}
