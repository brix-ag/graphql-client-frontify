package ch.brix.gql.client.frontify.input_objects;

public class AssetQueryInFolderInput extends ch.brix.gql.client.InputObject {
  /**
   * `Folder` Id.
   */
  public AssetQueryInFolderInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
