package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class SubFolder implements ch.brix.gql.client.frontify.interfaces.Node, ch.brix.gql.client.frontify.interfaces.Folder {
  /**
   * `SubFolder` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `SubFolder` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * The `User` who created the `SubFolder`.
   */
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * `DateTime` of the `SubFolder` creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * The `User` who last modified the `SubFolder`.
   */
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * `DateTime` of the last `SubFolder` modification.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * A list of `Breadcrumb` items representing the parent folders structure for the current `SubFolder`.
   */
  @com.google.gson.annotations.SerializedName("breadcrumbs")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Breadcrumb.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.Breadcrumb> breadcrumbs;
  /**
   * **DEPRECATED** The `SubFolderItems` of the current `SubFolder`. This field will be removed. Use `folders` instead. | Date: 2024-07-01T00:00:00.000+00:00
   * This field will be removed. Use `folders` instead. | Date: 2024-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("subFolders")
  private ch.brix.gql.client.frontify.objects.SubFolderItems subFolders;
  /**
   * The `FolderItems` of the current `Folder`.
   */
  @com.google.gson.annotations.SerializedName("folders")
  private ch.brix.gql.client.frontify.objects.FolderItems folders;
  /**
   * The `AssetItems` in the current `SubFolder`.
   */
  @com.google.gson.annotations.SerializedName("assets")
  private ch.brix.gql.client.frontify.objects.AssetItems assets;
}
