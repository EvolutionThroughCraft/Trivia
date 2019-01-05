/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.rest;

import io.github.evolutionThroughCraft.common.arch.orchestrators.SimpleOperation;
import io.github.evolutionThroughCraft.trivia.models.TriviaForm;
import io.github.evolutionThroughCraft.trivia.repo.TriviaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dwin
 */
@Component
public class GetMatchingOperation extends SimpleOperation<TriviaForm, List<TriviaForm>>{
    
    @Autowired
    private TriviaRepository triviaRepo;
        
    @Override
    public List<TriviaForm> perform(TriviaForm request) {
        
        return null;
    }
}
