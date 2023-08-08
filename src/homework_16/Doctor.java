package homework_16;

public class Doctor {
    String name;
    String specialization;
    int workExperienceInYears;

    public Doctor() {
    }

    public Doctor(String name) {
        this.name = name;
    }

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;

    }

    public Doctor(String name, String specialization, int workExperienceInYears) {
        this.name = name;
        this.specialization = specialization;
        this.workExperienceInYears = workExperienceInYears;
    }

}
