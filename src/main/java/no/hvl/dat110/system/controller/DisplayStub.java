package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) {

		// implement marshalling, call and unmarshalling for write RPC method

		// prepare request
		byte[] request = RPCUtils.marshallString(message);

		// call on RPC client and store response
		byte [] response = rpcclient.call((byte)Common.WRITE_RPCID, request);

		// unmarshall the response, in this case - it is nothing
		RPCUtils.unmarshallVoid(response);
	}
}
