package dayFive;

public class UpdateProfessionalAndPersonalDetails {

    private String editProfessionalDetailsButton;
    private String companyNameInput;
    private String industryDropDown;
    private String skillsInput;
    private String jobLevelDropDown;
    private String linkedInProfileInput;

    private String editPersonalDetailsButton;
    private String nameInput;
    private String telephoneInput;
    private String currentRoleInput;
    private String experienceDropDown;

    String professionalDetailsButton(String editProfessionalDetailsButton) {
        return this.editProfessionalDetailsButton = editProfessionalDetailsButton;
    }

    String professionalDetailsCompanyName(String companyNameInput) {
        return this.companyNameInput = companyNameInput;
    }

    String professionalDetailsIndustryDropDown(String industryDropDown) {
        return this.industryDropDown = industryDropDown;
    }

    String professionalDetailsSkillsInput(String skillsInput) {
        return this.skillsInput = skillsInput;
    }

    String professionalDetailsJobLevelDropDown(String jobLevelDropDown) {
        return this.jobLevelDropDown = jobLevelDropDown;
    }

    String professionalDetailsLinkedInProfileInput(String linkedInProfileInput) {
        return this.linkedInProfileInput = linkedInProfileInput;
    }
//----------------------------------------------------------------------------------------------------------------------
    String personalDetailsButton(String editPersonalDetailsButton) {
        return this.editPersonalDetailsButton = editPersonalDetailsButton;
    }

    String personalDetailsNameInput(String nameInput) {
        return this.nameInput = nameInput;
    }

    String personalDetailsTelephoneInput(String telephoneInput) {
        return this.telephoneInput = telephoneInput;
    }

    String personalDetailsCurrentRoleInput(String currentRoleInput) {
        return this.currentRoleInput = currentRoleInput;
    }

    String personalDetailsExperienceDropDown(String experienceDropDown) {
        return this.experienceDropDown = experienceDropDown;
    }

}