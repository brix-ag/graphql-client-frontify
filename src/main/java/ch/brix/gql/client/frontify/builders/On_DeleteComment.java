package ch.brix.gql.client.frontify.builders;

public class On_DeleteComment extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteComment() {
    super(new ch.brix.gql.client.On("DeleteComment"));
  }
  /**
   * The Id of the deleted `Comment`.
   */
  public On_DeleteComment id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** `Comment` details. This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_DeleteComment comment(DeleteComment_comment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
