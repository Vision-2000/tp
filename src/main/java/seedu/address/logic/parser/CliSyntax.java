package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_DATEOFBIRTH = new Prefix("b/");
    public static final Prefix PREFIX_SEX = new Prefix("s/");
    public static final Prefix PREFIX_APPOINTMENT = new Prefix("o/");
    public static final Prefix PREFIX_DATE_OF_VISIT = new Prefix("d/");
    public static final Prefix PREFIX_CONDITION = new Prefix("c/");
    public static final Prefix PREFIX_SEVERITY = new Prefix("v/");
}
