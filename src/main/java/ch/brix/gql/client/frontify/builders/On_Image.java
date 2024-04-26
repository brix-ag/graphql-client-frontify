package ch.brix.gql.client.frontify.builders;

public class On_Image extends ch.brix.gql.client.TypeBuilder {
  public On_Image() {
    super(new ch.brix.gql.client.On("Image"));
  }
  /**
   * `Asset` id.
   */
  public On_Image id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` who created the `Asset`.
   */
  public On_Image creator(Image_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` creation.
   */
  public On_Image createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `Asset`.
   */
  public On_Image modifier(Image_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` last modification.
   */
  public On_Image modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * Title of the `Asset`.
   */
  public On_Image title() {
    _add_field("title");
    return this;
  }
  /**
   * Description of the `Asset`.
   */
  public On_Image description() {
    _add_field("description");
    return this;
  }
  /**
   * `Attachment` items linked to `Asset`.
   */
  public On_Image attachments(Image_attachments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * External Id of the `Asset`.
   */
  public On_Image externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * List of `Tag` items linked to `Asset`
   */
  public On_Image tags(Image_tags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `MetadataValue` items linked to `Asset`. This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Image metadataValues(Image_metadataValues callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `ExternalProduct` items linked to `Asset`.
   */
  public On_Image externalProducts(Image_externalProducts callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` copyright details.
   */
  public On_Image copyright(Image_copyright callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` expiry date.
   */
  public On_Image expiresAt() {
    _add_field("expiresAt");
    return this;
  }
  /**
   * `License` items linked to `Asset`.
   */
  public On_Image licenses(Image_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  public On_Image author() {
    _add_field("author");
    return this;
  }
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  public On_Image status() {
    _add_field("status");
    return this;
  }
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  public On_Image relatedAssets(Image_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  public On_Image comments(Image_comments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Current `User` `Asset` permissions.
   */
  public On_Image currentUserPermissions(Image_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  public On_Image customMetadata(Image_customMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  public On_Image workflowTask(Image_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Original filename of the `Asset` `File`.
   */
  public On_Image filename() {
    _add_field("filename");
    return this;
  }
  /**
   * Size of the `Asset` `File` in bytes.
   */
  public On_Image size() {
    _add_field("size");
    return this;
  }
  /**
   * Extension of the `Asset` `File`.
   */
  public On_Image extension() {
    _add_field("extension");
    return this;
  }
  /**
   * Preview `Url` which has optional `width` and `height` URL parameters. If parameters are not specified, `Url` without any URL parameters will be returned.
   */
  public On_Image previewUrl(Image_previewUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Provides a `Url` for the custom user defined thumbnail or a system generated one when possible.
   */
  public On_Image thumbnailUrl() {
    _add_field("thumbnailUrl");
    return this;
  }
  /**
   * Signed `Url` to download the original `Image` type file.
   */
  public On_Image downloadUrl(Image_downloadUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Image` focal point position. Example: `[0.4803, 0.4340]`.
   */
  public On_Image focalPoint() {
    _add_field("focalPoint");
    return this;
  }
  /**
   * `Image` width in pixels.
   */
  public On_Image width() {
    _add_field("width");
    return this;
  }
  /**
   * `Image` height in pixels.
   */
  public On_Image height() {
    _add_field("height");
    return this;
  }
}
