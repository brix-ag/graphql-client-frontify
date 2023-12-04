package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class EditComment {
  /**
   * `Comment` details.
   */
  @com.google.gson.annotations.SerializedName("comment")
  private ch.brix.gql.client.frontify.interfaces.Comment comment;
}
