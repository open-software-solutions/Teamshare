package synchronization;

import group.GroupService;
import common.Group;

import topology.TopologyService;
import userIO.UserIO;
import change.Change;

public abstract class SynchronizationService {

	SynchronizationStrategy syncStrategy;
	
	/**
	 * The SynchronizationService informs the {@link GroupService} about the group changes it receives.
	 */
	GroupService groupService;
	
	/**
	 * The SynchronizationService needs a list of the online devices and their connectivity information
	 * in order to synchronize changes. It obtains this list from the TopologyService.
	 */
	TopologyService topologyService;

	/**
	 * The SynchronizationService notifies the user about the state of files
	 * (finish synchronizing or not, problems that may occur etc).
	 */
	UserIO userIO;

	/**
	 * Pushes the group change to other online devices in the group.
	 * @param change
	 */
	public abstract void synchronizeGroupChange(Change change);

	/**
	 * Pushes the filesystem change to other online devices in the group.
	 * @param change
	 */
	public abstract void synchornizeFilesystemChange(Change change);

	/**
	 * Pulls all changes (group or filesystem) from other online devices in the given group.
	 * @param group
	 */
	public abstract void pullChanges(Group group);
}
