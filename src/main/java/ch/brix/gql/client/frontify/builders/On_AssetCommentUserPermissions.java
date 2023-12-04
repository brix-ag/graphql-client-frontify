package ch.brix.gql.client.frontify.builders;

public class On_AssetCommentUserPermissions extends ch.brix.gql.client.TypeBuilder {
  public On_AssetCommentUserPermissions() {
    super(new ch.brix.gql.client.On("AssetCommentUserPermissions"));
  }
  /**
   * Check if the current user can edit this `AssetComment`.
   */
  public On_AssetCommentUserPermissions canEdit() {
    _add_field("canEdit");
    return this;
  }
  /**
   * Check if the current user can delete this `AssetComment`.
   */
  public On_AssetCommentUserPermissions canDelete() {
    _add_field("canDelete");
    return this;
  }
  /**
   * Check if the current user can reply to this `AssetComment`.
   */
  public On_AssetCommentUserPermissions canReply() {
    _add_field("canReply");
    return this;
  }
}
