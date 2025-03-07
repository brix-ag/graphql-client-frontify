package ch.brix.gql.client.frontify.input_objects;

public class UpdateFolderInput extends ch.brix.gql.client.InputObject {
  /**
   * `Folder` Id.
   */
  public UpdateFolderInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `Folder` data.
   */
  public UpdateFolderInput data(ch.brix.gql.client.frontify.input_objects.UpdateFolderDataInput v) {
    values.put("data", v);
    return this;
  }
}
