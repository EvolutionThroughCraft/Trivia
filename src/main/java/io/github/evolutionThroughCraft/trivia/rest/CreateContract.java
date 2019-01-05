/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.rest;

import io.github.evolutionThroughCraft.common.arch.contracts.Contract;
import io.github.evolutionThroughCraft.common.service.main.utils.ResourceUtility;
import io.github.evolutionThroughCraft.trivia.models.TriviaForm;
import org.springframework.stereotype.Component;

/**
 *
 * @author dwin
 */
@Component("triviaCreate")
public class CreateContract implements Contract<TriviaForm> {
    
    @Override
    public void validate(TriviaForm form) {
        ResourceUtility.ensureResource(form, "TriviaForm Missing");
        ResourceUtility.ensureResource(form.getQuestion(), "Question Missing");        
        ResourceUtility.ensureResource(form.getCreateUser(), "CreateUser Missing");
        ResourceUtility.ensureResource(form.getUpdateUser(), "UpdateUser Missing");
    }
}
