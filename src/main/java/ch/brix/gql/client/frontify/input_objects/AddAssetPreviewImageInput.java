package ch.brix.gql.client.frontify.input_objects;

public class AddAssetPreviewImageInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public AddAssetPreviewImageInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * `File` Id. Signed Id returned by `uploadFile` mutation.
   */
  public AddAssetPreviewImageInput fileId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("fileId", v);
    return this;
  }
}
