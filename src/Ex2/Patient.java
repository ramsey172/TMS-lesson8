package Ex2;

public class Patient extends Human{
    TreatmentPlan treatmentPlan;
    Doctor doctor;

    Patient(TreatmentPlan treatmentPlan){
        this.treatmentPlan = treatmentPlan;
        if(treatmentPlan.code == 1){
            this.doctor = new Surgeon();
        }else if(treatmentPlan.code == 2){
            this.doctor = new Dentist();
        }else{
            this.doctor = new Therapist();
        }

    }
}
