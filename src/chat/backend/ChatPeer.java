package chat.backend;

import java.net.InetSocketAddress;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Represents a peer in the chat system.
 */
public interface ChatPeer extends Remote {
	/**
	 * Accepts a new peer into a group.
	 *
	 * @param groupName the name of the group.
	 * @param peer      the peer to accept into the group.
	 * @return the group with the new peer accepted, or null if the group doesn't exist.
	 * @throws RemoteException if a remote communication error occurs.
	 */
	Group acceptJoin(String groupName, ChatPeer peer) throws RemoteException;

	/**
	 * Returns the address of this participant.
	 *
	 * @return the address of this participant.
	 * @throws RemoteException if a remote communication error occurs.
	 */
	InetSocketAddress getAddress() throws RemoteException;

	/**
	 * Retrieves the display name of the peer.
	 *
	 * @return the display name of the peer.
	 * @throws RemoteException if a remote communication error occurs.
	 */
	String getDisplayName() throws RemoteException;
}
