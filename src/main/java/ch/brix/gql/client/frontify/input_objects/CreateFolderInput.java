package ch.brix.gql.client.frontify.input_objects;

public class CreateFolderInput extends ch.brix.gql.client.InputObject {
  /**
   * The parent Id of the `Folder` creation destination. Possible identifiers are `Library`/`Workspace` or `Folder`.
   */
  public CreateFolderInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * `Folder` name.
   */
  public CreateFolderInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * `Folder` description.
   */
  public CreateFolderInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
}
