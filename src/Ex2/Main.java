package Ex2;

public class Main {
    public static void main(String[] args) {
        TreatmentPlan tp = new TreatmentPlan(2);
        Patient patient = new Patient(tp);
        patient.doctor.cure();
    }
}
