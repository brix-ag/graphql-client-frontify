package ch.brix.gql.client.frontify;

public class Mutation {
  /**
   * Add a relation between an existing `Asset` and `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addAssetLicense addAssetLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addAssetLicense());
  }
  /**
   * **DEPRECATED** Add a new relation between an existing `Asset` and an existing `MetadataField` with its value. The value will be automatically created and linked to its `MetadataField`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`. This field will be removed. Use `addCustomMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `addCustomMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
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
   * Create a new `Attachment`. Attachments require a valid parent ID string. This mutation currently only supports attachments for parents of `Asset` type. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createAttachment createAttachment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createAttachment());
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
   * Create a new `Project` `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_createLicense createLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createLicense());
  }
  /**
   * **DEPRECATED** Create a new `Project` `MetadataField` with your desired configuration. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2025-07-01T00:00:00.000+00:00
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
   * Delete an existing `Attachment`. Requires `basic:write` scope to be accessible and depending on the `Attachment` type, either `Portal` or `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteAttachment deleteAttachment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteAttachment());
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
   * Delete an existing `Project` `License`. This will remove all relations to that `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteLicense deleteLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteLicense());
  }
  /**
   * **DEPRECATED** Delete an existing `Project` `MetadataField`. Existing `MetadataField`'s with the same value with be automatically removed. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `deleteCustomMetadataProperty` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `deleteCustomMetadataProperty` instead. | Date: 2025-07-01T00:00:00.000+00:00
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
   * Install `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_installProjectWebhook installProjectWebhook() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_installProjectWebhook());
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
   * Remove an existing relation between an `Asset` and a `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_removeAssetLicense removeAssetLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_removeAssetLicense());
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
   * **DEPRECATED** Remove existing `MetadataField` value.Existing relations to that `MetadataField` with the same value will be automatically removed.Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`. This field will be removed. Use `removeCustomMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `removeCustomMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
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
   * **BETA** Export `CreativeTemplate` with provided parameters. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
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
   * Uninstall `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_uninstallWebhook uninstallWebhook() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_uninstallWebhook());
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
   * Upload a new file. This stores the binary file temporarily so it can be then permanently linked to a specific type (ie. `Asset`, `Attachment`, `Revision`) after the upload is complete by using a different mutation. Requires `basic:write` scope to be accessible.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_uploadFile uploadFile() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_uploadFile());
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
   * **BETA** Cancels `CreativeJobs` by provided parameters. `CreativeJob` can be canceled prior to the `RENDERING` status. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_cancelExportCreatives cancelExportCreatives() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_cancelExportCreatives());
  }
}
