/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.trivia.models;

import io.github.evolutionThroughCraft.common.service.main.api.Knowledge;
import io.github.evolutionThroughCraft.common.service.main.models.Stamps;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author dwin
 */
@Entity
@Table(name = "knowledges")
@Getter @Setter
@NoArgsConstructor
public class TriviaEntity extends Stamps<String> implements Knowledge {
    
    @Id @GeneratedValue(generator = "knowledge_generator")
    @SequenceGenerator(
            name = "knowledge_generator",
            sequenceName = "knowledge_sequence",
            initialValue = 1000
    )
    private Long knowledgeId;
    
    @NotBlank
    private String question;
    @NotBlank
    private String answer;
    
    ///////
    
    public TriviaEntity(TriviaForm form) {
        super();
        setKnowledgeId(form.getKnowledgeId());
        setQuestion(form.getQuestion());
        setAnswer(form.getAnswer());
        setCreateTime(form.getCreateTime());
        setCreateUser(form.getCreateUser());
        setUpdateTime(form.getUpdateTime());
        setUpdateUser(form.getUpdateUser());
    }
}
