package ch.brix.gql.client.frontify.builders;

public class On_AssetComment extends ch.brix.gql.client.TypeBuilder {
  public On_AssetComment() {
    super(new ch.brix.gql.client.On("AssetComment"));
  }
  /**
   * `AssetComment` id.
   */
  public On_AssetComment id() {
    _add_field("id");
    return this;
  }
  /**
   * `User` who created the `AssetComment`.
   */
  public On_AssetComment creator(AssetComment_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `AssetComment`'s creation.
   */
  public On_AssetComment createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * `User` who last modified the `AssetComment`.
   */
  public On_AssetComment modifier(AssetComment_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `AssetComment`'s last modification.
   */
  public On_AssetComment modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * The content of the `AssetComment`. Contains `User` mentions in the format `@[user:USER_ID].`
   */
  public On_AssetComment content() {
    _add_field("content");
    return this;
  }
  /**
   * Mentioned `User` list in the `content` field.
   */
  public On_AssetComment mentionedUsers(AssetComment_mentionedUsers callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Indicates if an `AssetComment` is resolved or not.
   */
  public On_AssetComment isResolved() {
    _add_field("isResolved");
    return this;
  }
  /**
   * `AssetComment`'s `AssetCommentReplyItems` list.
   */
  public On_AssetComment replies(AssetComment_replies callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `AssetComment` `Marking` if it exists.
   */
  public On_AssetComment marking(AssetComment_marking callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `AssetComment` permissions of the current `User`.
   */
  public On_AssetComment currentUserPermissions(AssetComment_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
