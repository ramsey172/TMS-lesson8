package Ex2;

public class Main {
    public static void main(String[] args) {
        TreatmentPlan tp = new TreatmentPlan(1);
        Patient patient = new Patient(tp);
        Doctor doctor = patient.getDoctor();
        doctor.cure();
    }

}
