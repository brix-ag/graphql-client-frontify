package ch.brix.gql.client.frontify.builders;

public class On_LogoLibrary extends ch.brix.gql.client.TypeBuilder {
  public On_LogoLibrary() {
    super(new ch.brix.gql.client.On("LogoLibrary"));
  }
  /**
   * `Library`/`Workspace` Id.
   */
  public On_LogoLibrary id() {
    _add_field("id");
    return this;
  }
  /**
   * `Library`/`Workspace` name.
   */
  public On_LogoLibrary name() {
    _add_field("name");
    return this;
  }
  /**
   * `Library`/`Workspace` color.
   */
  public On_LogoLibrary color(LogoLibrary_color callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Amount of `Assets` contained in the `Library`/`Workspace`. This field will be removed. Use `assets`.`total` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `assets`.`total` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_LogoLibrary assetCount() {
    _add_field("assetCount");
    return this;
  }
  /**
   * Search or list `Assets` in the `Library`/`Workspace`.
   */
  public On_LogoLibrary assets(LogoLibrary_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library`/`Workspace` `License` items list.
   */
  public On_LogoLibrary licenses(LogoLibrary_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `Library`/`Workspace` `MetadataField` items list. This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_LogoLibrary metadataFields(LogoLibrary_metadataFields callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `Workflow` belonging to the given `Library`/`Workspace`.
   */
  public On_LogoLibrary workflow(LogoLibrary_workflow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Browse the `Library` `SubFolderItems` and `AssetItems`.
   */
  public On_LogoLibrary browse(LogoLibrary_browse callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` collaborators.
   */
  public On_LogoLibrary collaborators(LogoLibrary_collaborators callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` permissions of the current `User`.
   */
  public On_LogoLibrary currentUserPermissions(LogoLibrary_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve list of all `CustomMetadataProperty` items belonging to `Library`.
   */
  public On_LogoLibrary customMetadataProperties(LogoLibrary_customMetadataProperties callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` `Collection` items list.
   */
  public On_LogoLibrary collections(LogoLibrary_collections callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
