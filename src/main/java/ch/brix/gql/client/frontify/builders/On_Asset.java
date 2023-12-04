package ch.brix.gql.client.frontify.builders;

public class On_Asset extends ch.brix.gql.client.TypeBuilder {
  public On_Asset() {
    super(new ch.brix.gql.client.On("Asset"));
  }
  /**
   * `Asset` id.
   */
  public On_Asset id() {
    _add_field("id");
    return this;
  }
  /**
   * The `creator` is the `User` who created the asset on Frontify.
   */
  public On_Asset creator(Asset_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * DateTime of the `Asset` creation.
   */
  public On_Asset createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `modifier` is the `User` who last modified the asset on Frontify.
   */
  public On_Asset modifier(Asset_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * DateTime of the `Asset`'s last modification.
   */
  public On_Asset modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * Title of the `Asset`.
   */
  public On_Asset title() {
    _add_field("title");
    return this;
  }
  /**
   * Description of the `Asset`.
   */
  public On_Asset description() {
    _add_field("description");
    return this;
  }
  /**
   * List of `Asset`'s `Attachments`.
   */
  public On_Asset attachments(Asset_attachments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * External Id of the `Asset`.
   */
  public On_Asset externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * List of `Asset`'s tags.
   */
  public On_Asset tags(Asset_tags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` copyright details.
   */
  public On_Asset copyright(Asset_copyright callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` expiration date.
   */
  public On_Asset expiresAt() {
    _add_field("expiresAt");
    return this;
  }
  /**
   * List of `Asset`'s licenses.
   */
  public On_Asset licenses(Asset_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Metadata values details. This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadata` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Asset metadataValues(Asset_metadataValues callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Represents the conversion status of the `Asset`. Example: FINISHED.
   */
  public On_Asset status() {
    _add_field("status");
    return this;
  }
  /**
   * Paginated list of `Asset` items related to `Asset`.
   */
  public On_Asset relatedAssets(Asset_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Paginated list of `AssetComment` items for `Asset`.
   */
  public On_Asset comments(Asset_comments callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Asset` permissions of the current `User`.
   */
  public On_Asset currentUserPermissions(Asset_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items and values associated to `Asset`.
   */
  public On_Asset customMetadata(Asset_customMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `WorkflowTask` this `Asset` is linked to.
   */
  public On_Asset workflowTask(Asset_workflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
