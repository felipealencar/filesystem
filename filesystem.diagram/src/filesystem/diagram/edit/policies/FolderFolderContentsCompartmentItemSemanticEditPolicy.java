/*
 * 
 */
package filesystem.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import filesystem.diagram.edit.commands.Drive2CreateCommand;
import filesystem.diagram.edit.commands.FileCreateCommand;
import filesystem.diagram.edit.commands.FolderCreateCommand;
import filesystem.diagram.edit.commands.ShortcutCreateCommand;
import filesystem.diagram.providers.FilesystemElementTypes;

/**
 * @generated
 */
public class FolderFolderContentsCompartmentItemSemanticEditPolicy extends
		FilesystemBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FolderFolderContentsCompartmentItemSemanticEditPolicy() {
		super(FilesystemElementTypes.Folder_3009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FilesystemElementTypes.Drive_3008 == req.getElementType()) {
			return getGEFWrapper(new Drive2CreateCommand(req));
		}
		if (FilesystemElementTypes.Folder_3009 == req.getElementType()) {
			return getGEFWrapper(new FolderCreateCommand(req));
		}
		if (FilesystemElementTypes.Shortcut_3007 == req.getElementType()) {
			return getGEFWrapper(new ShortcutCreateCommand(req));
		}
		if (FilesystemElementTypes.File_3004 == req.getElementType()) {
			return getGEFWrapper(new FileCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
