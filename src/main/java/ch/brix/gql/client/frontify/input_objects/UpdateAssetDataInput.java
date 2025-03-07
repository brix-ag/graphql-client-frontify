package ch.brix.gql.client.frontify.input_objects;

public class UpdateAssetDataInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` title or display name.
   */
  public UpdateAssetDataInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** Alternative text for the `Asset`. Used by screen readers when the asset is not decorative.
   */
  public UpdateAssetDataInput alternativeText(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("alternativeText", v);
    return this;
  }
  /**
   * **BETA** Indicates whether the `Asset` is decorative and not meant to be read by screen readers. If true, alternative text is ignored.
   */
  public UpdateAssetDataInput isDecorative(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isDecorative", v);
    return this;
  }
  /**
   * `Asset` filename, including extension.
   */
  public UpdateAssetDataInput filename(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("filename", v);
    return this;
  }
  /**
   * `Asset` description.
   */
  public UpdateAssetDataInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
  /**
   * Change `Asset` copyright details.
   */
  public UpdateAssetDataInput copyright(ch.brix.gql.client.frontify.input_objects.UpdateCopyrightInput v) {
    values.put("copyright", v);
    return this;
  }
  /**
   * Modify expiry date. `Asset` will expire once the defined date is reached.
   */
  public UpdateAssetDataInput expiresAt(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("expiresAt", v);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  public UpdateAssetDataInput author(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("author", v);
    return this;
  }
  /**
   * **BETA** Background color of the `Asset` preview.
   */
  public UpdateAssetDataInput previewBackgroundColor(ch.brix.gql.client.frontify.input_objects.RgbaColorInput v) {
    values.put("previewBackgroundColor", v);
    return this;
  }
}
