package ch.brix.gql.client.frontify.builders;

public class On_Document extends ch.brix.gql.client.TypeBuilder {
  public On_Document() {
    super(new ch.brix.gql.client.On("Document"));
  }
  /**
   * `Asset` id.
   */
  public On_Document id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` who created the `Asset`.
   */
  public On_Document creator(Document_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` creation.
   */
  public On_Document createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `Asset`.
   */
  public On_Document modifier(Document_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` last modification.
   */
  public On_Document modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * Title of the `Asset`.
   */
  public On_Document title() {
    _add_field("title");
    return this;
  }
  /**
   * Description of the `Asset`.
   */
  public On_Document description() {
    _add_field("description");
    return this;
  }
  /**
   * **BETA** Alternative text for the `Asset`. Used by screen readers when the asset is not decorative.
   */
  public On_Document alternativeText() {
    _add_field("alternativeText");
    return this;
  }
  /**
   * **BETA** Indicates whether the `Asset` is decorative and not meant to be read by screen readers. If true, alternative text is ignored.
   */
  public On_Document isDecorative() {
    _add_field("isDecorative");
    return this;
  }
  /**
   * `Attachment` items linked to `Asset`.
   */
  public On_Document attachments(Document_attachments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * External Id of the `Asset`.
   */
  public On_Document externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * List of `Tag` items linked to `Asset`
   */
  public On_Document tags(Document_tags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `MetadataValue` items linked to `Asset`. This field will be removed. Use `customMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Document metadataValues(Document_metadataValues callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `ExternalProduct` items linked to `Asset`. This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Document externalProducts(Document_externalProducts callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` copyright details.
   */
  public On_Document copyright(Document_copyright callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `Asset` will be available only during the defined `DateTime` range.When `null` it represents an unspecified start and/or open-ended date.
   */
  public On_Document availability(Document_availability callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` available until date.
   */
  public On_Document expiresAt() {
    _add_field("expiresAt");
    return this;
  }
  /**
   * `License` items linked to `Asset`.
   */
  public On_Document licenses(Document_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  public On_Document author() {
    _add_field("author");
    return this;
  }
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  public On_Document status() {
    _add_field("status");
    return this;
  }
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  public On_Document relatedAssets(Document_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  public On_Document comments(Document_comments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Current `User` `Asset` permissions.
   */
  public On_Document currentUserPermissions(Document_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  public On_Document customMetadata(Document_customMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  public On_Document workflowTask(Document_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Location` of the `Asset`.
   */
  public On_Document location(Document_location callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Background color of the `Asset` preview.
   */
  public On_Document previewBackgroundColor(Document_previewBackgroundColor callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Original filename of the `Asset` `File`.
   */
  public On_Document filename() {
    _add_field("filename");
    return this;
  }
  /**
   * Size of the `Asset` `File` in bytes.
   */
  public On_Document size() {
    _add_field("size");
    return this;
  }
  /**
   * Extension of the `Asset` `File`.
   */
  public On_Document extension() {
    _add_field("extension");
    return this;
  }
  /**
   * Preview `Url` which has optional `width`, `height` and `page` arguments. If parameters are not specified, a `Url` without any parameters will be returned.
   */
  public On_Document previewUrl(Document_previewUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Provides a `Url` for the custom user defined thumbnail or a system generated one when possible.
   */
  public On_Document thumbnailUrl() {
    _add_field("thumbnailUrl");
    return this;
  }
  /**
   * Signed `Url` to download the original `Document` type file.
   */
  public On_Document downloadUrl(Document_downloadUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Document` focal point position. Example: `[0.4803, 0.4340]`.
   */
  public On_Document focalPoint() {
    _add_field("focalPoint");
    return this;
  }
  /**
   * `Document` width in pixels.
   */
  public On_Document width() {
    _add_field("width");
    return this;
  }
  /**
   * `Document` height in pixels.
   */
  public On_Document height() {
    _add_field("height");
    return this;
  }
  /**
   * `Document` total number of pages.
   */
  public On_Document pageCount() {
    _add_field("pageCount");
    return this;
  }
}
