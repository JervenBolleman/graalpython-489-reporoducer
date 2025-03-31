package org.test;


import static org.junit.Assert.assertTrue;

import org.junit.Test;




public class SparqlInRdfPythonTest {

	@Test
	public void testFails() {
		assertTrue(GraalPy.testFailing());
	}
	
	@Test
	public void testPassing() {
		assertTrue(GraalPy.testPassing());
	}
}
