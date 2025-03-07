package ch.brix.gql.client.frontify.builders;

public class On_IconLibrary extends ch.brix.gql.client.TypeBuilder {
  public On_IconLibrary() {
    super(new ch.brix.gql.client.On("IconLibrary"));
  }
  /**
   * `Library`/`Workspace` Id.
   */
  public On_IconLibrary id() {
    _add_field("id");
    return this;
  }
  /**
   * `Library`/`Workspace` name.
   */
  public On_IconLibrary name() {
    _add_field("name");
    return this;
  }
  /**
   * `Library`/`Workspace` color.
   */
  public On_IconLibrary color(IconLibrary_color callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Amount of `Assets` contained in the `Library`/`Workspace`. This field will be removed. Use `assets`.`total` instead. | Date: 2024-07-01T00:00:00.000+00:00
   * This field will be removed. Use `assets`.`total` instead. | Date: 2024-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_IconLibrary assetCount() {
    _add_field("assetCount");
    return this;
  }
  /**
   * Search or list `Assets` in the `Library`/`Workspace`.
   */
  public On_IconLibrary assets(IconLibrary_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library`/`Workspace` `License` items list.
   */
  public On_IconLibrary licenses(IconLibrary_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `Library`/`Workspace` `MetadataField` items list. This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_IconLibrary metadataFields(IconLibrary_metadataFields callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `Workflow` belonging to the given `Library`/`Workspace`.
   */
  public On_IconLibrary workflow(IconLibrary_workflow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Browse the `Library` `SubFolderItems` and `AssetItems`.
   */
  public On_IconLibrary browse(IconLibrary_browse callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` collaborators.
   */
  public On_IconLibrary collaborators(IconLibrary_collaborators callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` permissions of the current `User`.
   */
  public On_IconLibrary currentUserPermissions(IconLibrary_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve list of all `CustomMetadataProperty` items belonging to `Library`.
   */
  public On_IconLibrary customMetadataProperties(IconLibrary_customMetadataProperties callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` `Collection` items list.
   */
  public On_IconLibrary collections(IconLibrary_collections callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
