package ch.brix.gql.client.frontify.input_objects;

public class UpdateFolderDataInput extends ch.brix.gql.client.InputObject {
  /**
   * `Folder` name or display name.
   */
  public UpdateFolderDataInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * `Folder` description.
   */
  public UpdateFolderDataInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
}
