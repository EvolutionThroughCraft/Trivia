/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.models;

import io.github.evolutionThroughCraft.common.service.main.api.pojo.TriviaPojo;
import lombok.NoArgsConstructor;
import io.github.evolutionThroughCraft.common.service.main.api.Trivia;

/**
 *
 * @author dwin
 */
@NoArgsConstructor
public class TriviaForm extends TriviaPojo implements Trivia {
    
    public TriviaForm(TriviaEntity entity) {
        super();
        setTriviaId(entity.getTriviaId());
        setQuestion(entity.getQuestion());
        setAnswer(entity.getAnswer());
        setCreateTime(entity.getCreateTime());
        setCreateUser(entity.getCreateUser());
        setUpdateTime(entity.getUpdateTime());
        setUpdateUser(entity.getUpdateUser());
    }
}
