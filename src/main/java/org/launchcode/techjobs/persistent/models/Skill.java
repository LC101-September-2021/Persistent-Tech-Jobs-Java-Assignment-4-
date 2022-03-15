package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @OneToOne
    @NotBlank(message = "Skill is required")
    @Size(max = 150, message = "Description too long")
    private String skill;

    public Skill(String skill) {
        this.skill = skill;
    }

    public Skill(){}

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}