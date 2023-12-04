package ch.brix.gql.client.frontify.input_objects;

public class MoveFoldersInput extends ch.brix.gql.client.InputObject {
  /**
   * Ids of the `Folder` items to be moved.
   */
  public MoveFoldersInput folderIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("folderIds", v);
    return this;
  }
  /**
   * Id of the destination entity where `Folder` items should be moved to. Allows `Library`/`Workspace`/`Folder` Ids only.
   */
  public MoveFoldersInput destinationId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("destinationId", v);
    return this;
  }
}
