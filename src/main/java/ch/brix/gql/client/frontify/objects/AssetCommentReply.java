package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetCommentReply implements ch.brix.gql.client.frontify.interfaces.Comment {
  /**
   * The id of the current `AssetCommentReply`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * The `User` representing the creator.
   */
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * The `DateTime` of creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * The `User` representing the last modifier.
   */
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * The `DateTime` of the last modification.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * The content of the `AssetCommentReply`. Contains `User` mentions in the format `@[user:USER_ID].`
   */
  @com.google.gson.annotations.SerializedName("content")
  private ch.brix.gql.client.frontify.scalars.StringScalar content;
  /**
   * Mentioned `User` list in the `content` field.
   */
  @com.google.gson.annotations.SerializedName("mentionedUsers")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.User.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.User> mentionedUsers;
}
