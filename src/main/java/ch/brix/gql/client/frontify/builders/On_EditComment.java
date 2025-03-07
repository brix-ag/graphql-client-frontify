package ch.brix.gql.client.frontify.builders;

public class On_EditComment extends ch.brix.gql.client.TypeBuilder {
  public On_EditComment() {
    super(new ch.brix.gql.client.On("EditComment"));
  }
  /**
   * `Comment` details.
   */
  public On_EditComment comment(EditComment_comment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
