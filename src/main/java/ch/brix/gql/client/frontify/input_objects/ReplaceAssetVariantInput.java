package ch.brix.gql.client.frontify.input_objects;

public class ReplaceAssetVariantInput extends ch.brix.gql.client.InputObject {
  /**
   * File Id. Signed Id returned in `uploadFile`.
   */
  public ReplaceAssetVariantInput fileId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("fileId", v);
    return this;
  }
  /**
   * Parent `Asset` Id of the `AssetVariant` to replace. Currently, only `Assets` from Logo and Icon `Library` type are supported.
   */
  public ReplaceAssetVariantInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * `AssetVariant` key to replace. Composed of the color space and the file extension. Examples: RGB:JPG, CMYK:SVG
   */
  public ReplaceAssetVariantInput key(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("key", v);
    return this;
  }
}
