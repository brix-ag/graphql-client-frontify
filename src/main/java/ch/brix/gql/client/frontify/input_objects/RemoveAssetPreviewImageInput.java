package ch.brix.gql.client.frontify.input_objects;

public class RemoveAssetPreviewImageInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public RemoveAssetPreviewImageInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
