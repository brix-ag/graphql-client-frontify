package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RootMutation {
  /**
   * Add a relation between an existing `Asset` and `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addAssetLicense")
  private ch.brix.gql.client.frontify.objects.AddAssetLicense addAssetLicense;
  /**
   * **DEPRECATED** Add a new relation between an existing `Asset` and an existing `MetadataField` with its value. The value will be automatically created and linked to its `MetadataField`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`. This field will be removed. Use `addCustomMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `addCustomMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("addAssetMetadataFieldValue")
  private ch.brix.gql.client.frontify.objects.AddAssetMetadataFieldValue addAssetMetadataFieldValue;
  /**
   * Add new `Asset` preview image. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addAssetPreviewImage")
  private ch.brix.gql.client.frontify.objects.AddAssetPreviewImage addAssetPreviewImage;
  /**
   * Relate existing `Asset`s. The `relatedAssetIds` input field list is limited to 100 ids per request and cannot contain the same `assetId` input field value. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addAssetRelations")
  private ch.brix.gql.client.frontify.objects.AddAssetRelations addAssetRelations;
  /**
   * Add new `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addAssetTags")
  private ch.brix.gql.client.frontify.objects.AddAssetTags addAssetTags;
  /**
   * Add `Assets` to the existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addCollectionAssets")
  private ch.brix.gql.client.frontify.objects.AddCollectionAssets addCollectionAssets;
  /**
   * Add `CustomMetadata` values to a supported parent (`Asset` | `WorkspaceProject`). Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  @com.google.gson.annotations.SerializedName("addCustomMetadata")
  private ch.brix.gql.client.frontify.objects.AddCustomMetadata addCustomMetadata;
  /**
   * Add options to an existing `SELECT` or `MULTISELECT` type `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addCustomMetadataPropertyOptions")
  private ch.brix.gql.client.frontify.objects.AddCustomMetadataPropertyOptions addCustomMetadataPropertyOptions;
  /**
   * **BETA** Add a new `WorkflowChecklistItem` for a given `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addWorkflowChecklistItem")
  private ch.brix.gql.client.frontify.objects.AddWorkflowChecklistItem addWorkflowChecklistItem;
  /**
   * **BETA** Add a new `WorkflowChecklistPreset` for a given `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addWorkflowChecklistPreset")
  private ch.brix.gql.client.frontify.objects.AddWorkflowChecklistPreset addWorkflowChecklistPreset;
  /**
   * **BETA** Add assignees to an existing `WorkflowStatus`. Currently, only one assignee is supported. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addWorkflowStatusAssignees")
  private ch.brix.gql.client.frontify.objects.AddWorkflowStatusAssignees addWorkflowStatusAssignees;
  /**
   * **BETA** Add assignees to an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("addWorkflowTaskAssignees")
  private ch.brix.gql.client.frontify.objects.AddWorkflowTaskAssignees addWorkflowTaskAssignees;
  /**
   * Create a new `Asset`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createAsset")
  private ch.brix.gql.client.frontify.objects.CreateAsset createAsset;
  /**
   * Create a new `Asset` `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  @com.google.gson.annotations.SerializedName("createAssetComment")
  private ch.brix.gql.client.frontify.objects.CreateAssetComment createAssetComment;
  /**
   * Create a new `Attachment`. Attachments require a valid parent ID string. This mutation currently only supports attachments for parents of `Asset` type. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createAttachment")
  private ch.brix.gql.client.frontify.objects.CreateAttachment createAttachment;
  /**
   * Create a new `Collection`. Currently supported for `Library` type parent entities only. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createCollection")
  private ch.brix.gql.client.frontify.objects.CreateCollection createCollection;
  /**
   * Create a new `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `Brand` or `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createCustomMetadataProperty")
  private ch.brix.gql.client.frontify.objects.CreateCustomMetadataProperty createCustomMetadataProperty;
  /**
   * Create a new External `Asset` from a url. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createExternalAsset")
  private ch.brix.gql.client.frontify.objects.CreateExternalAsset createExternalAsset;
  /**
   * Create a new `Folder`. Requires `basic:write` scope to be accessible and `Project` or `Folder` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createFolder")
  private ch.brix.gql.client.frontify.objects.CreateFolder createFolder;
  /**
   * Create a new `Project` `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createLicense")
  private ch.brix.gql.client.frontify.objects.CreateLicense createLicense;
  /**
   * **DEPRECATED** Create a new `Project` `MetadataField` with your desired configuration. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("createMetadataField")
  private ch.brix.gql.client.frontify.objects.CreateMetadataField createMetadataField;
  /**
   * **BETA** Create new `WorkflowStatus` in a given `Workflow`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createWorkflowStatus")
  private ch.brix.gql.client.frontify.objects.CreateWorkflowStatus createWorkflowStatus;
  /**
   * **BETA** Create a new `WorkflowTask` for an `Asset` in a given `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createAssetWorkflowTask")
  private ch.brix.gql.client.frontify.objects.CreateAssetWorkflowTask createAssetWorkflowTask;
  /**
   * Create a new `Workspace` type `Project`. Requires `basic:write` scope to be accessible.
   */
  @com.google.gson.annotations.SerializedName("createWorkspaceProject")
  private ch.brix.gql.client.frontify.objects.CreateWorkspaceProject createWorkspaceProject;
  /**
   * Delete an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("deleteAsset")
  private ch.brix.gql.client.frontify.objects.DeleteAsset deleteAsset;
  /**
   * Delete an existing `Attachment`. Requires `basic:write` scope to be accessible and depending on the `Attachment` type, either `Portal` or `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("deleteAttachment")
  private ch.brix.gql.client.frontify.objects.DeleteAttachment deleteAttachment;
  /**
   * Delete an existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("deleteCollection")
  private ch.brix.gql.client.frontify.objects.DeleteCollection deleteCollection;
  /**
   * Delete an existing `Comment`. This will update and/or remove all relations to that `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  @com.google.gson.annotations.SerializedName("deleteComment")
  private ch.brix.gql.client.frontify.objects.DeleteComment deleteComment;
  /**
   * Delete an existing `CustomMetadataProperty`.
   */
  @com.google.gson.annotations.SerializedName("deleteCustomMetadataProperty")
  private ch.brix.gql.client.frontify.objects.DeleteCustomMetadataProperty deleteCustomMetadataProperty;
  /**
   * Delete the existing `Folders`. This will delete all of the `Assets` and `SubFolders` within the `Folders`. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("deleteFolders")
  private ch.brix.gql.client.frontify.objects.DeleteFolders deleteFolders;
  /**
   * Delete an existing `Project` `License`. This will remove all relations to that `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("deleteLicense")
  private ch.brix.gql.client.frontify.objects.DeleteLicense deleteLicense;
  /**
   * **DEPRECATED** Delete an existing `Project` `MetadataField`. Existing `MetadataField`'s with the same value with be automatically removed. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `deleteCustomMetadataProperty` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `deleteCustomMetadataProperty` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("deleteMetadataField")
  private ch.brix.gql.client.frontify.objects.DeleteMetadataField deleteMetadataField;
  /**
   * **BETA** Delete an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("deleteWorkflowStatus")
  private ch.brix.gql.client.frontify.objects.DeleteWorkflowStatus deleteWorkflowStatus;
  /**
   * **BETA** Delete an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("deleteWorkflowTask")
  private ch.brix.gql.client.frontify.objects.DeleteWorkflowTask deleteWorkflowTask;
  /**
   * Edit an existing `AssetComment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  @com.google.gson.annotations.SerializedName("editComment")
  private ch.brix.gql.client.frontify.objects.EditComment editComment;
  /**
   * Install `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("installProjectWebhook")
  private ch.brix.gql.client.frontify.objects.InstallProjectWebhook installProjectWebhook;
  /**
   * Invite `Project` user. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. Limitations: Does not work if User Provisioning feature is enabled.
   */
  @com.google.gson.annotations.SerializedName("inviteProjectUser")
  private ch.brix.gql.client.frontify.objects.InviteProjectUser inviteProjectUser;
  /**
   * Move existing `Asset` item(s) to the given `Library`, `Workspace` or `Folder` destination. Only moves within the same `Library`/`Workspace` are supported by this operation. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("moveAssets")
  private ch.brix.gql.client.frontify.objects.MoveAssets moveAssets;
  /**
   * Move existing `Folder` item(s) to the given `Library`, `Workspace` or `Folder` destination. This operation will move all of the `Asset` item(s) and `SubFolder` item(s) within the provided `Folder` item(s). Only moves within the same `Library`/`Workspace` are supported by this operation. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("moveFolders")
  private ch.brix.gql.client.frontify.objects.MoveFolders moveFolders;
  /**
   * **BETA** Move one or more `WorkflowTask` to a new `WorkflowStatus`. All `EnterRule` of the destination `WorkflowStatus` have to be satisfied to be able to move. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("moveWorkflowTask")
  private ch.brix.gql.client.frontify.objects.MoveWorkflowTask moveWorkflowTask;
  /**
   * Remove an existing relation between an `Asset` and a `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeAssetLicense")
  private ch.brix.gql.client.frontify.objects.RemoveAssetLicense removeAssetLicense;
  /**
   * Remove existing `Asset` preview image. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeAssetPreviewImage")
  private ch.brix.gql.client.frontify.objects.RemoveAssetPreviewImage removeAssetPreviewImage;
  /**
   * **BETA** Remove existing relations between `Asset` items. The `relatedAssetIds` input field list is limited to 100 ids per request and cannot contain the same `assetId` input field value. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeAssetRelations")
  private ch.brix.gql.client.frontify.objects.RemoveAssetRelations removeAssetRelations;
  /**
   * Remove existing `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeAssetTags")
  private ch.brix.gql.client.frontify.objects.RemoveAssetTags removeAssetTags;
  /**
   * Remove `Assets` from the existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeCollectionAssets")
  private ch.brix.gql.client.frontify.objects.RemoveCollectionAssets removeCollectionAssets;
  /**
   * Remove `CustomMetadata` values from a supported parent (`Asset` | `WorkspaceProject`). Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  @com.google.gson.annotations.SerializedName("removeCustomMetadata")
  private ch.brix.gql.client.frontify.objects.RemoveCustomMetadata removeCustomMetadata;
  /**
   * Remove options from an existing `SELECT` or `MULTISELECT` type `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeCustomMetadataPropertyOptions")
  private ch.brix.gql.client.frontify.objects.RemoveCustomMetadataPropertyOptions removeCustomMetadataPropertyOptions;
  /**
   * **DEPRECATED** Remove existing `MetadataField` value.Existing relations to that `MetadataField` with the same value will be automatically removed.Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`. This field will be removed. Use `removeCustomMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `removeCustomMetadata` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("removeMetadataValue")
  private ch.brix.gql.client.frontify.objects.RemoveMetadataValue removeMetadataValue;
  /**
   * **BETA** Remove a `WorkflowChecklistItem`.Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeWorkflowChecklistItem")
  private ch.brix.gql.client.frontify.objects.RemoveWorkflowChecklistItem removeWorkflowChecklistItem;
  /**
   * **BETA** Remove a `WorkflowChecklistPreset`.Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeWorkflowChecklistPreset")
  private ch.brix.gql.client.frontify.objects.RemoveWorkflowChecklistPreset removeWorkflowChecklistPreset;
  /**
   * **BETA** Remove assignees from an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeWorkflowStatusAssignees")
  private ch.brix.gql.client.frontify.objects.RemoveWorkflowStatusAssignees removeWorkflowStatusAssignees;
  /**
   * **BETA** Remove assignees from an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("removeWorkflowTaskAssignees")
  private ch.brix.gql.client.frontify.objects.RemoveWorkflowTaskAssignees removeWorkflowTaskAssignees;
  /**
   * Export `CreativeTemplate` with provided parameters. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("exportCreative")
  private ch.brix.gql.client.frontify.objects.ExportCreative exportCreative;
  /**
   * Reopens a resolved `AssetComment`. Requires `basic:write` scope to be accessible and `Comment` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("reopenAssetComment")
  private ch.brix.gql.client.frontify.objects.ReopenAssetComment reopenAssetComment;
  /**
   * Replace an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("replaceAsset")
  private ch.brix.gql.client.frontify.objects.ReplaceAsset replaceAsset;
  /**
   * Add a new reply to an existing `Asset` `Comment`. Requires `basic:write` scope to be accessible and `Asset` permission level `COMMENT`.
   */
  @com.google.gson.annotations.SerializedName("replyToComment")
  private ch.brix.gql.client.frontify.objects.ReplyToComment replyToComment;
  /**
   * Resolve an open `AssetComment`. Requires `basic:write` scope to be accessible and `Comment` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("resolveAssetComment")
  private ch.brix.gql.client.frontify.objects.ResolveAssetComment resolveAssetComment;
  /**
   * **BETA** Set `CustomMetadataProperty` values to any supported parent (`WorkspaceProject` | `Asset`). Attention: Existing `CustomMetadataProperty` values for the selected parents will be overwritten and/or removed. Requires `basic:write` scope to be accessible and permission level `EDIT` for the respective parent.
   */
  @com.google.gson.annotations.SerializedName("setCustomMetadata")
  private ch.brix.gql.client.frontify.objects.SetCustomMetadata setCustomMetadata;
  /**
   * Replace the existing set of the `Assets` in the `Collection` with the new set of the `Assets`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("setCollectionAssets")
  private ch.brix.gql.client.frontify.objects.SetCollectionAssets setCollectionAssets;
  /**
   * Sync `Asset` tags. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("syncAssetTags")
  private ch.brix.gql.client.frontify.objects.SyncAssetTags syncAssetTags;
  /**
   * Uninstall `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("uninstallWebhook")
  private ch.brix.gql.client.frontify.objects.UninstallWebhook uninstallWebhook;
  /**
   * Update an existing `Asset`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateAsset")
  private ch.brix.gql.client.frontify.objects.UpdateAsset updateAsset;
  /**
   * Update an existing `Collection`. Requires `basic:write` scope to be accessible and `Collection` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateCollection")
  private ch.brix.gql.client.frontify.objects.UpdateCollection updateCollection;
  /**
   * Update an existing `CustomMetadataProperty`. RequiresRequires `basic:write` scope to be accessible and `CustomMetadataProperty` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateCustomMetadataProperty")
  private ch.brix.gql.client.frontify.objects.UpdateCustomMetadataProperty updateCustomMetadataProperty;
  /**
   * Update an existing `Folder`. Requires `basic:write` scope to be accessible and `Folder` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateFolder")
  private ch.brix.gql.client.frontify.objects.UpdateFolder updateFolder;
  /**
   * **BETA** Update an existing `WorkflowChecklistItem`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateWorkflowChecklistItem")
  private ch.brix.gql.client.frontify.objects.UpdateWorkflowChecklistItem updateWorkflowChecklistItem;
  /**
   * **BETA** Update an existing `WorkflowChecklistPreset`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateWorkflowChecklistPreset")
  private ch.brix.gql.client.frontify.objects.UpdateWorkflowChecklistPreset updateWorkflowChecklistPreset;
  /**
   * **BETA** Update an existing `WorkflowStatus`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateWorkflowStatus")
  private ch.brix.gql.client.frontify.objects.UpdateWorkflowStatus updateWorkflowStatus;
  /**
   * **BETA** Update an existing `WorkflowTask`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateWorkflowTask")
  private ch.brix.gql.client.frontify.objects.UpdateWorkflowTask updateWorkflowTask;
  /**
   * **BETA** Create a new `Brand`. Requires `basic:write` scope to be accessible and `Account` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("createBrand")
  private ch.brix.gql.client.frontify.objects.CreateBrand createBrand;
  /**
   * **BETA** Delete an existing `Brand`. Requires `basic:write` scope to be accessible and `Brand` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("deleteBrand")
  private ch.brix.gql.client.frontify.objects.DeleteBrand deleteBrand;
  /**
   * **BETA** Update an existing `Brand`. Requires `basic:write` scope to be accessible and `Brand` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("updateBrand")
  private ch.brix.gql.client.frontify.objects.UpdateBrand updateBrand;
  /**
   * Upload a new file. Requires `basic:write` scope to be accessible<br><br>Generates a temporary unique File ID and a list of presigned Urls to upload a binary file in multiple parts. The Id can be used, after the upload is completed, to permanently link the file to a specific type (ie `Asset`, `Attachment`, `Revision) through a different mutation.<br><br>When `chunkSize` is provided as `null` (to be the future default), the number of upload parts and thus their corresponding part size will be computed dynamically based on the specified file size, following these rules:<br>- Maxmum of 1000 parts.<br>- For files of 5TB (maximum): 1000 parts of 5GB each.<br>- For files less than 15MB: 1 single part of 15MB.<br>- Otherwise: an inclusive range of [1, 1000] parts of [15MB, 5GB] each.
   */
  @com.google.gson.annotations.SerializedName("uploadFile")
  private ch.brix.gql.client.frontify.objects.UploadFile uploadFile;
  /**
   * Cancels `CreativeJobs` by provided parameters. `CreativeJob` can be canceled prior to the `RENDERING` status. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  @com.google.gson.annotations.SerializedName("cancelExportCreatives")
  private ch.brix.gql.client.frontify.objects.CancelExportCreatives cancelExportCreatives;
}
