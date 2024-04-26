package ch.brix.gql.client.frontify.builders;

public class On_Audio extends ch.brix.gql.client.TypeBuilder {
  public On_Audio() {
    super(new ch.brix.gql.client.On("Audio"));
  }
  /**
   * `Asset` id.
   */
  public On_Audio id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` who created the `Asset`.
   */
  public On_Audio creator(Audio_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` creation.
   */
  public On_Audio createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `Asset`.
   */
  public On_Audio modifier(Audio_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` last modification.
   */
  public On_Audio modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * Title of the `Asset`.
   */
  public On_Audio title() {
    _add_field("title");
    return this;
  }
  /**
   * Description of the `Asset`.
   */
  public On_Audio description() {
    _add_field("description");
    return this;
  }
  /**
   * `Attachment` items linked to `Asset`.
   */
  public On_Audio attachments(Audio_attachments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * External Id of the `Asset`.
   */
  public On_Audio externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * List of `Tag` items linked to `Asset`
   */
  public On_Audio tags(Audio_tags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `MetadataValue` items linked to `Asset`. This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Audio metadataValues(Audio_metadataValues callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `ExternalProduct` items linked to `Asset`.
   */
  public On_Audio externalProducts(Audio_externalProducts callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` copyright details.
   */
  public On_Audio copyright(Audio_copyright callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` expiry date.
   */
  public On_Audio expiresAt() {
    _add_field("expiresAt");
    return this;
  }
  /**
   * `License` items linked to `Asset`.
   */
  public On_Audio licenses(Audio_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  public On_Audio author() {
    _add_field("author");
    return this;
  }
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  public On_Audio status() {
    _add_field("status");
    return this;
  }
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  public On_Audio relatedAssets(Audio_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  public On_Audio comments(Audio_comments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Current `User` `Asset` permissions.
   */
  public On_Audio currentUserPermissions(Audio_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  public On_Audio customMetadata(Audio_customMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  public On_Audio workflowTask(Audio_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Original filename of the `Asset` `File`.
   */
  public On_Audio filename() {
    _add_field("filename");
    return this;
  }
  /**
   * Size of the `Asset` `File` in bytes.
   */
  public On_Audio size() {
    _add_field("size");
    return this;
  }
  /**
   * Extension of the `Asset` `File`.
   */
  public On_Audio extension() {
    _add_field("extension");
    return this;
  }
  /**
   * Signed `Url` to download the original `Audio` type file.
   */
  public On_Audio downloadUrl(Audio_downloadUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Preview `Url` of converted `Audio` file in mp3 format.
   */
  public On_Audio previewUrl(Audio_previewUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Provides a `Url` for the custom user defined thumbnail or a system generated one when possible.
   */
  public On_Audio thumbnailUrl() {
    _add_field("thumbnailUrl");
    return this;
  }
}
