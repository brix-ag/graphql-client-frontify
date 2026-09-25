package ch.brix.gql.client.frontify.builders;

public class On_Library extends ch.brix.gql.client.TypeBuilder {
  public On_Library() {
    super(new ch.brix.gql.client.On("Library"));
  }
  /**
   * `Library` Id.
   */
  public On_Library id() {
    _add_field("id");
    return this;
  }
  /**
   * `Library` name.
   */
  public On_Library name() {
    _add_field("name");
    return this;
  }
  /**
   * `Library` color.
   */
  public On_Library color(Library_color callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Amount of `Assets` contained in this `Library`. This field will be removed. Use `assets.total` instead. | Date: 2024-07-01
   * This field will be removed. Use `assets.total` instead. | Date: 2024-07-01
   */
  @java.lang.Deprecated
  public On_Library assetCount() {
    _add_field("assetCount");
    return this;
  }
  /**
   * **DEPRECATED** Retrieve list of all `MetadataFields` belonging to this `Library`. This field will be removed. Use `customMetadataProperties` instead. | Date: 2026-07-01
   * This field will be removed. Use `customMetadataProperties` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public On_Library metadataFields(Library_metadataFields callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Search or list `Assets` in this `Library`.
   */
  public On_Library assets(Library_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List `Collection` type items within a `Library`.
   */
  public On_Library collections(Library_collections callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Browse the `Library`'s `SubFolderItems` and `AssetItems`.
   */
  public On_Library browse(Library_browse callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` collaborators.
   */
  public On_Library collaborators(Library_collaborators callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Check current `User` permissions in a specific `Library`.
   */
  public On_Library currentUserPermissions(Library_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `Workflow` belonging to the given `Library`.
   */
  public On_Library workflow(Library_workflow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items belonging to a `Library`.
   */
  public On_Library customMetadataProperties(Library_customMetadataProperties callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Search this `Library`'s/`Workspace`'s `Assets` with fully typed filters. Backed by our search index rather than the primary database — results are eventually consistent, so an asset just created, edited, or deleted can take a few minutes (up to around 10) to be reflected.
   */
  public On_Library searchAssets(Library_searchAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Fetch `Assets` in this `Library` by their externalId. Requires edit access to the `Library`.
   */
  public On_Library assetsByExternalId(Library_assetsByExternalId callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve list of all `Licenses` belonging to this `Library`.
   */
  public On_Library licenses(Library_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
