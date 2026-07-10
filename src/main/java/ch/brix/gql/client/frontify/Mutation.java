package ch.brix.gql.client.frontify;

public class Mutation {
  /**
   * Add a relation between an existing `Asset` and `License`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_addAssetLicense addAssetLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_addAssetLicense());
  }
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
   * **DEPRECATED** Create a new `Project` `MetadataField` with your desired configuration. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`. This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2026-07-01
   * This field will be removed. Use `createCustomMetadataProperty` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public static ch.brix.gql.client.frontify.builders.RootMutation_createMetadataField createMetadataField() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_createMetadataField());
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
   * Delete an existing `Attachment`. Requires `basic:write` scope to be accessible and `Asset` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteAttachment deleteAttachment() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteAttachment());
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
   * Delete an existing `Project` `License`. This will remove all relations to that `License`. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_deleteLicense deleteLicense() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_deleteLicense());
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
   * Upload a new file. Requires `basic:write` scope to be accessible<br><br>Creates a temporary unique file Id and returns presigned URLs for uploading a binary file in multiple parts.<br>After the upload is completed, this Id can be used (**once only**) to permanently link the file to a specific type (e.g., Asset, Attachment, Revision) via another mutation.<br><br>When `chunkSize` is provided as `null` (to be the future default), the number of upload parts and thus their corresponding part size will be computed dynamically based on the specified file size, following these rules:<br>- Maxmum of 1000 parts.<br>- For files of 5TB (maximum): 1000 parts of 5GB each.<br>- For files less than 15MB: 1 single part of 15MB.<br>- Otherwise: an inclusive range of [1, 1000] parts of [15MB, 5GB] each.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_uploadFile uploadFile() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_uploadFile());
  }
  /**
   * Cancels `CreativeJobs` by provided parameters. `CreativeJob` can be canceled prior to the `RENDERING` status. Requires `basic:write` scope to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_cancelExportCreatives cancelExportCreatives() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_cancelExportCreatives());
  }
  /**
   * Publish a marketplace app with the specified release notes and availability.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_publishMarketplaceApp publishMarketplaceApp() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_publishMarketplaceApp());
  }
  /**
   * Install `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_installProjectWebhook installProjectWebhook() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_installProjectWebhook());
  }
  /**
   * Uninstall `Webhook`. Requires `basic:write` and `webhook:write` scopes to be accessible and `Project` permission level `EDIT`.
   */
  public static ch.brix.gql.client.frontify.builders.RootMutation_uninstallWebhook uninstallWebhook() {
    return ch.brix.gql.client.CallModifier.makeMutation(new ch.brix.gql.client.frontify.builders.RootMutation_uninstallWebhook());
  }
}
