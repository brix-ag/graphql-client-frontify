package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ReplyToComment {
  /**
   * `AssetCommentReply` details.
   */
  @com.google.gson.annotations.SerializedName("reply")
  private ch.brix.gql.client.frontify.objects.AssetCommentReply reply;
}
