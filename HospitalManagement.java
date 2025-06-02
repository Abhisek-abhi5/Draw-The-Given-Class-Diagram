
import java.util.*;

class Hospital {
    private String name;
    private List<Patient> patients = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();
    private List<Treatment> treatments = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addStaff(Staff s) {
        staffMembers.add(s);
    }

    public void addTreatment(Treatment t) {
        treatments.add(t);
    }
}

class Patient {
    private int patientId;
    private String name;
    private String diagnosis;

    public Patient(int id, String name) {
        this.patientId = id;
        this.name = name;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}

class Staff {
    private int staffId;
    private String name;
    private String role;

    public Staff(int id, String name, String role) {
        this.staffId = id;
        this.name = name;
        this.role = role;
    }
}

class Treatment {
    private int treatmentId;
    private String description;
    private Patient patient;
    private Staff doctor;

    public Treatment(int id, String description, Patient patient, Staff doctor) {
        this.treatmentId = id;
        this.description = description;
        this.patient = patient;
        this.doctor = doctor;
    }
}
