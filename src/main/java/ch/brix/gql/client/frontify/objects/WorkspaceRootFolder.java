package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class WorkspaceRootFolder {
  /**
   * **DEPRECATED** The `SubFolderItems` of the current `Library`/`Workspace`. This field will be removed. Use `folders` instead. | Date: 2024-07-01T00:00:00.000+00:00
   * This field will be removed. Use `folders` instead. | Date: 2024-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("subFolders")
  private ch.brix.gql.client.frontify.objects.SubFolderItems subFolders;
  /**
   * The `FolderItems` of the current `Library`/`Workspace`.
   */
  @com.google.gson.annotations.SerializedName("folders")
  private ch.brix.gql.client.frontify.objects.FolderItems folders;
  /**
   * `Library`/`Workspace`'s `AssetItems` list.
   */
  @com.google.gson.annotations.SerializedName("assets")
  private ch.brix.gql.client.frontify.objects.AssetItems assets;
}
