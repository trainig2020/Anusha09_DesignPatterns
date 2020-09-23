package io.anusha.statepattern.remote;

import io.anusha.statepattern.State;
import io.anusha.statepattern.TVContext;
import io.anusha.statepattern.TVStartState;
import io.anusha.statepattern.TVStopState;

public class TVRemote {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

	}

}
