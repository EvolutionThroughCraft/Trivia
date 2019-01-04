/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.rest;

import io.github.evolutionThroughCraft.common.arch.orchestrators.ContractOperation;
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
public class UpdateOperation extends ContractOperation<TriviaForm, TriviaForm, UpdateContract> {
    
    @Autowired
    private TriviaRepository knowledgeRepo;

    @Override
    public TriviaForm perform(TriviaForm form) {
        TriviaEntity entity = new TriviaEntity(form);
        TriviaEntity saved = getKnowledgeRepo().save(entity);
        return new TriviaForm(saved);
    }
}
