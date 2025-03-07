package ch.brix.gql.client.frontify.interfaces;

/**
 * `CommentInterface` for `Comment` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.AssetComment.class, ch.brix.gql.client.frontify.objects.AssetCommentReply.class})
public interface Comment {
  /**
   * The `Comment` identifier.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * The `User` representing the `Comment` creator.
   */
  ch.brix.gql.client.frontify.interfaces.User getCreator();
  /**
   * The `DateTime` of the `Comment` creation.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getCreatedAt();
  /**
   * The last `User` to modify the `Comment`.
   */
  ch.brix.gql.client.frontify.interfaces.User getModifier();
  /**
   * The `DateTime` of the `Comment` last modification.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getModifiedAt();
  /**
   * The `Comment` message.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getContent();
}
