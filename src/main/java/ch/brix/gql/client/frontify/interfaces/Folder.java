package ch.brix.gql.client.frontify.interfaces;

/**
 * `FolderInterface` for `Folder` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.SubFolder.class})
public interface Folder {
  /**
   * `Folder` Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * `Folder` name.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
  /**
   * The `User` who created the `Folder`.
   */
  ch.brix.gql.client.frontify.interfaces.User getCreator();
  /**
   * `DateTime` of the `Folder` creation.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getCreatedAt();
  /**
   * The `User` who last modified the `Folder`.
   */
  ch.brix.gql.client.frontify.interfaces.User getModifier();
  /**
   * `DateTime` of the last `Folder` modification.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getModifiedAt();
  /**
   * A list of `Breadcrumb` items representing the parent folders structure for the current `SubFolder`.
   */
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Breadcrumb.class)
  java.util.List<ch.brix.gql.client.frontify.objects.Breadcrumb> getBreadcrumbs();
  /**
   * **DEPRECATED** The `SubFolderItems` of the current `Library`/`Workspace`/`SubFolder`. This field will be removed. Use `folders` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `folders` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  ch.brix.gql.client.frontify.objects.SubFolderItems getSubFolders();
  /**
   * The `FolderItems` of the current `Library`/`Workspace`/`Folder`.
   */
  ch.brix.gql.client.frontify.objects.FolderItems getFolders();
  /**
   * The `AssetItems` in the current `Library`/`Workspace`/`Folder`.
   */
  ch.brix.gql.client.frontify.objects.AssetItems getAssets();
}
