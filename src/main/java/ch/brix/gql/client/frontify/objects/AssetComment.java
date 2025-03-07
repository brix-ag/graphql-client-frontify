package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetComment implements ch.brix.gql.client.frontify.interfaces.Node, ch.brix.gql.client.frontify.interfaces.Comment {
  /**
   * `AssetComment` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `User` who created the `AssetComment`.
   */
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * `DateTime` of the `AssetComment`'s creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * `User` who last modified the `AssetComment`.
   */
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * `DateTime` of the `AssetComment`'s last modification.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * The content of the `AssetComment`. Contains `User` mentions in the format `@[user:USER_ID].`
   */
  @com.google.gson.annotations.SerializedName("content")
  private ch.brix.gql.client.frontify.scalars.StringScalar content;
  /**
   * Mentioned `User` list in the `content` field.
   */
  @com.google.gson.annotations.SerializedName("mentionedUsers")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.User.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.User> mentionedUsers;
  /**
   * Indicates if an `AssetComment` is resolved or not.
   */
  @com.google.gson.annotations.SerializedName("isResolved")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isResolved;
  /**
   * `AssetComment`'s `AssetCommentReplyItems` list.
   */
  @com.google.gson.annotations.SerializedName("replies")
  private ch.brix.gql.client.frontify.objects.AssetCommentReplyItems replies;
  /**
   * The `AssetComment` `Marking` if it exists.
   */
  @com.google.gson.annotations.SerializedName("marking")
  private ch.brix.gql.client.frontify.interfaces.Marking marking;
  /**
   * `AssetComment` permissions of the current `User`.
   */
  @com.google.gson.annotations.SerializedName("currentUserPermissions")
  private ch.brix.gql.client.frontify.objects.AssetCommentUserPermissions currentUserPermissions;
}
