package gr.bitsplease.bitsplease.controller;

import gr.bitsplease.bitsplease.exceptions.ApplicantNotFoundException;
import gr.bitsplease.bitsplease.models.ApplicantSkills;
import gr.bitsplease.bitsplease.models.Skills;
import gr.bitsplease.bitsplease.services.ApplicantService;
import gr.bitsplease.bitsplease.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SkillsController {
    @Autowired
    private SkillService skillService;
    @Autowired
    private ApplicantService applicantService;


    @GetMapping("skills")
    public List<Skills> getSkill() {
        return skillService.getSkills();
    }

    @PostMapping("skills")
    public Skills addSkills(@RequestBody Skills skills) {
        return skillService.addSkills(skills);
    }

    @PostMapping("skill/{applicantId}/{skillId}")
    public ApplicantSkills addSkillsToApplicant(@PathVariable int applicantId,
                                                @PathVariable int skillId) throws ApplicantNotFoundException {
        return applicantService.addSkillsToApplicant(applicantId, skillId);
    }

}