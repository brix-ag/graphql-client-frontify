package ch.brix.gql.client.frontify.builders;

public class RootMutation_editComment_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `EditComment` input argument.
   * Default value: null
   */
  public RootMutation_editComment_Args input(ch.brix.gql.client.frontify.input_objects.EditCommentInput value) {
    _add_arg("input", value);
    return this;
  }
}
