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
    public static final String ALLOW = "allow";
    public static final String DENY = "deny";
    public static final String CHALLENGE = "challenge";
}
