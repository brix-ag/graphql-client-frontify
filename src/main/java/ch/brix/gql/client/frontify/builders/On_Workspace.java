package ch.brix.gql.client.frontify.builders;

public class On_Workspace extends ch.brix.gql.client.TypeBuilder {
  public On_Workspace() {
    super(new ch.brix.gql.client.On("Workspace"));
  }
  /**
   * `Library`/`Workspace` Id.
   */
  public On_Workspace id() {
    _add_field("id");
    return this;
  }
  /**
   * `Library`/`Workspace` name.
   */
  public On_Workspace name() {
    _add_field("name");
    return this;
  }
  /**
   * `Library`/`Workspace` color.
   */
  public On_Workspace color(Workspace_color callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Amount of `Assets` contained in the `Library`/`Workspace`. This field will be removed. Use `assets`.`total` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `assets`.`total` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Workspace assetCount() {
    _add_field("assetCount");
    return this;
  }
  /**
   * Search or list `Assets` in the `Library`/`Workspace`.
   */
  public On_Workspace assets(Workspace_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library`/`Workspace` `License` items list.
   */
  public On_Workspace licenses(Workspace_licenses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `Library`/`Workspace` `MetadataField` items list. This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Workspace metadataFields(Workspace_metadataFields callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `Workflow` belonging to the given `Library`/`Workspace`.
   */
  public On_Workspace workflow(Workspace_workflow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Browse the `Workspace`'s `SubFolderItems` and `AssetItems`.
   */
  public On_Workspace browse(Workspace_browse callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Workspace` collaborators.
   */
  public On_Workspace collaborators(Workspace_collaborators callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Workspace` permissions of the current `User`.
   */
  public On_Workspace currentUserPermissions(Workspace_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `Workspace` state.
   */
  public On_Workspace isArchived() {
    _add_field("isArchived");
    return this;
  }
  /**
   * List of `CustomMetadataProperty` items and values associated to `Workspace`.
   */
  public On_Workspace customMetadata(Workspace_customMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
