package ch.brix.gql.client.frontify.builders;

public class RootMutation_replyToComment_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `ReplyToComment` input argument.
   * Default value: null
   */
  public RootMutation_replyToComment_Args input(ch.brix.gql.client.frontify.input_objects.ReplyToCommentInput value) {
    _add_arg("input", value);
    return this;
  }
}
