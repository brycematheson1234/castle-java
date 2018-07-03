package io.castle.client.model;

/**
 * Action that needs to be taken after a login attempt.
 * <p>
 * See the documentation for the semantics of each case.
 * It can be null.
 *
 * @see <a href="https://castle.io/docs/authentication">Adaptive authentication</a>
 */
public class AuthenticateAction {
    public static final String ALLOW = "ALLOW";
    public static final String DENY = "DENY";
    public static final String CHALLENGE = "CHALLENGE";

    /**
     * Returns an AuthenticateAction from a string representing its name.
     *
     * @param action string representing the name of the AuthenticateAction, case-insensitive
     * @return the enum value matching the name, or null if it does not match any enum
     */
    public static String fromAction(String action) {
        if (action == null) {
            return null;
        }
        if (action.compareToIgnoreCase(ALLOW) == 0) {
            return ALLOW;
        }
        if (action.compareToIgnoreCase(DENY) == 0) {
            return DENY;
        }
        if (action.compareToIgnoreCase(CHALLENGE) == 0) {
            return CHALLENGE;
        }
        return null;
    }

}
