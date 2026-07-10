package ch.brix.gql.client.frontify.input_objects;

public class DeleteAssetVariantInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id of the `AssetVariant` to delete.
   */
  public DeleteAssetVariantInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * Key of the `AssetVariant` to delete. Composed of the color space and the file extension. Examples: RGB:JPG, CMYK:SVG.
   */
  public DeleteAssetVariantInput key(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("key", v);
    return this;
  }
}
