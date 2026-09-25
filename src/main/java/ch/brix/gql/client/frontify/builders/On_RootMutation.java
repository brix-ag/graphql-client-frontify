package ch.brix.gql.client.frontify.builders;

public class On_RootMutation extends ch.brix.gql.client.TypeBuilder {
  public On_RootMutation() {
    super(new ch.brix.gql.client.On("RootMutation"));
  }
  /**
   * **DEPRECATED** Add a new relation between an existing `Asset` and an existing `MetadataField` with its value. The value will be automatically created and linked to its `MetadataField`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`. This field will be removed. Use `addCustomMetadata` instead. | Date: 2026-07-01
   * This field will be removed. Use `addCustomMetadata` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public On_RootMutation addAssetMetadataFieldValue(RootMutation_addAssetMetadataFieldValue callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Add new `Asset` preview image. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation addAssetPreviewImage(RootMutation_addAssetPreviewImage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Relate existing `Asset`s. The `relatedAssetIds` input field list is limited to 100 ids per request and cannot contain the same `assetId` input field value. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation addAssetRelations(RootMutation_addAssetRelations callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Add new `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation addAssetTags(RootMutation_addAssetTags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Add `Assets` to the existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public On_RootMutation addCollectionAssets(RootMutation_addCollectionAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Add `CustomMetadata` values to a supported parent (`Asset` | `WorkspaceProject`). Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  public On_RootMutation addCustomMetadata(RootMutation_addCustomMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Add options to an existing `SELECT` or `MULTISELECT` type `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  public On_RootMutation addCustomMetadataPropertyOptions(RootMutation_addCustomMetadataPropertyOptions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Add a new `WorkflowChecklistItem` for a given `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation addWorkflowChecklistItem(RootMutation_addWorkflowChecklistItem callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Add a new `WorkflowChecklistPreset` for a given `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation addWorkflowChecklistPreset(RootMutation_addWorkflowChecklistPreset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Add assignees to an existing `WorkflowStatus`. Currently, only one assignee is supported. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation addWorkflowStatusAssignees(RootMutation_addWorkflowStatusAssignees callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Add assignees to an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation addWorkflowTaskAssignees(RootMutation_addWorkflowTaskAssignees callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `Asset`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation createAsset(RootMutation_createAsset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `Asset` `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  public On_RootMutation createAssetComment(RootMutation_createAssetComment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `AssetVariant`. Only supported for assets in icon and logo libraries. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation createAssetVariant(RootMutation_createAssetVariant callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `Collection`. Currently supported for `Library` type parent entities only. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public On_RootMutation createCollection(RootMutation_createCollection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `Brand` or `Project` permission level `EDIT`.
   */
  public On_RootMutation createCustomMetadataProperty(RootMutation_createCustomMetadataProperty callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new External `Asset` from a url. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation createExternalAsset(RootMutation_createExternalAsset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `Folder`. Requires `basic:write` scope to be accessible and `Project` or `Folder` permission level `EDIT`.
   */
  public On_RootMutation createFolder(RootMutation_createFolder callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Create a new `Project` `MetadataField` with your desired configuration. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2026-07-01
   * This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public On_RootMutation createMetadataField(RootMutation_createMetadataField callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Create new `WorkflowStatus` in a given `Workflow`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation createWorkflowStatus(RootMutation_createWorkflowStatus callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Create a new `WorkflowTask` for an `Asset` in a given `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation createAssetWorkflowTask(RootMutation_createAssetWorkflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `Workspace` type `Project`. Requires `basic:write` scope to be accessible.
   */
  public On_RootMutation createWorkspaceProject(RootMutation_createWorkspaceProject callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Delete an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation deleteAsset(RootMutation_deleteAsset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Delete an existing `AssetVariant`. Only supported for assets in icon and logo libraries. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation deleteAssetVariant(RootMutation_deleteAssetVariant callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Delete an existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public On_RootMutation deleteCollection(RootMutation_deleteCollection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Delete an existing `Comment`. This will update and/or remove all relations to that `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  public On_RootMutation deleteComment(RootMutation_deleteComment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Delete an existing `CustomMetadataProperty`.
   */
  public On_RootMutation deleteCustomMetadataProperty(RootMutation_deleteCustomMetadataProperty callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Delete the existing `Folders`. This will delete all of the `Assets` and `SubFolders` within the `Folders`. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  public On_RootMutation deleteFolders(RootMutation_deleteFolders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Delete an existing `Project` `MetadataField`. Existing `MetadataField`'s with the same value with be automatically removed. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `deleteCustomMetadataProperty` instead. | Date: 2026-07-01
   * This field will be removed. Use `deleteCustomMetadataProperty` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public On_RootMutation deleteMetadataField(RootMutation_deleteMetadataField callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Delete an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation deleteWorkflowStatus(RootMutation_deleteWorkflowStatus callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Delete an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation deleteWorkflowTask(RootMutation_deleteWorkflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Edit an existing `AssetComment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  public On_RootMutation editComment(RootMutation_editComment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Invite `Project` user. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. Limitations: Does not work if User Provisioning feature is enabled.
   */
  public On_RootMutation inviteProjectUser(RootMutation_inviteProjectUser callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Move existing `Asset` item(s) to the given `Library`, `Workspace` or `Folder` destination. Only moves within the same `Library`/`Workspace` are supported by this operation. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation moveAssets(RootMutation_moveAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Move existing `Folder` item(s) to the given `Library`, `Workspace` or `Folder` destination. This operation will move all of the `Asset` item(s) and `SubFolder` item(s) within the provided `Folder` item(s). Only moves within the same `Library`/`Workspace` are supported by this operation. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  public On_RootMutation moveFolders(RootMutation_moveFolders callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Move one or more `WorkflowTask` to a new `WorkflowStatus`. All `EnterRule` of the destination `WorkflowStatus` have to be satisfied to be able to move. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation moveWorkflowTask(RootMutation_moveWorkflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Remove existing `Asset` preview image. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation removeAssetPreviewImage(RootMutation_removeAssetPreviewImage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Remove existing relations between `Asset` items. The `relatedAssetIds` input field list is limited to 100 ids per request and cannot contain the same `assetId` input field value. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation removeAssetRelations(RootMutation_removeAssetRelations callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Remove existing `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation removeAssetTags(RootMutation_removeAssetTags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Remove `Assets` from the existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public On_RootMutation removeCollectionAssets(RootMutation_removeCollectionAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Remove `CustomMetadata` values from a supported parent (`Asset` | `WorkspaceProject`). Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  public On_RootMutation removeCustomMetadata(RootMutation_removeCustomMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Remove options from an existing `SELECT` or `MULTISELECT` type `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  public On_RootMutation removeCustomMetadataPropertyOptions(RootMutation_removeCustomMetadataPropertyOptions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Remove existing `MetadataField` value.Existing relations to that `MetadataField` with the same value will be automatically removed.Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`. This field will be removed. Use `removeCustomMetadata` instead. | Date: 2026-07-01
   * This field will be removed. Use `removeCustomMetadata` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public On_RootMutation removeMetadataValue(RootMutation_removeMetadataValue callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Remove a `WorkflowChecklistItem`.Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation removeWorkflowChecklistItem(RootMutation_removeWorkflowChecklistItem callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Remove a `WorkflowChecklistPreset`.Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation removeWorkflowChecklistPreset(RootMutation_removeWorkflowChecklistPreset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Remove assignees from an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation removeWorkflowStatusAssignees(RootMutation_removeWorkflowStatusAssignees callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Remove assignees from an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation removeWorkflowTaskAssignees(RootMutation_removeWorkflowTaskAssignees callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Export `CreativeTemplate` with provided parameters. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation exportCreative(RootMutation_exportCreative callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Reopens a resolved `AssetComment`. Requires `basic:write` scope to be accessible and `Comment` permission level `EDIT`.
   */
  public On_RootMutation reopenAssetComment(RootMutation_reopenAssetComment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Replace an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation replaceAsset(RootMutation_replaceAsset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Replace an existing `AssetVariant`. Only supported for assets in icon and logo libraries. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation replaceAssetVariant(RootMutation_replaceAssetVariant callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Add a new reply to an existing `Asset` `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  public On_RootMutation replyToComment(RootMutation_replyToComment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Resolve an open `AssetComment`. Requires `basic:write` scope to be accessible and `Comment` permission level `EDIT`.
   */
  public On_RootMutation resolveAssetComment(RootMutation_resolveAssetComment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Set `CustomMetadataProperty` values to any supported parent (`WorkspaceProject` | `Asset`). Attention: Existing `CustomMetadataProperty` values for the selected parents will be overwritten and/or removed. Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  public On_RootMutation setCustomMetadata(RootMutation_setCustomMetadata callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Replace the existing set of the `Assets` in the `Collection` with the new set of the `Assets`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation setCollectionAssets(RootMutation_setCollectionAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Sync `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation syncAssetTags(RootMutation_syncAssetTags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Update an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation updateAsset(RootMutation_updateAsset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Update an existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public On_RootMutation updateCollection(RootMutation_updateCollection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Update an existing `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  public On_RootMutation updateCustomMetadataProperty(RootMutation_updateCustomMetadataProperty callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Update an existing `Folder`. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  public On_RootMutation updateFolder(RootMutation_updateFolder callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Update an existing `WorkflowChecklistItem`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation updateWorkflowChecklistItem(RootMutation_updateWorkflowChecklistItem callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Update an existing `WorkflowChecklistPreset`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation updateWorkflowChecklistPreset(RootMutation_updateWorkflowChecklistPreset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Update an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation updateWorkflowStatus(RootMutation_updateWorkflowStatus callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Update an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation updateWorkflowTask(RootMutation_updateWorkflowTask callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Create a new `Brand`. Requires `basic:write` scope to be accessible and `Account` permission level `EDIT`.
   */
  public On_RootMutation createBrand(RootMutation_createBrand callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Delete an existing `Brand`. Requires `basic:write` scope to be accessible and `Brand` permission level `EDIT`.
   */
  public On_RootMutation deleteBrand(RootMutation_deleteBrand callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Update an existing `Brand`. Requires `basic:write` scope to be accessible and `Brand` permission level `EDIT`.
   */
  public On_RootMutation updateBrand(RootMutation_updateBrand callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Creates a new `Catalog`.
   */
  public On_RootMutation createCatalog(RootMutation_createCatalog callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Updates an existing `Catalog`.
   */
  public On_RootMutation updateCatalog(RootMutation_updateCatalog callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Removes a `Catalog`.
   */
  public On_RootMutation removeCatalog(RootMutation_removeCatalog callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Creates a new `CatalogColumn`.
   */
  public On_RootMutation createCatalogColumn(RootMutation_createCatalogColumn callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Updates a `CatalogColumn`.
   */
  public On_RootMutation updateCatalogColumn(RootMutation_updateCatalogColumn callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Removes multiple `CatalogColumn`s in a single operation.
   */
  public On_RootMutation removeCatalogColumns(RootMutation_removeCatalogColumns callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Moves a `CatalogColumn` to a new position.
   */
  public On_RootMutation moveCatalogColumn(RootMutation_moveCatalogColumn callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Duplicates a `CatalogColumn` with its `CatalogCell` values.
   */
  public On_RootMutation duplicateCatalogColumn(RootMutation_duplicateCatalogColumn callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Clears all `CatalogCell` values of a `CatalogColumn`.
   */
  public On_RootMutation clearCatalogColumn(RootMutation_clearCatalogColumn callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Sets a `CatalogColumn` as the primary key column for its `Catalog`.
   */
  public On_RootMutation setCatalogColumnAsPrimary(RootMutation_setCatalogColumnAsPrimary callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Creates a new `CatalogRow`.
   */
  public On_RootMutation createCatalogRow(RootMutation_createCatalogRow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Removes multiple `CatalogRow`s.
   */
  public On_RootMutation removeCatalogRows(RootMutation_removeCatalogRows callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Moves a `CatalogRow` to a new position.
   */
  public On_RootMutation moveCatalogRow(RootMutation_moveCatalogRow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Duplicates a `CatalogRow` with its `CatalogCell` values.
   */
  public On_RootMutation duplicateCatalogRow(RootMutation_duplicateCatalogRow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Clears all `CatalogCell` values of a `CatalogRow`.
   */
  public On_RootMutation clearCatalogRow(RootMutation_clearCatalogRow callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Sets multiple `CatalogCell` values. Each entry specifies either a `text` or a `link` cell. All cells must belong to the same catalog.
   */
  public On_RootMutation setCatalogCells(RootMutation_setCatalogCells callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Ingests rows into a `Catalog` using an upsert approach.
   */
  public On_RootMutation ingestCatalogRows(RootMutation_ingestCatalogRows callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Updates the settings of a `GuidelinePageBlock` in the specified language. Only fields provided in the input are modified.
   */
  public On_RootMutation updateGuidelinePageBlockSettings(RootMutation_updateGuidelinePageBlockSettings callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Cancels `CreativeJobs` by provided parameters. `CreativeJob` can be canceled prior to the `RENDERING` status. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation cancelExportCreatives(RootMutation_cancelExportCreatives callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `Attachment`. Attachments require a valid parent ID string. This mutation currently only supports attachments for parents of `Asset` type. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation createAttachment(RootMutation_createAttachment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Delete an existing `Attachment`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation deleteAttachment(RootMutation_deleteAttachment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Dispatch an automation action event for a workflow step. Requires `basic:write` scope to be accessible.
   */
  public On_RootMutation dispatchAutomationAction(RootMutation_dispatchAutomationAction callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Upload a new file. Requires `basic:write` scope to be accessible<br>Creates a temporary unique file Id and returns presigned URLs for uploading a binary file in multiple parts.<br>After the upload is completed, this Id can be used (**once only**) to permanently link the file to a specific type (e.g., Asset, Attachment, Revision) via another mutation.<br><br>When `chunkSize` is provided as `null` (to be the future default), the number of upload parts and thus their corresponding part size will be computed dynamically based on the specified file size, following these rules:<br>- Maxmum of 1000 parts.<br>- For files of 5TB (maximum): 1000 parts of 5GB each.<br>- For files less than 15MB: 1 single part of 15MB.<br>- Otherwise: an inclusive range of [1, 1000] parts of [15MB, 5GB] each.
   */
  public On_RootMutation uploadFile(RootMutation_uploadFile callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation createGuidelineDocumentPageCategory(RootMutation_createGuidelineDocumentPageCategory callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation updateGuidelineDocumentPageCategory(RootMutation_updateGuidelineDocumentPageCategory callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation deleteGuidelineDocumentPageCategory(RootMutation_deleteGuidelineDocumentPageCategory callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation createGuidelineDocumentPageLink(RootMutation_createGuidelineDocumentPageLink callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation updateGuidelineDocumentPageLink(RootMutation_updateGuidelineDocumentPageLink callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation deleteGuidelineDocumentPageLink(RootMutation_deleteGuidelineDocumentPageLink callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation createGuidelineDocumentLibrary(RootMutation_createGuidelineDocumentLibrary callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation updateGuidelineDocumentLibrary(RootMutation_updateGuidelineDocumentLibrary callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation deleteGuidelineDocumentLibrary(RootMutation_deleteGuidelineDocumentLibrary callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation showGuidelineDocumentLibraryInNavigation(RootMutation_showGuidelineDocumentLibraryInNavigation callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation hideGuidelineDocumentLibraryFromNavigation(RootMutation_hideGuidelineDocumentLibraryFromNavigation callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation createGuidelineDocumentPage(RootMutation_createGuidelineDocumentPage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation updateGuidelineDocumentPage(RootMutation_updateGuidelineDocumentPage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation deleteGuidelineDocumentPage(RootMutation_deleteGuidelineDocumentPage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation duplicateGuidelineDocumentPage(RootMutation_duplicateGuidelineDocumentPage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation publishGuidelineDocumentPage(RootMutation_publishGuidelineDocumentPage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation unpublishGuidelineDocumentPage(RootMutation_unpublishGuidelineDocumentPage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation moveGuidelineDocumentPage(RootMutation_moveGuidelineDocumentPage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation showGuidelineDocumentPageInNavigation(RootMutation_showGuidelineDocumentPageInNavigation callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation hideGuidelineDocumentPageFromNavigation(RootMutation_hideGuidelineDocumentPageFromNavigation callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation createGuidelineDocumentGroup(RootMutation_createGuidelineDocumentGroup callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation updateGuidelineDocumentGroup(RootMutation_updateGuidelineDocumentGroup callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation deleteGuidelineDocumentGroup(RootMutation_deleteGuidelineDocumentGroup callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation showGuidelineDocumentGroupInNavigation(RootMutation_showGuidelineDocumentGroupInNavigation callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation hideGuidelineDocumentGroupFromNavigation(RootMutation_hideGuidelineDocumentGroupFromNavigation callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation createGuidelineDocument(RootMutation_createGuidelineDocument callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation updateGuidelineDocument(RootMutation_updateGuidelineDocument callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation deleteGuidelineDocument(RootMutation_deleteGuidelineDocument callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation showGuidelineDocumentInNavigation(RootMutation_showGuidelineDocumentInNavigation callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation hideGuidelineDocumentFromNavigation(RootMutation_hideGuidelineDocumentFromNavigation callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation createGuidelineDocumentLink(RootMutation_createGuidelineDocumentLink callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation updateGuidelineDocumentLink(RootMutation_updateGuidelineDocumentLink callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA**
   */
  public On_RootMutation deleteGuidelineDocumentLink(RootMutation_deleteGuidelineDocumentLink callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Creates a new `GuidelinePageBlock`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation createGuidelinePageBlock(RootMutation_createGuidelinePageBlock callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Creates a new `GuidelinePageHeading`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation createGuidelinePageHeading(RootMutation_createGuidelinePageHeading callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Deletes a `GuidelinePageHeading` by the given id. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation deleteGuidelinePageHeading(RootMutation_deleteGuidelinePageHeading callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Updates the properties of an existing `GuidelinePageHeading`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`, or `TRANSLATE` when a `locale` or `language` is given.
   */
  public On_RootMutation updateGuidelinePageHeading(RootMutation_updateGuidelinePageHeading callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Creates a new `GuidelinePageSection`, either on top of a page or after a given section.
   */
  public On_RootMutation createGuidelinePageSection(RootMutation_createGuidelinePageSection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Updates the properties of an existing `GuidelinePageSection`.
   */
  public On_RootMutation updateGuidelinePageSection(RootMutation_updateGuidelinePageSection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Deletes a `GuidelinePageSection`.
   */
  public On_RootMutation deleteGuidelinePageSection(RootMutation_deleteGuidelinePageSection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Update many `Assets` in one call, where each asset carries its own values.<br>Changes apply independently: assets and fields that cannot be updated fail<br>individually without rolling back the rest.
   */
  public On_RootMutation updateAssets(RootMutation_updateAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Add target IDs to asset IDs, avoiding duplicates.<br>Requires `basic:write` scope to be accessible and `Asset` edit permission.<br><br>Limitations: All assets must belong to the same library.<br>Library must have the "Targets" setting enabled.
   */
  public On_RootMutation addLibraryAssetTargets(RootMutation_addLibraryAssetTargets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Remove target IDs from asset IDs.<br>Requires `basic:write` scope to be accessible and `Asset` edit permission.<br><br>Limitations: All assets must belong to the same library.<br>Library must have the "Targets" setting enabled.
   */
  public On_RootMutation removeLibraryAssetTargets(RootMutation_removeLibraryAssetTargets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Sync target IDs on asset IDs (add missing, remove extra).<br>Requires `basic:write` scope to be accessible and `Asset` edit permission.<br><br>Limitations: All assets must belong to the same library.<br>Library must have the "Targets" setting enabled.
   */
  public On_RootMutation setLibraryAssetTargets(RootMutation_setLibraryAssetTargets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Create a new `Project` `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation createLicense(RootMutation_createLicense callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Delete an existing `Project` `License`. This will remove all relations to that `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation deleteLicense(RootMutation_deleteLicense callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Add a relation between an existing `Asset` and `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation addAssetLicense(RootMutation_addAssetLicense callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Remove an existing relation between an `Asset` and a `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public On_RootMutation removeAssetLicense(RootMutation_removeAssetLicense callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Publish a marketplace app with the specified release notes and availability.
   */
  public On_RootMutation publishMarketplaceApp(RootMutation_publishMarketplaceApp callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Creates a ServiceApp following the ClientCredentials flow
   */
  public On_RootMutation createServiceApp(RootMutation_createServiceApp callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Removes a ServiceApp
   */
  public On_RootMutation deleteServiceApp(RootMutation_deleteServiceApp callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Install `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation installProjectWebhook(RootMutation_installProjectWebhook callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `configureProjectWebhook` mutation field
   */
  public On_RootMutation configureProjectWebhook(RootMutation_configureProjectWebhook callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Uninstall `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  public On_RootMutation uninstallWebhook(RootMutation_uninstallWebhook callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
