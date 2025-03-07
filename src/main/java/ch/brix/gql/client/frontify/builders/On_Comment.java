package ch.brix.gql.client.frontify.builders;

public class On_Comment extends ch.brix.gql.client.TypeBuilder {
  public On_Comment() {
    super(new ch.brix.gql.client.On("Comment"));
  }
  /**
   * The `Comment` identifier.
   */
  public On_Comment id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` representing the `Comment` creator.
   */
  public On_Comment creator(Comment_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `DateTime` of the `Comment` creation.
   */
  public On_Comment createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The last `User` to modify the `Comment`.
   */
  public On_Comment modifier(Comment_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `DateTime` of the `Comment` last modification.
   */
  public On_Comment modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * The `Comment` message.
   */
  public On_Comment content() {
    _add_field("content");
    return this;
  }
}
