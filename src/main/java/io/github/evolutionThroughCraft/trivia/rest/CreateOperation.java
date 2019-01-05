/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.rest;

import io.github.evolutionThroughCraft.common.arch.orchestrators.ContractOperation;
import io.github.evolutionThroughCraft.common.arch.orchestrators.Operation;
import io.github.evolutionThroughCraft.trivia.models.TriviaEntity;
import io.github.evolutionThroughCraft.trivia.models.TriviaForm;
import io.github.evolutionThroughCraft.trivia.repo.TriviaRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dwin
 */
@Component
@Getter
public class CreateOperation extends ContractOperation<TriviaForm, TriviaForm, CreateContract> {

    @Autowired
    private TriviaRepository triviaRepo;
    
    @Override
    public TriviaForm perform(TriviaForm form) {
        TriviaEntity entity = new TriviaEntity(form);
        TriviaEntity saved = getTriviaRepo().save(entity);
        return new TriviaForm(saved);
    }
}
