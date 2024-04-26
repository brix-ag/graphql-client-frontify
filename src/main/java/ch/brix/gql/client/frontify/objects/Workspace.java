package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Workspace implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `Library`/`Workspace` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `Library`/`Workspace` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `Library`/`Workspace` color.
   */
  @com.google.gson.annotations.SerializedName("color")
  private ch.brix.gql.client.frontify.objects.RgbaColor color;
  /**
   * **DEPRECATED** Amount of `Assets` contained in the `Library`/`Workspace`. This field will be removed. Use `assets`.`total` instead. | Date: 2024-07-01T00:00:00.000+00:00
   * This field will be removed. Use `assets`.`total` instead. | Date: 2024-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("assetCount")
  private ch.brix.gql.client.frontify.scalars.IntScalar assetCount;
  /**
   * Search or list `Assets` in the `Library`/`Workspace`.
   */
  @com.google.gson.annotations.SerializedName("assets")
  private ch.brix.gql.client.frontify.objects.AssetItems assets;
  /**
   * `Library`/`Workspace` `License` items list.
   */
  @com.google.gson.annotations.SerializedName("licenses")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.License.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.License> licenses;
  /**
   * **DEPRECATED** `Library`/`Workspace` `MetadataField` items list. This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-01-01T00:00:00.000+00:00
   * This field will be removed. Use `customMetadataProperties` instead. | Date: 2025-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("metadataFields")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.MetadataField.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.MetadataField> metadataFields;
  /**
   * **BETA** The `Workflow` belonging to the given `Library`/`Workspace`.
   */
  @com.google.gson.annotations.SerializedName("workflow")
  private ch.brix.gql.client.frontify.objects.Workflow workflow;
  /**
   * Browse the `Workspace`'s `SubFolderItems` and `AssetItems`.
   */
  @com.google.gson.annotations.SerializedName("browse")
  private ch.brix.gql.client.frontify.objects.WorkspaceRootFolder browse;
  /**
   * `Workspace` collaborators.
   */
  @com.google.gson.annotations.SerializedName("collaborators")
  private ch.brix.gql.client.frontify.objects.WorkspaceCollaborators collaborators;
  /**
   * `Workspace` permissions of the current `User`.
   */
  @com.google.gson.annotations.SerializedName("currentUserPermissions")
  private ch.brix.gql.client.frontify.objects.WorkspaceUserPermissions currentUserPermissions;
  /**
   * **BETA** `Workspace` state.
   */
  @com.google.gson.annotations.SerializedName("isArchived")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isArchived;
  /**
   * List of `CustomMetadataProperty` items and values associated to `Workspace`.
   */
  @com.google.gson.annotations.SerializedName("customMetadata")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CustomMetadata.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadata> customMetadata;
}
