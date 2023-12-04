package ch.brix.gql.client.frontify.input_objects;

public class ReplaceAssetInput extends ch.brix.gql.client.InputObject {
  /**
   * Parent `Asset` Id.
   */
  public ReplaceAssetInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * Signed file Id returned in `uploadFile`.
   */
  public ReplaceAssetInput fileId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("fileId", v);
    return this;
  }
}
