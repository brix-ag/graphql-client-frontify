package ch.brix.gql.client.frontify.input_objects;

public class DeleteFoldersInput extends ch.brix.gql.client.InputObject {
  /**
   * Ids of the `Folders` to delete.
   */
  public DeleteFoldersInput ids(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("ids", v);
    return this;
  }
}
