package ch.brix.gql.client.frontify.input_objects;

public class CreateAssetVariantInput extends ch.brix.gql.client.InputObject {
  /**
   * File Id. Signed Id returned in `uploadFile`.
   */
  public CreateAssetVariantInput fileId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("fileId", v);
    return this;
  }
  /**
   * `Asset` Id. Currently, only `Assets` from Logo and Icon `Library` type are supported.
   */
  public CreateAssetVariantInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * `AssetVariant` key composed of the color space and the file extension. Examples: RGB:JPG, CMYK:SVG
   */
  public CreateAssetVariantInput key(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("key", v);
    return this;
  }
}
