/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.models;

import io.github.evolutionThroughCraft.common.service.main.api.Knowledge;
import io.github.evolutionThroughCraft.common.service.main.api.pojo.KnowledgePojo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author dwin
 */
@NoArgsConstructor
public class TriviaForm extends KnowledgePojo implements Knowledge {
    
    public TriviaForm(TriviaEntity entity) {
        super();
        setKnowledgeId(entity.getKnowledgeId());
        setQuestion(entity.getQuestion());
        setAnswer(entity.getAnswer());
        setCreateTime(entity.getCreateTime());
        setCreateUser(entity.getCreateUser());
        setUpdateTime(entity.getUpdateTime());
        setUpdateUser(entity.getUpdateUser());
    }
}
