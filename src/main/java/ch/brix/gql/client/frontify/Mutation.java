package ch.brix.gql.client.frontify;

public class Mutation {
  /**
   * **DEPRECATED** Add a new relation between an existing `Asset` and an existing `MetadataField` with its value. The value will be automatically created and linked to its `MetadataField`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`. This field will be removed. Use `addCustomMetadata` instead. | Date: 2026-07-01
   * This field will be removed. Use `addCustomMetadata` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public static ch.brix.gql.client.frontify.builders.RootMutation_addAssetMetadataFieldValue addAssetMetadataFieldValue() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addAssetMetadataFieldValue());
  }
  /**
   * Add new `Asset` preview image. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addAssetPreviewImage addAssetPreviewImage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addAssetPreviewImage());
  }
  /**
   * Relate existing `Asset`s. The `relatedAssetIds` input field list is limited to 100 ids per request and cannot contain the same `assetId` input field value. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addAssetRelations addAssetRelations() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addAssetRelations());
  }
  /**
   * Add new `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addAssetTags addAssetTags() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addAssetTags());
  }
  /**
   * Add `Assets` to the existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addCollectionAssets addCollectionAssets() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addCollectionAssets());
  }
  /**
   * Add `CustomMetadata` values to a supported parent (`Asset` | `WorkspaceProject`). Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addCustomMetadata addCustomMetadata() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addCustomMetadata());
  }
  /**
   * Add options to an existing `SELECT` or `MULTISELECT` type `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addCustomMetadataPropertyOptions addCustomMetadataPropertyOptions() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addCustomMetadataPropertyOptions());
  }
  /**
   * **BETA** Add a new `WorkflowChecklistItem` for a given `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addWorkflowChecklistItem addWorkflowChecklistItem() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addWorkflowChecklistItem());
  }
  /**
   * **BETA** Add a new `WorkflowChecklistPreset` for a given `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addWorkflowChecklistPreset addWorkflowChecklistPreset() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addWorkflowChecklistPreset());
  }
  /**
   * **BETA** Add assignees to an existing `WorkflowStatus`. Currently, only one assignee is supported. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addWorkflowStatusAssignees addWorkflowStatusAssignees() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addWorkflowStatusAssignees());
  }
  /**
   * **BETA** Add assignees to an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addWorkflowTaskAssignees addWorkflowTaskAssignees() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addWorkflowTaskAssignees());
  }
  /**
   * Create a new `Asset`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createAsset createAsset() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createAsset());
  }
  /**
   * Create a new `Asset` `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createAssetComment createAssetComment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createAssetComment());
  }
  /**
   * Create a new `AssetVariant`. Only supported for assets in icon and logo libraries. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createAssetVariant createAssetVariant() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createAssetVariant());
  }
  /**
   * Create a new `Collection`. Currently supported for `Library` type parent entities only. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createCollection createCollection() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createCollection());
  }
  /**
   * Create a new `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `Brand` or `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createCustomMetadataProperty createCustomMetadataProperty() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createCustomMetadataProperty());
  }
  /**
   * Create a new External `Asset` from a url. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createExternalAsset createExternalAsset() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createExternalAsset());
  }
  /**
   * Create a new `Folder`. Requires `basic:write` scope to be accessible and `Project` or `Folder` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createFolder createFolder() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createFolder());
  }
  /**
   * **DEPRECATED** Create a new `Project` `MetadataField` with your desired configuration. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2026-07-01
   * This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public static ch.brix.gql.client.frontify.builders.RootMutation_createMetadataField createMetadataField() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createMetadataField());
  }
  /**
   * **BETA** Create new `WorkflowStatus` in a given `Workflow`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createWorkflowStatus createWorkflowStatus() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createWorkflowStatus());
  }
  /**
   * **BETA** Create a new `WorkflowTask` for an `Asset` in a given `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createAssetWorkflowTask createAssetWorkflowTask() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createAssetWorkflowTask());
  }
  /**
   * Create a new `Workspace` type `Project`. Requires `basic:write` scope to be accessible.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createWorkspaceProject createWorkspaceProject() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createWorkspaceProject());
  }
  /**
   * Delete an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteAsset deleteAsset() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteAsset());
  }
  /**
   * Delete an existing `AssetVariant`. Only supported for assets in icon and logo libraries. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteAssetVariant deleteAssetVariant() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteAssetVariant());
  }
  /**
   * Delete an existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteCollection deleteCollection() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteCollection());
  }
  /**
   * Delete an existing `Comment`. This will update and/or remove all relations to that `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteComment deleteComment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteComment());
  }
  /**
   * Delete an existing `CustomMetadataProperty`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteCustomMetadataProperty deleteCustomMetadataProperty() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteCustomMetadataProperty());
  }
  /**
   * Delete the existing `Folders`. This will delete all of the `Assets` and `SubFolders` within the `Folders`. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteFolders deleteFolders() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteFolders());
  }
  /**
   * **DEPRECATED** Delete an existing `Project` `MetadataField`. Existing `MetadataField`'s with the same value with be automatically removed. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `deleteCustomMetadataProperty` instead. | Date: 2026-07-01
   * This field will be removed. Use `deleteCustomMetadataProperty` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteMetadataField deleteMetadataField() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteMetadataField());
  }
  /**
   * **BETA** Delete an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteWorkflowStatus deleteWorkflowStatus() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteWorkflowStatus());
  }
  /**
   * **BETA** Delete an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteWorkflowTask deleteWorkflowTask() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteWorkflowTask());
  }
  /**
   * Edit an existing `AssetComment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_editComment editComment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_editComment());
  }
  /**
   * Invite `Project` user. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. Limitations: Does not work if User Provisioning feature is enabled.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_inviteProjectUser inviteProjectUser() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_inviteProjectUser());
  }
  /**
   * Move existing `Asset` item(s) to the given `Library`, `Workspace` or `Folder` destination. Only moves within the same `Library`/`Workspace` are supported by this operation. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_moveAssets moveAssets() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_moveAssets());
  }
  /**
   * Move existing `Folder` item(s) to the given `Library`, `Workspace` or `Folder` destination. This operation will move all of the `Asset` item(s) and `SubFolder` item(s) within the provided `Folder` item(s). Only moves within the same `Library`/`Workspace` are supported by this operation. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_moveFolders moveFolders() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_moveFolders());
  }
  /**
   * **BETA** Move one or more `WorkflowTask` to a new `WorkflowStatus`. All `EnterRule` of the destination `WorkflowStatus` have to be satisfied to be able to move. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_moveWorkflowTask moveWorkflowTask() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_moveWorkflowTask());
  }
  /**
   * Remove existing `Asset` preview image. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeAssetPreviewImage removeAssetPreviewImage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeAssetPreviewImage());
  }
  /**
   * **BETA** Remove existing relations between `Asset` items. The `relatedAssetIds` input field list is limited to 100 ids per request and cannot contain the same `assetId` input field value. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeAssetRelations removeAssetRelations() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeAssetRelations());
  }
  /**
   * Remove existing `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeAssetTags removeAssetTags() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeAssetTags());
  }
  /**
   * Remove `Assets` from the existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeCollectionAssets removeCollectionAssets() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeCollectionAssets());
  }
  /**
   * Remove `CustomMetadata` values from a supported parent (`Asset` | `WorkspaceProject`). Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeCustomMetadata removeCustomMetadata() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeCustomMetadata());
  }
  /**
   * Remove options from an existing `SELECT` or `MULTISELECT` type `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeCustomMetadataPropertyOptions removeCustomMetadataPropertyOptions() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeCustomMetadataPropertyOptions());
  }
  /**
   * **DEPRECATED** Remove existing `MetadataField` value.Existing relations to that `MetadataField` with the same value will be automatically removed.Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`. This field will be removed. Use `removeCustomMetadata` instead. | Date: 2026-07-01
   * This field will be removed. Use `removeCustomMetadata` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeMetadataValue removeMetadataValue() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeMetadataValue());
  }
  /**
   * **BETA** Remove a `WorkflowChecklistItem`.Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeWorkflowChecklistItem removeWorkflowChecklistItem() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeWorkflowChecklistItem());
  }
  /**
   * **BETA** Remove a `WorkflowChecklistPreset`.Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeWorkflowChecklistPreset removeWorkflowChecklistPreset() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeWorkflowChecklistPreset());
  }
  /**
   * **BETA** Remove assignees from an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeWorkflowStatusAssignees removeWorkflowStatusAssignees() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeWorkflowStatusAssignees());
  }
  /**
   * **BETA** Remove assignees from an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeWorkflowTaskAssignees removeWorkflowTaskAssignees() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeWorkflowTaskAssignees());
  }
  /**
   * Export `CreativeTemplate` with provided parameters. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_exportCreative exportCreative() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_exportCreative());
  }
  /**
   * Reopens a resolved `AssetComment`. Requires `basic:write` scope to be accessible and `Comment` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_reopenAssetComment reopenAssetComment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_reopenAssetComment());
  }
  /**
   * Replace an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_replaceAsset replaceAsset() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_replaceAsset());
  }
  /**
   * Replace an existing `AssetVariant`. Only supported for assets in icon and logo libraries. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_replaceAssetVariant replaceAssetVariant() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_replaceAssetVariant());
  }
  /**
   * Add a new reply to an existing `Asset` `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_replyToComment replyToComment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_replyToComment());
  }
  /**
   * Resolve an open `AssetComment`. Requires `basic:write` scope to be accessible and `Comment` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_resolveAssetComment resolveAssetComment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_resolveAssetComment());
  }
  /**
   * **BETA** Set `CustomMetadataProperty` values to any supported parent (`WorkspaceProject` | `Asset`). Attention: Existing `CustomMetadataProperty` values for the selected parents will be overwritten and/or removed. Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_setCustomMetadata setCustomMetadata() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_setCustomMetadata());
  }
  /**
   * Replace the existing set of the `Assets` in the `Collection` with the new set of the `Assets`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_setCollectionAssets setCollectionAssets() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_setCollectionAssets());
  }
  /**
   * Sync `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_syncAssetTags syncAssetTags() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_syncAssetTags());
  }
  /**
   * Update an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateAsset updateAsset() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateAsset());
  }
  /**
   * Update an existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateCollection updateCollection() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateCollection());
  }
  /**
   * Update an existing `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateCustomMetadataProperty updateCustomMetadataProperty() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateCustomMetadataProperty());
  }
  /**
   * Update an existing `Folder`. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateFolder updateFolder() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateFolder());
  }
  /**
   * **BETA** Update an existing `WorkflowChecklistItem`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateWorkflowChecklistItem updateWorkflowChecklistItem() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateWorkflowChecklistItem());
  }
  /**
   * **BETA** Update an existing `WorkflowChecklistPreset`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateWorkflowChecklistPreset updateWorkflowChecklistPreset() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateWorkflowChecklistPreset());
  }
  /**
   * **BETA** Update an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateWorkflowStatus updateWorkflowStatus() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateWorkflowStatus());
  }
  /**
   * **BETA** Update an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateWorkflowTask updateWorkflowTask() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateWorkflowTask());
  }
  /**
   * **BETA** Create a new `Brand`. Requires `basic:write` scope to be accessible and `Account` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createBrand createBrand() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createBrand());
  }
  /**
   * **BETA** Delete an existing `Brand`. Requires `basic:write` scope to be accessible and `Brand` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteBrand deleteBrand() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteBrand());
  }
  /**
   * **BETA** Update an existing `Brand`. Requires `basic:write` scope to be accessible and `Brand` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateBrand updateBrand() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateBrand());
  }
  /**
   * **BETA** Creates a new `Catalog`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createCatalog createCatalog() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createCatalog());
  }
  /**
   * **BETA** Updates an existing `Catalog`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateCatalog updateCatalog() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateCatalog());
  }
  /**
   * **BETA** Removes a `Catalog`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeCatalog removeCatalog() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeCatalog());
  }
  /**
   * **BETA** Creates a new `CatalogColumn`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createCatalogColumn createCatalogColumn() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createCatalogColumn());
  }
  /**
   * **BETA** Updates a `CatalogColumn`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateCatalogColumn updateCatalogColumn() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateCatalogColumn());
  }
  /**
   * **BETA** Removes multiple `CatalogColumn`s in a single operation.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeCatalogColumns removeCatalogColumns() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeCatalogColumns());
  }
  /**
   * **BETA** Moves a `CatalogColumn` to a new position.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_moveCatalogColumn moveCatalogColumn() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_moveCatalogColumn());
  }
  /**
   * **BETA** Duplicates a `CatalogColumn` with its `CatalogCell` values.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_duplicateCatalogColumn duplicateCatalogColumn() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_duplicateCatalogColumn());
  }
  /**
   * **BETA** Clears all `CatalogCell` values of a `CatalogColumn`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_clearCatalogColumn clearCatalogColumn() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_clearCatalogColumn());
  }
  /**
   * **BETA** Sets a `CatalogColumn` as the primary key column for its `Catalog`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_setCatalogColumnAsPrimary setCatalogColumnAsPrimary() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_setCatalogColumnAsPrimary());
  }
  /**
   * **BETA** Creates a new `CatalogRow`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createCatalogRow createCatalogRow() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createCatalogRow());
  }
  /**
   * **BETA** Removes multiple `CatalogRow`s.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeCatalogRows removeCatalogRows() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeCatalogRows());
  }
  /**
   * **BETA** Moves a `CatalogRow` to a new position.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_moveCatalogRow moveCatalogRow() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_moveCatalogRow());
  }
  /**
   * **BETA** Duplicates a `CatalogRow` with its `CatalogCell` values.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_duplicateCatalogRow duplicateCatalogRow() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_duplicateCatalogRow());
  }
  /**
   * **BETA** Clears all `CatalogCell` values of a `CatalogRow`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_clearCatalogRow clearCatalogRow() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_clearCatalogRow());
  }
  /**
   * **BETA** Sets multiple `CatalogCell` values. Each entry specifies either a `text` or a `link` cell. All cells must belong to the same catalog.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_setCatalogCells setCatalogCells() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_setCatalogCells());
  }
  /**
   * **BETA** Ingests rows into a `Catalog` using an upsert approach.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_ingestCatalogRows ingestCatalogRows() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_ingestCatalogRows());
  }
  /**
   * **BETA** Updates the settings of a `GuidelinePageBlock` in the specified language. Only fields provided in the input are modified.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelinePageBlockSettings updateGuidelinePageBlockSettings() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelinePageBlockSettings());
  }
  /**
   * Cancels `CreativeJobs` by provided parameters. `CreativeJob` can be canceled prior to the `RENDERING` status. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_cancelExportCreatives cancelExportCreatives() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_cancelExportCreatives());
  }
  /**
   * Create a new `Attachment`. Attachments require a valid parent ID string. This mutation currently only supports attachments for parents of `Asset` type. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createAttachment createAttachment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createAttachment());
  }
  /**
   * Delete an existing `Attachment`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteAttachment deleteAttachment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteAttachment());
  }
  /**
   * **BETA** Dispatch an automation action event for a workflow step. Requires `basic:write` scope to be accessible.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_dispatchAutomationAction dispatchAutomationAction() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_dispatchAutomationAction());
  }
  /**
   * Upload a new file. Requires `basic:write` scope to be accessible<br>Creates a temporary unique file Id and returns presigned URLs for uploading a binary file in multiple parts.<br>After the upload is completed, this Id can be used (**once only**) to permanently link the file to a specific type (e.g., Asset, Attachment, Revision) via another mutation.<br><br>When `chunkSize` is provided as `null` (to be the future default), the number of upload parts and thus their corresponding part size will be computed dynamically based on the specified file size, following these rules:<br>- Maxmum of 1000 parts.<br>- For files of 5TB (maximum): 1000 parts of 5GB each.<br>- For files less than 15MB: 1 single part of 15MB.<br>- Otherwise: an inclusive range of [1, 1000] parts of [15MB, 5GB] each.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_uploadFile uploadFile() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_uploadFile());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentPageCategory createGuidelineDocumentPageCategory() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentPageCategory());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentPageCategory updateGuidelineDocumentPageCategory() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentPageCategory());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentPageCategory deleteGuidelineDocumentPageCategory() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentPageCategory());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentPageLink createGuidelineDocumentPageLink() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentPageLink());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentPageLink updateGuidelineDocumentPageLink() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentPageLink());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentPageLink deleteGuidelineDocumentPageLink() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentPageLink());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentLibrary createGuidelineDocumentLibrary() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentLibrary());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentLibrary updateGuidelineDocumentLibrary() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentLibrary());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentLibrary deleteGuidelineDocumentLibrary() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentLibrary());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_showGuidelineDocumentLibraryInNavigation showGuidelineDocumentLibraryInNavigation() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_showGuidelineDocumentLibraryInNavigation());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_hideGuidelineDocumentLibraryFromNavigation hideGuidelineDocumentLibraryFromNavigation() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_hideGuidelineDocumentLibraryFromNavigation());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentPage createGuidelineDocumentPage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentPage());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentPage updateGuidelineDocumentPage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentPage());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentPage deleteGuidelineDocumentPage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentPage());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_duplicateGuidelineDocumentPage duplicateGuidelineDocumentPage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_duplicateGuidelineDocumentPage());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_publishGuidelineDocumentPage publishGuidelineDocumentPage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_publishGuidelineDocumentPage());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_unpublishGuidelineDocumentPage unpublishGuidelineDocumentPage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_unpublishGuidelineDocumentPage());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_moveGuidelineDocumentPage moveGuidelineDocumentPage() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_moveGuidelineDocumentPage());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_showGuidelineDocumentPageInNavigation showGuidelineDocumentPageInNavigation() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_showGuidelineDocumentPageInNavigation());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_hideGuidelineDocumentPageFromNavigation hideGuidelineDocumentPageFromNavigation() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_hideGuidelineDocumentPageFromNavigation());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentGroup createGuidelineDocumentGroup() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentGroup());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentGroup updateGuidelineDocumentGroup() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentGroup());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentGroup deleteGuidelineDocumentGroup() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentGroup());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_showGuidelineDocumentGroupInNavigation showGuidelineDocumentGroupInNavigation() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_showGuidelineDocumentGroupInNavigation());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_hideGuidelineDocumentGroupFromNavigation hideGuidelineDocumentGroupFromNavigation() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_hideGuidelineDocumentGroupFromNavigation());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocument createGuidelineDocument() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocument());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocument updateGuidelineDocument() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocument());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocument deleteGuidelineDocument() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocument());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_showGuidelineDocumentInNavigation showGuidelineDocumentInNavigation() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_showGuidelineDocumentInNavigation());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_hideGuidelineDocumentFromNavigation hideGuidelineDocumentFromNavigation() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_hideGuidelineDocumentFromNavigation());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentLink createGuidelineDocumentLink() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelineDocumentLink());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentLink updateGuidelineDocumentLink() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelineDocumentLink());
  }
  /**
   * **BETA**
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentLink deleteGuidelineDocumentLink() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelineDocumentLink());
  }
  /**
   * **BETA** Creates a new `GuidelinePageBlock`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelinePageBlock createGuidelinePageBlock() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelinePageBlock());
  }
  /**
   * **BETA** Creates a new `GuidelinePageHeading`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelinePageHeading createGuidelinePageHeading() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelinePageHeading());
  }
  /**
   * **BETA** Deletes a `GuidelinePageHeading` by the given id. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelinePageHeading deleteGuidelinePageHeading() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelinePageHeading());
  }
  /**
   * **BETA** Updates the properties of an existing `GuidelinePageHeading`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`, or `TRANSLATE` when a `locale` or `language` is given.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelinePageHeading updateGuidelinePageHeading() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelinePageHeading());
  }
  /**
   * **BETA** Creates a new `GuidelinePageSection`, either on top of a page or after a given section.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createGuidelinePageSection createGuidelinePageSection() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createGuidelinePageSection());
  }
  /**
   * **BETA** Updates the properties of an existing `GuidelinePageSection`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelinePageSection updateGuidelinePageSection() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateGuidelinePageSection());
  }
  /**
   * **BETA** Deletes a `GuidelinePageSection`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelinePageSection deleteGuidelinePageSection() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteGuidelinePageSection());
  }
  /**
   * **BETA** Update many `Assets` in one call, where each asset carries its own values.<br>Changes apply independently: assets and fields that cannot be updated fail<br>individually without rolling back the rest.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_updateAssets updateAssets() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_updateAssets());
  }
  /**
   * **BETA** Add target IDs to asset IDs, avoiding duplicates.<br>Requires `basic:write` scope to be accessible and `Asset` edit permission.<br><br>Limitations: All assets must belong to the same library.<br>Library must have the "Targets" setting enabled.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addLibraryAssetTargets addLibraryAssetTargets() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addLibraryAssetTargets());
  }
  /**
   * **BETA** Remove target IDs from asset IDs.<br>Requires `basic:write` scope to be accessible and `Asset` edit permission.<br><br>Limitations: All assets must belong to the same library.<br>Library must have the "Targets" setting enabled.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeLibraryAssetTargets removeLibraryAssetTargets() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeLibraryAssetTargets());
  }
  /**
   * **BETA** Sync target IDs on asset IDs (add missing, remove extra).<br>Requires `basic:write` scope to be accessible and `Asset` edit permission.<br><br>Limitations: All assets must belong to the same library.<br>Library must have the "Targets" setting enabled.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_setLibraryAssetTargets setLibraryAssetTargets() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_setLibraryAssetTargets());
  }
  /**
   * Create a new `Project` `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createLicense createLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createLicense());
  }
  /**
   * Delete an existing `Project` `License`. This will remove all relations to that `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteLicense deleteLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteLicense());
  }
  /**
   * Add a relation between an existing `Asset` and `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addAssetLicense addAssetLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addAssetLicense());
  }
  /**
   * Remove an existing relation between an `Asset` and a `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeAssetLicense removeAssetLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeAssetLicense());
  }
  /**
   * Publish a marketplace app with the specified release notes and availability.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_publishMarketplaceApp publishMarketplaceApp() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_publishMarketplaceApp());
  }
  /**
   * **BETA** Creates a ServiceApp following the ClientCredentials flow
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createServiceApp createServiceApp() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createServiceApp());
  }
  /**
   * **BETA** Removes a ServiceApp
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteServiceApp deleteServiceApp() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteServiceApp());
  }
  /**
   * Install `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_installProjectWebhook installProjectWebhook() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_installProjectWebhook());
  }
  /**
   * `configureProjectWebhook` mutation field
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_configureProjectWebhook configureProjectWebhook() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_configureProjectWebhook());
  }
  /**
   * Uninstall `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_uninstallWebhook uninstallWebhook() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_uninstallWebhook());
  }
}
