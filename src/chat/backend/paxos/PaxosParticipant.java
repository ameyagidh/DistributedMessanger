package chat.backend.paxos;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Remote interface for a participant of the Paxos protocol.
 * These methods may be called by other participants during
 * a run of the protocol.
 */
public interface PaxosParticipant extends Remote {
	/**
	 * Run the "prepare" stage of the protocol.
	 *
	 * @param paxosProposal - proposal that is sent for preparation
	 * @return response indicating PROMISED, ACCEPTED, or REJECTED
	 * @throws RemoteException if a communication-related exception occurs
	 */
	PaxosResponse prepare(PaxosProposal paxosProposal) throws RemoteException;

	/**
	 * Run the "accept" stage of the protocol.
	 *
	 * @param paxosProposal - proposal that is sent for acceptance
	 * @return response indicating ACCEPTED or REJECTED
	 * @throws RemoteException if a communication-related exception occurs
	 */
	PaxosResponse accept(PaxosProposal paxosProposal) throws RemoteException;

	/**
	 * Run the "learn" stage of the protocol.
	 *
	 * @param paxosProposal - proposal that is sent for learning
	 * @return response indicating OK or FAILED
	 * @throws RemoteException if a communication-related exception occurs
	 */
	PaxosResponse learn(PaxosProposal paxosProposal) throws RemoteException;
}
