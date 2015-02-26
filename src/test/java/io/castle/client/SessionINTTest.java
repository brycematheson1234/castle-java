package io.castle.client;

import io.castle.client.objects.Session;
import io.castle.client.objects.SessionCollection;
import io.castle.client.utils.CastleJWT;
import org.junit.Test;

import static org.junit.Assert.*;

public class SessionINTTest extends GenericINTTest {

    @Test
    public void createSession() {
	Session session = Session.setUserInfoHeaders(userHeader).create(testUser);
	assertNotNull(session.getContext());
	CastleJWT jwt = session.getJWT();
	assertFalse(jwt.hasExpired());
	assertTrue(jwt.isValid());
    }

    @Test
    public void deleteSession() {
	Session session = Session.setUserInfoHeaders(userHeader).create(testUser);
	assertNotNull(session.getContext());
	CastleJWT jwt = session.getJWT();
	assertFalse(jwt.hasExpired());
	assertTrue(jwt.isValid());
	Session found = Session.setUserInfoHeaders(userHeader).find(session.getId(), testUser);
	assertNotNull(found);
	jwt = found.getJWT();
	assertFalse(jwt.hasExpired());
	assertTrue(jwt.isValid());
	Session.setUserInfoHeaders(userHeader).delete(testUser, session);
	found = Session.setUserInfoHeaders(userHeader).find(session.getId(), testUser);
	assertNull(found);
    }

    @Test
    public void listSessions() {
	Session.create(testUser);
	SessionCollection sessions = Session.setUserInfoHeaders(userHeader).listSessions(testUser);
	assertEquals(1, sessions.getPage().size());
    }

    @Test
    public void deleteAllSessions() {
	Session.setUserInfoHeaders(userHeader).create(testUser);
	Session.setUserInfoHeaders(userHeader).create(testUser);
	SessionCollection sessions = Session.setUserInfoHeaders(userHeader).listSessions(testUser);
	assertEquals(2, sessions.getPage().size());
	Session.setUserInfoHeaders(userHeader).deleteAllSessions(testUser);
	sessions = Session.setUserInfoHeaders(userHeader).listSessions(testUser);
	assertEquals(0, sessions.getPage().size());
    }

}


