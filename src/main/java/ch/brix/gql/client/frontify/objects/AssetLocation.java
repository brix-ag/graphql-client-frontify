package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetLocation {
  /**
   * `Brand` location of the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("brand")
  private ch.brix.gql.client.frontify.objects.AssetLocationBrand brand;
  /**
   * `Library` location of the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("library")
  private ch.brix.gql.client.frontify.objects.AssetLocationLibrary library;
  /**
   * `WorkspaceProject` location of the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("workspaceProject")
  private ch.brix.gql.client.frontify.objects.AssetLocationWorkspaceProject workspaceProject;
  /**
   * `Folder` location of the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("folder")
  private ch.brix.gql.client.frontify.objects.AssetLocationFolder folder;
}
