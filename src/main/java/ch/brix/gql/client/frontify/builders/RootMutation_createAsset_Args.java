package ch.brix.gql.client.frontify.builders;

public class RootMutation_createAsset_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `CreateAsset` input argument.
   * Default value: null
   */
  public RootMutation_createAsset_Args input(ch.brix.gql.client.frontify.input_objects.CreateAssetInput value) {
    _add_arg("input", value);
    return this;
  }
}
