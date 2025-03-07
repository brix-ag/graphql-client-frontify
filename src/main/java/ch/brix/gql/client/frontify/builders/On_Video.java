package ch.brix.gql.client.frontify.builders;

public class On_Video extends ch.brix.gql.client.TypeBuilder {
  public On_Video() {
    super(new ch.brix.gql.client.On("Video"));
  }
  /**
   * `Asset` id.
   */
  public On_Video id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` who created the `Asset`.
   */
  public On_Video creator(Video_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` creation.
   */
  public On_Video createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `Asset`.
   */
  public On_Video modifier(Video_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` last modification.
   */
  public On_Video modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * Title of the `Asset`.
   */
  public On_Video title() {
    _add_field("title");
    return this;
  }
  /**
   * Description of the `Asset`.
   */
  public On_Video description() {
    _add_field("description");
    return this;
  }
  /**
   * **BETA** Alternative text for the `Asset`. Used by screen readers when the asset is not decorative.
   */
  public On_Video alternativeText() {
    _add_field("alternativeText");
    return this;
  }
  /**
   * **BETA** Indicates whether the `Asset` is decorative and not meant to be read by screen readers. If true, alternative text is ignored.
   */
  public On_Video isDecorative() {
    _add_field("isDecorative");
    return this;
  }
  /**
   * `Attachment` items linked to `Asset`.
   */
  public On_Video attachments(Video_attachments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * External Id of the `Asset`.
   */
  public On_Video externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * List of `Tag` items linked to `Asset`
   */
  public On_Video tags(Video_tags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `MetadataValue` items linked to `Asset`. This field will be removed. Use `customMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Video metadataValues(Video_metadataValues callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `ExternalProduct` items linked to `Asset`. This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Video externalProducts(Video_externalProducts callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` copyright details.
   */
  public On_Video copyright(Video_copyright callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `Asset` will be available only during the defined `DateTime` range.When `null` it represents an unspecified start and/or open-ended date.
   */
  public On_Video availability(Video_availability callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` available until date.
   */
  public On_Video expiresAt() {
    _add_field("expiresAt");
    return this;
  }
  /**
   * `License` items linked to `Asset`.
   */
  public On_Video licenses(Video_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  public On_Video author() {
    _add_field("author");
    return this;
  }
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  public On_Video status() {
    _add_field("status");
    return this;
  }
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  public On_Video relatedAssets(Video_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  public On_Video comments(Video_comments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Current `User` `Asset` permissions.
   */
  public On_Video currentUserPermissions(Video_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  public On_Video customMetadata(Video_customMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  public On_Video workflowTask(Video_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Location` of the `Asset`.
   */
  public On_Video location(Video_location callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Background color of the `Asset` preview.
   */
  public On_Video previewBackgroundColor(Video_previewBackgroundColor callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Original filename of the `Asset` `File`.
   */
  public On_Video filename() {
    _add_field("filename");
    return this;
  }
  /**
   * Size of the `Asset` `File` in bytes.
   */
  public On_Video size() {
    _add_field("size");
    return this;
  }
  /**
   * Extension of the `Asset` `File`.
   */
  public On_Video extension() {
    _add_field("extension");
    return this;
  }
  /**
   * Preview `Url` of converted `Video` in mp4 format.
   */
  public On_Video previewUrl(Video_previewUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Provides a `Url` for the custom user defined thumbnail or a system generated one when possible.
   */
  public On_Video thumbnailUrl() {
    _add_field("thumbnailUrl");
    return this;
  }
  /**
   * Signed `Url` to download the original `Video` type file.
   */
  public On_Video downloadUrl(Video_downloadUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Video` width in pixels.
   */
  public On_Video width() {
    _add_field("width");
    return this;
  }
  /**
   * `Video` height in pixels.
   */
  public On_Video height() {
    _add_field("height");
    return this;
  }
  /**
   * `Video` duration in seconds.
   */
  public On_Video duration() {
    _add_field("duration");
    return this;
  }
  /**
   * `Video` bitrate in bits per second.
   */
  public On_Video bitrate() {
    _add_field("bitrate");
    return this;
  }
}
