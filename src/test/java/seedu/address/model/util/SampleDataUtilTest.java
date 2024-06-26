package seedu.address.model.util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import seedu.address.model.patient.Patient;

public class SampleDataUtilTest {

    @Test
    public void getSamplePatients_returnsNonEmptyArray() {
        Patient[] patients = SampleDataUtil.getSamplePatients();
        assertTrue(patients.length != 0);
    }
}
