package org.pentaho.di.ui.repository.pur.services;

import java.util.List;

import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.repository.IRepositoryService;
import org.pentaho.di.repository.ObjectId;
import org.pentaho.di.repository.RepositoryElement;
/**
 * Repository Service used to add a trash bin feature to the repository
 * @author mlowery
 *
 */

public interface ITrashService extends IRepositoryService {

  /**
   * Delete the list of files matching ids 
   * @param ids
   * @throws KettleException if something bad happens
   */
  void delete(final List<ObjectId> ids) throws KettleException;

  /**
   * Un deletes the list of files matching the ids
   * @param ids
   * @throws KettleException
   */
  void undelete(final List<ObjectId> ids) throws KettleException;

  /**
   * Retrieves the current trash items for the user
   * @return
   * @throws KettleException
   */
  List<RepositoryElement> getTrash() throws KettleException;
}