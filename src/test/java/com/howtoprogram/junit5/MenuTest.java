package com.howtoprogram.junit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import com.howtoprogram.junit5.Services.Election;
import com.howtoprogram.junit5.Services.IElection;

import Services.ElectionMock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuTest {

	@Test
	void getNameByPArtyTest() {
	IElection election = new ElectionMock();
	
	String candidateNAme= election.getCandidateNameByParty("Axity");
	int numOfVotes= election.getNumberOfVotesByParty("Axity");
	System.out.println(String.format("Name: %s - Votes: %d", candidateNAme, numOfVotes));
	assertEquals("Elmer Homero", candidateNAme);
	assertEquals( 10, numOfVotes);

	} 
	@Test
	void getNameByPArtyTestMockito() {
	IElection election = mock(Election.class);
	when (election.getCandidateNameByParty("Otra cosa")).thenReturn("Arturo");
	when (election.getCandidateNameByParty("")).thenReturn("0");

	String candidateNAme= election.getCandidateNameByParty("Otra cosa");
	int numOfVotes= election.getNumberOfVotesByParty("");
	System.out.println(String.format("Name: %s - Votes: %d", candidateNAme, numOfVotes));
	assertEquals("Arturo", candidateNAme);
	assertEquals( 0, numOfVotes);
	}
}
