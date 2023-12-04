package ch.brix.gql.client.frontify.builders;

public class RootMutation_createAssetComment_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `CreateAssetComment` input argument.
   * Default value: null
   */
  public RootMutation_createAssetComment_Args input(ch.brix.gql.client.frontify.input_objects.CreateAssetCommentInput value) {
    _add_arg("input", value);
    return this;
  }
}
