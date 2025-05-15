package ch.brix.gql.client.frontify.builders;

public class On_File extends ch.brix.gql.client.TypeBuilder {
  public On_File() {
    super(new ch.brix.gql.client.On("File"));
  }
  /**
   * `Asset` id.
   */
  public On_File id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` who created the `Asset`.
   */
  public On_File creator(File_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` creation.
   */
  public On_File createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `Asset`.
   */
  public On_File modifier(File_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` last modification.
   */
  public On_File modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * Title of the `Asset`.
   */
  public On_File title() {
    _add_field("title");
    return this;
  }
  /**
   * Description of the `Asset`.
   */
  public On_File description() {
    _add_field("description");
    return this;
  }
  /**
   * Alternative text for the `Asset`. Used by screen readers when the asset is not decorative.
   */
  public On_File alternativeText() {
    _add_field("alternativeText");
    return this;
  }
  /**
   * **BETA** Indicates whether the `Asset` is decorative and not meant to be read by screen readers. If true, alternative text is ignored.
   */
  public On_File isDecorative() {
    _add_field("isDecorative");
    return this;
  }
  /**
   * `Attachment` items linked to `Asset`.
   */
  public On_File attachments(File_attachments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * External Id of the `Asset`.
   */
  public On_File externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * List of `Tag` items linked to `Asset`
   */
  public On_File tags(File_tags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `MetadataValue` items linked to `Asset`. This field will be removed. Use `customMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_File metadataValues(File_metadataValues callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `ExternalProduct` items linked to `Asset`. This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_File externalProducts(File_externalProducts callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` copyright details.
   */
  public On_File copyright(File_copyright callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `Asset` will be available only during the defined `DateTime` range.When `null` it represents an unspecified start and/or open-ended date.
   */
  public On_File availability(File_availability callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` available until date.
   */
  public On_File expiresAt() {
    _add_field("expiresAt");
    return this;
  }
  /**
   * `License` items linked to `Asset`.
   */
  public On_File licenses(File_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  public On_File author() {
    _add_field("author");
    return this;
  }
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  public On_File status() {
    _add_field("status");
    return this;
  }
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  public On_File relatedAssets(File_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  public On_File comments(File_comments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Current `User` `Asset` permissions.
   */
  public On_File currentUserPermissions(File_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  public On_File customMetadata(File_customMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  public On_File workflowTask(File_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Location` of the `Asset`.
   */
  public On_File location(File_location callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Background color of the `Asset` preview.
   */
  public On_File previewBackgroundColor(File_previewBackgroundColor callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Original filename of the `Asset` `File`.
   */
  public On_File filename() {
    _add_field("filename");
    return this;
  }
  /**
   * Size of the `Asset` `File` in bytes.
   */
  public On_File size() {
    _add_field("size");
    return this;
  }
  /**
   * Extension of the `Asset` `File`.
   */
  public On_File extension() {
    _add_field("extension");
    return this;
  }
  /**
   * `DateTime` of the `Asset` `File` creation.
   */
  public On_File fileCreatedAt() {
    _add_field("fileCreatedAt");
    return this;
  }
  /**
   * `File` type icon in `svg` format.
   */
  public On_File previewUrl() {
    _add_field("previewUrl");
    return this;
  }
  /**
   * Provides a `Url` for the custom user defined thumbnail or a system generated one when possible.
   */
  public On_File thumbnailUrl() {
    _add_field("thumbnailUrl");
    return this;
  }
  /**
   * Signed `Url` to download the original `File` type file.
   */
  public On_File downloadUrl(File_downloadUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
