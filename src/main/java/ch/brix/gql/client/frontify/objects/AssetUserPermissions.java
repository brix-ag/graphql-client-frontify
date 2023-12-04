package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetUserPermissions {
  /**
   * Check if current user has `Asset` editing permissions for a specific `Asset`.
   */
  @com.google.gson.annotations.SerializedName("canEdit")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canEdit;
  /**
   * Check if current user has `Asset` deleting permissions for a specific `Asset`.
   */
  @com.google.gson.annotations.SerializedName("canDelete")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canDelete;
  /**
   * Check if current user has `Asset` download permissions for a specific `Asset`.
   */
  @com.google.gson.annotations.SerializedName("canDownload")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canDownload;
  /**
   * Check if current user has `Comment` creation permissions for a specific `Asset`.
   */
  @com.google.gson.annotations.SerializedName("canComment")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canComment;
}
