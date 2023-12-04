package ch.brix.gql.client.frontify.builders;

public class On_EmbeddedContent extends ch.brix.gql.client.TypeBuilder {
  public On_EmbeddedContent() {
    super(new ch.brix.gql.client.On("EmbeddedContent"));
  }
  /**
   * `Asset` id.
   */
  public On_EmbeddedContent id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` who created the `Asset`.
   */
  public On_EmbeddedContent creator(EmbeddedContent_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` creation.
   */
  public On_EmbeddedContent createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `Asset`.
   */
  public On_EmbeddedContent modifier(EmbeddedContent_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` last modification.
   */
  public On_EmbeddedContent modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * Title of the `Asset`.
   */
  public On_EmbeddedContent title() {
    _add_field("title");
    return this;
  }
  /**
   * Description of the `Asset`.
   */
  public On_EmbeddedContent description() {
    _add_field("description");
    return this;
  }
  /**
   * `Attachment` items linked to `Asset`.
   */
  public On_EmbeddedContent attachments(EmbeddedContent_attachments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * External Id of the `Asset`.
   */
  public On_EmbeddedContent externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * List of `Tag` items linked to `Asset`
   */
  public On_EmbeddedContent tags(EmbeddedContent_tags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `MetadataValue` items linked to `Asset`. This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_EmbeddedContent metadataValues(EmbeddedContent_metadataValues callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `ExternalProduct` items linked to `Asset`.
   */
  public On_EmbeddedContent externalProducts(EmbeddedContent_externalProducts callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` copyright details.
   */
  public On_EmbeddedContent copyright(EmbeddedContent_copyright callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` expiry date.
   */
  public On_EmbeddedContent expiresAt() {
    _add_field("expiresAt");
    return this;
  }
  /**
   * `License` items linked to `Asset`.
   */
  public On_EmbeddedContent licenses(EmbeddedContent_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Represents the Author of the `Asset`. Example: Photographer Name.
   */
  public On_EmbeddedContent author() {
    _add_field("author");
    return this;
  }
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  public On_EmbeddedContent status() {
    _add_field("status");
    return this;
  }
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  public On_EmbeddedContent relatedAssets(EmbeddedContent_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  public On_EmbeddedContent comments(EmbeddedContent_comments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Current `User` `Asset` permissions.
   */
  public On_EmbeddedContent currentUserPermissions(EmbeddedContent_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  public On_EmbeddedContent customMetadata(EmbeddedContent_customMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  public On_EmbeddedContent workflowTask(EmbeddedContent_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Preview of the embedded content. If the preview is not available, an svg icon will be returned.
   */
  public On_EmbeddedContent previewUrl() {
    _add_field("previewUrl");
    return this;
  }
}
