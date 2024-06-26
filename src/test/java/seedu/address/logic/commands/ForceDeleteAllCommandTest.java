package seedu.address.logic.commands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalPatients.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.PatientList;
import seedu.address.model.UserPrefs;

/**
 * Contains integration and unit tests for DeleteAllCommand.
 */
public class ForceDeleteAllCommandTest {
    /**
     * Tests when PatientList is empty.
     */
    @Test
    public void execute_emptyAddressBook_success() {
        Model model = new ModelManager();
        Model expectedModel = new ModelManager();

        assertCommandSuccess(new ForceDeleteAllCommand(), model, ForceDeleteAllCommand.MESSAGE_SUCCESS, expectedModel);
    }

    /**
     * Tests when PatientList is not empty.
     */
    @Test
    public void execute_nonEmptyAddressBook_success() {
        Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
        Model expectedModel = new ModelManager(getTypicalAddressBook(), new UserPrefs());
        expectedModel.setPatientList(new PatientList());

        assertCommandSuccess(new ForceDeleteAllCommand(), model, ForceDeleteAllCommand.MESSAGE_SUCCESS, expectedModel);
    }
}
