package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetCommentUserPermissions {
  /**
   * Check if the current user can edit this `AssetComment`.
   */
  @com.google.gson.annotations.SerializedName("canEdit")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canEdit;
  /**
   * Check if the current user can delete this `AssetComment`.
   */
  @com.google.gson.annotations.SerializedName("canDelete")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canDelete;
  /**
   * Check if the current user can reply to this `AssetComment`.
   */
  @com.google.gson.annotations.SerializedName("canReply")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canReply;
}
