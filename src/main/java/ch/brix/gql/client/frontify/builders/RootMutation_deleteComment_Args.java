package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteComment_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `DeleteComment` input argument.
   * Default value: null
   */
  public RootMutation_deleteComment_Args input(ch.brix.gql.client.frontify.input_objects.DeleteCommentInput value) {
    _add_arg("input", value);
    return this;
  }
}
