package ch.brix.gql.client.frontify.interfaces;

/**
 * `LibraryInterface` for `Library` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.DocumentLibrary.class, ch.brix.gql.client.frontify.objects.IconLibrary.class, ch.brix.gql.client.frontify.objects.LogoLibrary.class, ch.brix.gql.client.frontify.objects.MediaLibrary.class})
public interface Library {
  /**
   * `Library` Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * `Library` name.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
  /**
   * `Library` color.
   */
  ch.brix.gql.client.frontify.objects.RgbaColor getColor();
  /**
   * **DEPRECATED** Amount of `Assets` contained in this `Library`. This field will be removed. Use `assets.total` instead. | Date: 2024-07-01
   * This field will be removed. Use `assets.total` instead. | Date: 2024-07-01
   */
  @java.lang.Deprecated
  ch.brix.gql.client.frontify.scalars.IntScalar getAssetCount();
  /**
   * **DEPRECATED** Retrieve list of all `MetadataFields` belonging to this `Library`. This field will be removed. Use `customMetadataProperties` instead. | Date: 2026-07-01
   * This field will be removed. Use `customMetadataProperties` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.MetadataField.class)
  java.util.List<ch.brix.gql.client.frontify.objects.MetadataField> getMetadataFields();
  /**
   * Search or list `Assets` in this `Library`.
   */
  ch.brix.gql.client.frontify.objects.AssetItems getAssets();
  /**
   * List `Collection` type items within a `Library`.
   */
  ch.brix.gql.client.frontify.objects.CollectionItems getCollections();
  /**
   * Browse the `Library`'s `SubFolderItems` and `AssetItems`.
   */
  ch.brix.gql.client.frontify.objects.LibraryRootFolder getBrowse();
  /**
   * `Library` collaborators.
   */
  ch.brix.gql.client.frontify.objects.LibraryCollaborators getCollaborators();
  /**
   * Check current `User` permissions in a specific `Library`.
   */
  ch.brix.gql.client.frontify.objects.LibraryUserPermissions getCurrentUserPermissions();
  /**
   * **BETA** The `Workflow` belonging to the given `Library`.
   */
  ch.brix.gql.client.frontify.objects.Workflow getWorkflow();
  /**
   * List of `CustomMetadataProperty` items belonging to a `Library`.
   */
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CustomMetadataProperty.class)
  java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataProperty> getCustomMetadataProperties();
  /**
   * Search this `Library`'s/`Workspace`'s `Assets` with fully typed filters. Backed by our search index rather than the primary database — results are eventually consistent, so an asset just created, edited, or deleted can take a few minutes (up to around 10) to be reflected.
   */
  ch.brix.gql.client.frontify.objects.LibrarySearchAssetsResult getSearchAssets();
  /**
   * Fetch `Assets` in this `Library` by their externalId. Requires edit access to the `Library`.
   */
  ch.brix.gql.client.frontify.objects.LibraryAssetsByExternalIdResult getAssetsByExternalId();
  /**
   * Retrieve list of all `Licenses` belonging to this `Library`.
   */
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.License.class)
  java.util.List<ch.brix.gql.client.frontify.objects.License> getLicenses();
}
