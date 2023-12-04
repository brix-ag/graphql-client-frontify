package ch.brix.gql.client.frontify.builders;

public class On_AssetCommentReply extends ch.brix.gql.client.TypeBuilder {
  public On_AssetCommentReply() {
    super(new ch.brix.gql.client.On("AssetCommentReply"));
  }
  /**
   * The id of the current `AssetCommentReply`.
   */
  public On_AssetCommentReply id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` representing the creator.
   */
  public On_AssetCommentReply creator(AssetCommentReply_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `DateTime` of creation.
   */
  public On_AssetCommentReply createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` representing the last modifier.
   */
  public On_AssetCommentReply modifier(AssetCommentReply_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `DateTime` of the last modification.
   */
  public On_AssetCommentReply modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * The content of the `AssetCommentReply`. Contains `User` mentions in the format `@[user:USER_ID].`
   */
  public On_AssetCommentReply content() {
    _add_field("content");
    return this;
  }
  /**
   * Mentioned `User` list in the `content` field.
   */
  public On_AssetCommentReply mentionedUsers(AssetCommentReply_mentionedUsers callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
