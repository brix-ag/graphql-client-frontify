package ch.brix.gql.client.frontify.builders;

public class On_DocumentLibrary extends ch.brix.gql.client.TypeBuilder {
  public On_DocumentLibrary() {
    super(new ch.brix.gql.client.On("DocumentLibrary"));
  }
  /**
   * `Library`/`Workspace` Id.
   */
  public On_DocumentLibrary id() {
    _add_field("id");
    return this;
  }
  /**
   * `Library`/`Workspace` name.
   */
  public On_DocumentLibrary name() {
    _add_field("name");
    return this;
  }
  /**
   * `Library`/`Workspace` color.
   */
  public On_DocumentLibrary color(DocumentLibrary_color callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Amount of `Assets` contained in the `Library`/`Workspace`. This field will be removed. Use `assets`.`total` instead. | Date: 2024-07-01T00:00:00.000+00:00
   * This field will be removed. Use `assets`.`total` instead. | Date: 2024-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_DocumentLibrary assetCount() {
    _add_field("assetCount");
    return this;
  }
  /**
   * Search or list `Assets` in the `Library`/`Workspace`.
   */
  public On_DocumentLibrary assets(DocumentLibrary_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library`/`Workspace` `License` items list.
   */
  public On_DocumentLibrary licenses(DocumentLibrary_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `Library`/`Workspace` `MetadataField` items list. This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_DocumentLibrary metadataFields(DocumentLibrary_metadataFields callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `Workflow` belonging to the given `Library`/`Workspace`.
   */
  public On_DocumentLibrary workflow(DocumentLibrary_workflow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Browse the `Library` `SubFolderItems` and `AssetItems`.
   */
  public On_DocumentLibrary browse(DocumentLibrary_browse callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` collaborators.
   */
  public On_DocumentLibrary collaborators(DocumentLibrary_collaborators callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` permissions of the current `User`.
   */
  public On_DocumentLibrary currentUserPermissions(DocumentLibrary_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve list of all `CustomMetadataProperty` items belonging to `Library`.
   */
  public On_DocumentLibrary customMetadataProperties(DocumentLibrary_customMetadataProperties callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` `Collection` items list.
   */
  public On_DocumentLibrary collections(DocumentLibrary_collections callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
